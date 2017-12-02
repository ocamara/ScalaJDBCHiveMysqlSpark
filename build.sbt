name := "FormationHive"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.1.0"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.hive" % "hive-jdbc" % "1.2.2",
  "org.apache.hadoop" % "hadoop-common" % "2.8.1",
    // https://mvnrepository.com/artifact/mysql/mysql-connector-java
   "mysql" % "mysql-connector-java" % "5.0.5"
)



        