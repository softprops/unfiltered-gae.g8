//https://groups.google.com/forum/#!msg/simple-build-tool/iFzb5ja1cio/2xDj6pqb8xEJ
//resolvers <++= (sbtResolver)(sr => Seq(
//  sr,
//  "Web plugin repo" at "http://siasia.github.com/maven2"
//))

libraryDependencies <++= sbtVersion(v => Seq(
  "com.eed3si9n" %% "sbt-appengine" % "sbt%s_0.2".format(v)
))
