ThisBuild / scalaVersion := "3.3.1"
ThisBuild / organization := "com.williamareynolds"

lazy val library = crossProject(JSPlatform, JVMPlatform)
  .settings(
    libraryDependencies ++= Seq(
      "dev.zio" %%% "zio" % "2.0.16",
      "dev.zio" %%% "zio-schema" % "0.4.13",
      "dev.zio" %%% "zio-schema-json" % "0.4.13",
      "dev.zio" %%% "zio-schema-derivation" % "0.4.13",
      "io.github.cquiroz" %%% "scala-java-time" % "2.5.0",
      "dev.zio" %%% "zio-test" % "2.0.16" % Test,
      "dev.zio" %%% "zio-test-sbt" % "2.0.16" % Test,
      "dev.zio" %%% "zio-test-magnolia" % "2.0.16" % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
  .jsSettings(
    name := "library-js"
  )
  .jvmSettings(
    name := "library-jvm"
  )
