# taurus-files-example
Sample SBT project which simulates the problem with taurus files directive while running on blazemeter

# How to run
* sbt "assemblyPackageDependency" gives the jar with all the dependencies which in this case is lift-json jar
* sbt "gatling:package" gives the jar with test classes
* example.yml is the taurus config file

# See it running from docker

* running the oneclick.sh will take you to the docker image
* Once in docker image, cd to /tmp
* bzt example.yml

# Issue
* The example.yml file runs fine when run from docker image
* The same example.yml file fails when run from blazemeter behaves as if it couldn't find the example-deps.jar file even though I upload the jar file to blazemeter



