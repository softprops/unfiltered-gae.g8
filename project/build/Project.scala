import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {
  // unfiltered
  val uf = "net.databinder" %% "unfiltered-server" % "0.1.3-SNAPSHOT"

  // testing
  val snapshots = "Scala Tools Snapshots" at "http://www.scala-tools.org/repo-snapshots/"
  val specs = "org.scala-tools.testing" % "specs" % "1.6.2.1" % "test"
  val databinderNet = "databinder.net repository" at "http://databinder.net/repo"
  val dispatchLiftJson = "net.databinder" %% "dispatch-lift-json" % "0.7.4" % "test" 
}