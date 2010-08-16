import sbt._

class UnfilteredTemplate(info: ProjectInfo) extends DefaultProject(info) {
  def templateSourcePath = (mainSourcePath / "g8") ##
  def templateSources = descendents(templateSourcePath, "*")

  def defaultProperties = templateSourcePath / "default.properties"

  def templateOutput = outputPath / "g8"

  lazy val writeTemplates = task { None } dependsOn (
    templateSources.get.filter(!_.isDirectory).map { in =>
      templateTask(in, Path.fromString(templateOutput, in.relativePath))
    }.toSeq: _*
  )
  def templateTask(in: Path, out: Path) = fileTask(out from in) {
    FileUtilities.write(out.asFile, log) { write =>
      write write scala.io.Source.fromFile(in.asFile).mkString("")
      None
    }
  }
}
