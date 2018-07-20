# Microservices with Separate Java-Scala Modules 

This is an approach to using Java and Scala in separate modules, as microservices, within the same repo / system.


# Start

Always start from the top-most gradle directory.  The entry-point is `service-java`, and is dependent (with `service-scala`), on `common`.

```aidl
gradle clean services-java:bootRun
```

