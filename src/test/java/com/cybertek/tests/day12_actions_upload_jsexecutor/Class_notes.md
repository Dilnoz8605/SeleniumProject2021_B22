JUNE 19TH, SATURDAY

TODAY'S SCHEDULE:
- Review -> Driver utility
- Singleton Practice
- Actions
- Uploads/Downloads
- JSExecutor

---------------------------------------------------------------------------

--> Driver Utility

	- What is Driver utility and why did we create it?
	1- It is a utility class we created so that we can re-use our WebDriver and make sure it will return us same driver instance every time we call it.

	2- We were writing too many lines just to instantiate our driver and create general setup, such as:
		- opening browser
		- maximize browser
		- implicitly wait

	3- We still had some problems passing our driver instance around in our project.
		- Using Singleton Design Pattern solves this issue for us.



--> Singleton Design Pattern:
- Singleton Design Pattern makes sure that we return same object every time we call our method.

--> How do we apply Singleton Design Pattern:

	#1- Create a private constructor.
		- After constructor is private, we cannot create object of this class.

	#2- Create a static getter method where we return the object in the way we want to return.



--> What is a driver session?
- click run
- session is created with random session id :

		driver_asd8f7a9sd8f7987asdf987f --> terminated
		driver_zz987zx9c8f7asdf0asd9f87
		driver_asd0f98as0d9f8asd0f98000

	- driver.quit(); 
		--> it will close all of the opened browsers and tabs
		--> it will terminate the driver instance completely

	- driver.close(); 
		--> closes only the currently opened browser or tab
		--> it will end the session


------------------------------------------------------------------------------

How do we handle Downdload using selenim library?
- We don't.
- We can NOT directly handle download using Selenium.
- Because the folder structor of our OS is out of scope for selenium we cannot verify if a file is downloaded.

	- We can click to a link and download something.
	- But we can not go in our computer folder structure using SELENIUM to verify it is actually downloaded.

How do we handle UPLOAD using selenium?
- We locate the input web element that accepts files.
- We use .sendKeys(), and send the path of the file we want to upload.
- Finally we can verify if any web element is displayed on the page after we uploaded.



------------------------------------------------------------------------------

Actions:

	- Actions class is used for "advanced" mouse and keyboard actions


	How to use Actions:
		#1- Create object of Actions class
		#2- Pass the driver instance in to the constructor
		#3- Use the actions object to reach the methods coming from that class
		#4- We must use perform() method at the end to perform all actions.

	syntax:
		Actions actions = new Actions(Driver.getDriver());

		action.moveToElement().perform();
		action.clickAndHold().perform();
		action.dragAndDrop().perform();
		action.doubleClick().perform();
		action.contextClick().perform();--> rightClick

PIQ
--> How many ways do you know to scroll using Selenium?
#1- moveToElement using Actions object
#2- PageDown, PageUp keys for scrolling
#3- scroll using JavaScriptExecutor: js.executeScript("window.scrollBy(0, 750)");
#4- OPTION 2 FOR JSEXECUTOR:
js.executeScript("arguments[0].scrollIntoView(true)", cybertekSchoolLink);



--------------------------------------------------------------------

--> JAVASCRIPT EXECUTOR

- What is JavaScriptExecutor?
    - It is a simple interface in Selenium Library.
    - JavaScriptExecutor interface has 2 methods in it.
    - These two methods allows us to execute (inject) JavaScript code in our JAVA+SELENIUM code.

- Why do we use JavaScriptExecutor?
    - Because JavaScript is a strong web-development language.
    - Therefore it has many useful functions(methods) in it that we can inject in our JAVA+Selenium code.
    - We can :
        - you can enter text using javascript
        - we can open empty tabs
        - we can scroll the page in multiple different ways

- How do we use JavaScriptExecutor?
  1- We downcast our driver type to JavaScriptExecutor type.
  2- We can create object of JavaScriptExecutor
  3- Call the methods from there. 













