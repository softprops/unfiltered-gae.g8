import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {
  val uf_version = "$unfiltered_version$"
  
  // unfiltered
  lazy val uf = "net.databinder" %% "$unfiltered_module$" % uf_version

  // testing
  lazy val uf_spec = "net.databinder" %% "unfiltered-spec" % uf_version % "test"
}
