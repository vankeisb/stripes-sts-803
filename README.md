How to test :

```
mvn clean verify
```
> You'll need Firefox installed, this is a Selenium test case. For command line options see [the selenium-utils](https://github.com/pojosontheweb/selenium-utils) doc.

Build should be successful.

You can change the Stripes version in the `pom.xml` and double check : it fails with 1.5.7 but passes on 1.5.8-SNAPSHOT.
