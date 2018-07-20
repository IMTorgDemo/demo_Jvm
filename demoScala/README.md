# Scala code exercises


# Get started

__Install and begin SBT Project__

This is how a typical project can be started

```
# www.scala-lang.org

brew install sbt@1
brew install scala

/usr/local/opt/scala/libexec/bin/scala --version


mkdir new_project
cd new_project
touch build.sbt		# dependencies
nano build.sbt
sbt update
sbt 
> show scalaVersion
> show full-classpath
> console		# use repl with dependencies

#or just

sbt console

```



__New SBT Demo Project__


```
sbt new scala/hello-world.g8

```



__Java Classpath__

To simply use the `scala-library-2.10.3.jar` with java, check-out the [mvnrepository](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.10.3) download the jar from [here](http://central.maven.org/maven2/org/scala-lang/scala-library/2.10.3/)

Test out with the following code:

```
~$ cd /demoScala/examples
~$ scalac companion.scala
~$ javac -cp $SCALA_HOME/lib/scala-library.jar:. TestCompanion.java
~$ java -cp $SCALA_HOME/lib/scala-library.jar:. TestCompanion
```






# Numerical Libraries

Breeze appears to be the most useful library for data science.  Of course java libraries can be used seamlessly.  This link provides a few interesting Scala libraries, [here](https://medium.com/activewizards-machine-learning-company/top-15-scala-libraries-for-data-science-in-2018-4b2cb5c5367e).  


After creating an sbt project, be sure to place the commands, below, into the `build.sbt` file, for breeze.

```
# basic build.sbt commands for breeze dependencies	
name := "breez-demo"
 
version := "0.2"
 
scalaVersion := "2.10.4"
 
libraryDependencies  ++= Seq(
  // other dependencies here
  "org.scalanlp" %% "breeze" % "0.12",
  // native libraries are not included by default. add this if you want them (as of 0.7)
  // native libraries greatly improve performance, but increase jar sizes. 
  // It also packages various blas implementations, which have licenses that may or may not
  // be compatible with the Apache License. No GPL code, as best I know.
  "org.scalanlp" %% "breeze-natives" % "0.12",
  // the visualization library is distributed separately as well. 
  // It depends on LGPL code.
  "org.scalanlp" %% "breeze-viz" % "0.12"
)

resolvers ++= Seq(
  // other resolvers here
  // if you want to use snapshot builds (currently 0.12-SNAPSHOT), use this.
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)
 
scalacOptions += "-deprecation"
 
initialCommands in console := """
    |import breeze.linalg._
    |""".stripMargin

```






__Scala References__

* [basic start](https://docs.scala-lang.org/getting-started-sbt-track/getting-started-with-scala-and-sbt-on-the-command-line.html)
* [new set project](http://scalatutorials.com/beginner/2013/07/18/getting-started-with-sbt)
* [short, simple demos of the scala lang](https://learnxinyminutes.com/docs/scala/)
* [terse demo of big scala concepts](http://docs.scala-lang.org/tutorials/scala-for-java-programmers.html#functions-are-objects)


__Scala In-Depth__

* [loading libraries](https://keramida.wordpress.com/2013/12/02/using-sbt-to-experiment-with-new-scala-libraries/)
* [thorough, opinionated manual of scala](https://github.com/ghik/opinionated-scala/wiki)
* [scala idioms](http://twitter.github.io/effectivescala/)
* [course: scala](https://www.scala-exercises.org/scala_tutorial/terms_and_types)
* [course: standard library](https://www.scala-exercises.org/std_lib/asserts)
* [in-depth demos](http://twitter.github.io/scala_school/)



__Scala Data Science References__

* [useful data libraries](https://medium.com/activewizards-machine-learning-company/top-15-scala-libraries-for-data-science-in-2018-4b2cb5c5367e)
* [main library: breeze](http://www.scalanlp.org/)
* [breeze](https://github.com/scalanlp/breeze/wiki/Quickstart)
* [breeze: cheatsheet](https://github.com/scalanlp/breeze/wiki/Linear-Algebra-Cheat-Sheet)










END


