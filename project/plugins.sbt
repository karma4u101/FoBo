
resolvers += Resolver.url("sbt-plugin-releases",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(
    Resolver.ivyStylePatterns)

resolvers += "Untyped" at "http://repo.untyped.com"

resolvers += Resolver.url("sbt-plugin-releases",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

resolvers += Classpaths.typesafeResolver

//addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.3.3")

//need improvements in build system for this one to work
//addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "0.2.10")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.2.5")

//turned of in 0.13 only works in 0.12 build but no longer needed. 
//addSbtPlugin("in.drajit.sbt" % "sbt-yui-compressor" % "0.2.1")

addSbtPlugin("com.untyped" %% "sbt-js" % "0.6")

//addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

