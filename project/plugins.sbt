
resolvers += Resolver.url("sbt-plugin-releases",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(
    Resolver.ivyStylePatterns)

resolvers += "Untyped" at "http://repo.untyped.com"

resolvers += Resolver.url("sbt-plugin-releases",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.untyped" %% "sbt-less" % "latest.integration")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.2.0")

addSbtPlugin("in.drajit.sbt" % "sbt-yui-compressor" % "0.2.1")

addSbtPlugin("com.untyped" %% "sbt-js" % "0.5")

//addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.0")

