This framework consists of five major parts to it.
The Page objects, Actions , Assertions, Regression Test suite and load Browser
To avoid test failures as a result of D.O.M elements been absent, i created an abstract component (under java > org.liveet > AbstractComponents)file under the java folder
The Page Components for each D.O.M element can be found in ( java > org.liveet > PageComponents)
Also the framework contains a master list created for all Page Objects in the Page Objects folder ( java > org.liveet > PageObjects)were all D.O.M elements are stored.
The actions file ( java > org.liveet > Actions) imports the page objects to perform tests to be automated, they are sstored in different methods depending on tests to be carried out.
These are also imported in the Regression Test suite file ( test > org.TestSuite) for use.
The assertions are also stored in the Assertion folder in different methods.
These are also imported in the Regression Test suite file ( test > org.TestSuite) for use.
The Load browser file is where the test starts up the broswer before test execution occurs, the base url is also kept here.

Happy Testing!!!!!




Author : Ayobami 
