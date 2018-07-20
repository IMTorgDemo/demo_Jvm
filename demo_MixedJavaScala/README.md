# Mixed Java-Scala Spring, Gradle Boilerplate 

This project is boilerplate code for a Spring application with mixed Java-Scala code.  
It is focused on Intellij IDE with multiple methods for running tests.  
Alternative ways to run Scala in a Java project include:

* separate packages, within the same project
* separate projects, and gradle builds, within the same repo
* microservices where each project is built individually



# Run 

The `gradle.build` file compiles Scala code, first, so that Java can use the classes when it builds.  
To run the application:

```aidl
gradle clean bootRun
```


# Tests

Three different test methods are performed.  They are set to fail, in order to display the output.  Otherwise, they would simply exit with zero code status:

* DemoApplicationTests.java - simply runs Scala in jUnit as if it were Java (run with green arrows)
* BigClassTest.scala - runs jUnit from Scala code (run with green arrows)
* BigClassScalaTest.scala - run `scalatest` within Scala with jUnit runner (run with left-click, menu option)



# Style

Scala style, within a java application, assumes similar style as java:

```aidl
As a rule, files should contain a single logical compilation unit. By “logical” I mean a class, trait or object.
```



# References

* [scalatest](http://www.scalatest.org/)
* [scala with intellij](http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/)
* [using scala code from java](https://lampwww.epfl.ch/~michelou/scala/using-scala-from-java.html)
* [multiple entrypoints](https://dzone.com/articles/scala-in-java-maven-project)
* [style](https://stackoverflow.com/questions/24365548/scala-multiple-objects-and-classes-in-a-single-file-or-each-object-class-its-ow)
