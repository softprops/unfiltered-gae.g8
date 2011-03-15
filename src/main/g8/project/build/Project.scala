import sbt._

class Project(info: ProjectInfo) extends AppengineProject(info) with DataNucleus {
  val uf_version = "$unfiltered_version$"

  // unfiltered
  lazy val uff = "net.databinder" %% "unfiltered-filter" % uf_version
  lazy val ufj = "net.databinder" %% "unfiltered-jetty" % uf_version

  // persistence
  // val jdo = "javax.jdo" % "jdo2-api" % "2.3-ea"
  // val appengineRepo = "nexus" at "http://maven-gae-plugin.googlecode.com/svn/repository/"

  // testing
  lazy val uf_spec = "net.databinder" %% "unfiltered-spec" % uf_version % "test"
  lazy val jboss = "JBoss repository" at
    "https://repository.jboss.org/nexus/content/groups/public/"
}
