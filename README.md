# java-tools
![Maven Deploy (Dev)](https://github.com/dfuchss/java-tools/workflows/Maven%20Deploy%20(Dev)/badge.svg)
[![GitHub issues](https://img.shields.io/github/issues/dfuchss/java-tools.svg?style=square)](https://github.com/dfuchss/java-tools/issues)
[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg?style=square)](https://github.com/dfuchss/java-tools/blob/master/LICENSE.md)

This repo contains a small set of tools for Java

# Maven & Co.
If you want to use maven or some similar tool add the following code to your pom:
```xml
<repositories>
	<repository>
		<id>gh-fuchss</id>
		<name>Github Nexus Fuchss</name>
		<url>https://nexus.fuchss.org/repository/github/</url>
	</repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>org.fuchss</groupId>
    <artifactId>java-tools</artifactId>
    <version>develop-SNAPSHOT</version>
  </dependency>
</dependencies>
```
