organization := "$org_id$"

name := "$name$"

version := "$version$"

seq(sbtappengine.AppenginePlugin.webSettings:  _*)

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-jetty" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-spec" % "$unfiltered_version$" % "test"
  // uncomment the following line for persistence
  //, val jdo = "javax.jdo" % "jdo2-api" % "2.3-ea"
)

resolvers ++= Seq(
 "jboss" at  "https://repository.jboss.org/nexus/content/groups/public/"
  // app engine repo, uncomment the following line for persistence resolver
  //, "nexus" at "http://maven-gae-plugin.googlecode.com/svn/repository/"
)




