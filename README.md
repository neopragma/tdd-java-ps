# TDD Java Training

See the [Course Notes](docs/Course_Notes.md) for guidance on getting the most from the course, basic information about TDD, and definitions of jargon terms. 

## Module tdd-samples 

Examples for coding various unit/microtests using JUnit, Mockito, and JQwik. [Notes](docs/Package_samples.md)

## Module tdd-fizzbuzz 

Starter code for an exercise to use TDD for greenfield development. 

[Notes](docs/fizzbuzz.md).

[Examples](docs/Package_fizzplay.md).

## Module tdd-rpn

Starter code for an exercise to use TDD for greenfield development. 

[Notes](docs/rpn.md).

## Module tdd-gildedrose

Starter code for an exercise to use TDD to approach modifications to existing code. 

[Notes](gilded-rose.md).

## Gradle command line execution

Run from the module subdirectory.

```shell 
cd [project-root]
cd tdd-samples 
./gradlew ...
```

### Run unit tests 

```shell
./gradlew test
```

### Unit test results

```shell
[project-root]/tdd-java-ps/tdd-samples/build/reports/tests/test/index.html
```

### Run integration tests

```shell
./gradlew integrationTest
```

### Integration test results

```shell
[project-root]/tdd-java-ps/tdd-samples/build/reports/tests/integrationTest/index.html
```

### Check unit test coverage

```shell
./gradlew jacocoTestCoverageVerification
```

### Unit test coverage report 

```shell
[project-root]/tdd-java-ps/tdd-samples/build/jacocoHtml/index.html
```

### Run Jacoco report

```shell
./gradlew jacocoIntegrationTestReport
```

### Jacoco test report

```shell
[project-root]/tdd-java-ps/tdd-samples/build/reports/jacoco/jacocoIntegrationTestReport/html/index.html
```


## Acknowledgements 

Thanks to Ted M. Young (@jitterted@sfba.social), Jay Bazuzi (@JayBazuzi@mastodon.online), and Glenn Waters (@gwww@mastodon.social) for suggestions to improve the Course Notes.

Thanks to Emily Bache (emilybache@sw-development-is.social) for her great work on the Gilded Rose kata. 

