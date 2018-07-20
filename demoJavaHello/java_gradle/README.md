# Project Template

[ref: example](https://spring.io/guides/gs/gradle/)

__Initialize__

```
mkdir -p src/main/java/hello
cd src/main/java/hello
touch HelloWorld.java Greeter.java                      #add code
cd -
gradle init
```

__Build__

```
echo "apply plugin: 'java'" >> build.gradle
gradle build                                            #creates build/ with compiled classes/ and archivers, libs/
```

Add lines to `build.gradle` to make the code runnable
```
apply plugin: 'application'
mainClassName = 'hello.HelloWorld'
```

Run the code with: `gradle run`


__Add Dependencies__

Add source for 3rd party libraries

```build.gradle
repositories {
    mavenCentral()
}
```

declare dependencies in your build.gradle file

```
sourceCompatibility = 1.8
targetCompatibility = 1.8

dependencies {
    compile "joda-time:joda-time:2.2"
}
```

* `compile` - it should be available during compile-time (and if you were building a WAR file, included in the /WEB-INF/libs folder of the WAR)
* `providedCompile` - required for compiling the project code, but that will be provided at runtime by a container running the code (for example, the Java Servlet API)
* `testCompile` - used for compiling and running tests, but not required for building or running the project’s runtime code

name for our JAR artifact (optional): jb-hello-world-gradle-0.1.0.jar
```
jar {
    baseName = 'hello-world-gradle'
    version =  '0.1.0'
}
```

Run the code with: `gradle run`



__Gradle Wrapper__

These scripts allow you to run a Gradle build without requiring that Gradle be installed on your system.

Add the following block to the bottom of your build.gradle

```
  task wrapper(type: Wrapper) {
      gradleVersion = '2.8'
  }
```

Download and initialize the wrapper scripts: `gradle wrapper` to populate gradle/wrapper folder.  This ensures everyone who downloads your project can build it the exact same way (same gradle version), using:

* (linux) `./gradlew build`
* (windows) `./gradlew.bat`


