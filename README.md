# Mobile Test Automation Framework - Practice

# Running tests and reporting

## Usage with Maven

### Test execution - Command Line:

* Run all tests: `mvn test`
* Run test class: `mvn test -Dtest=ClassName`
* Run test method: `mvn test -Dtest=ClassName#testMethodName`

### Generating Allure reports:

* Generate report file: `mvn allure:report`
* Start report server (Localhost): `mvn allure:serve` 