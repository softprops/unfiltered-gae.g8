import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {
  val uf_version = "0.1.3"
  
  // unfiltered
  lazy val uf = "net.databinder" %% "unfiltered-server" % uf_version

  // testing
  lazy val uf_spec = "net.databinder" %% "unfiltered-spec" % uf_version
}