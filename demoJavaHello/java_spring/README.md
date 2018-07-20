# Java Spring Template

[ref: spring initializr](https://code.visualstudio.com/docs/java/java-spring-boot)
[ref: spring helloworld](https://spring.io/guides/gs/spring-boot/#scratch)


__Create Project__

* open palette
* vscode-spring-initializr



__Develop Project__

use `vscode-spring-boot` extension

Add project details to `build.gradle`
```
bootJar {
    baseName = 'gs-spring-boot'
    version =  '0.1.0'
}
```

Also, change dependency from:
`compile('org.springframework.boot:spring-boot-starter')`
`compile('org.springframework.boot:spring-boot-starter-web')`

Add controller class `DemoController.java `

```
package com.example.demo

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
```



__Build and Run__

Use the following

```
gradle build
java -jar build/libs/gs-spring-boot-0.1.0.jar --server.port=8000
```


__Unit Tests__

Add test for each controller

Add integration test



__Debug Project__

[ref: java debugging](https://code.visualstudio.com/docs/java/java-debugging)

