resolvers += "Web plugin repo" at "http://siasia.github.com/maven2"

libraryDependencies <++= sbtVersion(v => Seq(
  //"com.github.siasia" %% "xsbt-web-plugin" % "0.1.0-%s".format(v),
  "com.eed3si9n" %% "sbt-appengine" % "sbt%s_0.2".format(v)
))
