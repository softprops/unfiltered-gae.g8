resolvers ++= Seq(
  "Web plugin repo" at "http://siasia.github.com/maven2"
)

libraryDependencies <++= sbtVersion(v => Seq(
  "com.eed3si9n" %% "sbt-appengine" % "sbt%s_0.2".format(v)
))
