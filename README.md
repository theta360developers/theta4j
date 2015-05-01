# theta4j

[![Build Status][travis-image]][travis-url] [![Coverage][sonar-image]][sonar-url] [![Chat][gitter-image]][gitter-url]

[travis-url]:https://travis-ci.org/shrhdk/theta4j
[travis-image]:https://travis-ci.org/shrhdk/theta4j.svg?branch=master
[sonar-url]:http://sonar.shiro.be/dashboard/index/theta4j:lib
[sonar-image]:https://img.shields.io/sonar/http/sonar.shiro.be/theta4j:lib/coverage.svg?style=flat
[gitter-url]:https://gitter.im/shrhdk/theta4j?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge
[gitter-image]:https://badges.gitter.im/Join%20Chat.svg

RICOH THETA SDK for Java.

theta4j aims the followings compared with the official SDK.

- Open Source
- Maven Integration

## Requirements

- JDK 1.7

## Documents

- [Tutorial](doc/tutorial.md)
- [Javadoc](https://github.com/shrhdk/theta4j/releases)
- [Sample Application](sample/src/main/java/org/theta4j/sample/ThetaCapturer.java)
- [Contribution Guide](doc/contribution.md)

## Set up

Add codes below to "build.gradle" if you are using Gradle.

```gradle
repositories {
    mavenCentral()
}

dependencies {
    compile 'org.theta4j:theta4j:0.4.0'
}
```

## License

Apache License, Version 2.0

## Credits

This software contains works which are distributed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).

- [Apache Commons Lang](https://github.com/apache/commons-lang/blob/master/NOTICE.txt)
- [SLF4J](http://www.slf4j.org/license.html)
- [Logback](http://logback.qos.ch/license.html)
