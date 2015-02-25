name := "LearningSpark"

version := "1.0"

scalaVersion := "2.11.2"

resolvers +=
  "SparkStaging" at "https://repository.apache.org/content/repositories/orgapachespark-1069"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.3.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.3.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.3.0"

