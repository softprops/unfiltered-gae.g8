import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {
  val uf_version = "$ufversion$"
  
  // unfiltered
  lazy val uf = "net.databinder" %% "$ufmodule$" % uf_version

  // testing
  lazy val uf_spec = "net.databinder" %% "unfiltered-spec" % uf_version % "test"
}
