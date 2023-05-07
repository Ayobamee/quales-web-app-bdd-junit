The framework consists of the following:
1. .github file which represents a set of actions for contious testing using github's servers on push to the main branch.
2. src/test/java/features contains all the features files for this bdd framework
3. src/test/java/pages contains all the page objects.
4. src/test/java/resources has the testdata properties with username , passwords etc.
5. src/test/java/stepdefinitions has all test steps written using the Gherkin syntax methods.
6. src/test/java/TestRunners contains the config for the test runner using junit.
7. src/test/java/utils/driverUtils contains the driver Utils where the browser engine is started
8. src/test/java/utils/filereader contains the file properties method for reading the test data stored in item 4 above.
9. src/test/java/utils/reusableMethods contains reusable java functions used through out the test.


To run this on your local.
1. Install java preferable jdk 11 and above.
2. Set java as an environment variable.
3.  Install maven
4. Set maven as an environment variable.
5. Clone the repo to your local.
6. Open with cloned project using your preferred IDE.
7. Wait for the dependencies to be downloaded on your local when the pom.xml updates.
