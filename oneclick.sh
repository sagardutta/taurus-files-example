sbt clean
sbt "gatling:package"
sbt "assemblyPackageDependency"
cp target/scala-2.11/taurus-files-example_2.11-0.1-SNAPSHOT-gatling.jar jars/example.jar
cp target/scala-2.11/taurus-files-example-assembly-0.1-SNAPSHOT-deps.jar jars/example-deps.jar
docker run -it -v `pwd`/jars/:/tmp  sagardutta/taurus bash
