JUNE 16TH, WEDNESDAY
Today's schedule:

	- Review
	- TestBase
	- Driver Utility

--------------------------------------------------------------------------------

- What is properties file?
    - It is just another file type just like .txt, or .xml


- Why do we use .properties file?
    - it stores data in key=value format

- What is hard coding?
    - Putting data (in our case test data) inside of the source code.
    - If I have to go inside of my tests(code) to change my data, it means I am hard coding.


- How do we read from .properties file?
  #1- Creating an object of the Properties class

  	Properties properties = new Properties();

  #2- Use FileInputStream to open our .properties file in java memorty

  	FileInputStream file = new FileInputStream("pathOfTheFileWeAreTryingToOpen");

  #3- Load the already opened "file" into the "properties" object

  	properties.load(file);

  #4- Use .getProperty method from "properties" object to read keys' values.

  	properties.getProperty("key");


----------------------------------------------------------------------

	--> TestBase
		- TestBase is not a utility class.
		- What is TestBase?
		- TestBase is an abstract class where we create and store re-usable variables, and methods/annotations(@BeforeMethod, @AfterMethod)
		- TestBase is basically parent of all of the tests we have in our project.
		- If we have a certain logic that can apply to all of our tests, we store those in TestBase.

		- How we are supposed to be using whatever is inside of TestBase?
		- By "extend"ing and inhering to TestBase


----------------------------------------------------------------------

- DRIVER UTILITY CLASS
    - What, Why, How

    - What is the topic?
    - Creating a new utility class: Driver

    - Why we are creating this class?
      1- We are writing too many lines just to create and instantiate a WebDriver instance.
      2- We are having problem when we try to pass SAME driver instance around in our project.

SOLUTION: Driver utils class and method we will be creating in this class.
- We will create a logic which will guarantee the same EXACT driver object everytime we call our utility method.
- Initial setup such as maximize, and implicitly wait will also be handled in this method.

What is a design pattern in programming?
- In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design.


What is Singleton Design Pattern?
- Singleton Design Pattern guarantees to deliver same OBJECT every time.

How do we apply Singleton Design Pattern?
#1- We create private constructor.
#2- We create a getter method to deliver the object of the class in the way we want to deliver.























