JUNE 9TH, WEDNESDAY

TODAY'S SCHEDULE:
- Review:
- WebTable
- Properties

	- Some tasks related to final covered topics
	- if we have time small new topic

Announcement: This Sunday no Selenium class. It will be Java.

-------------------------------------------------------------------------------------------

- How do you handle webtables using Selenium?
- We create custom locators using xpath or cssSelector to locate certain cells, rows, or columns from a table.


 	//table[@id='table1']/tbody/tr/td

    //table[@id='table1']//tr/td



-------------------------------------------------------------------------------------------

Properties: ConfigurationReader

- What are we doing with ConfigurationReader.getProperty() method?
    - We are reading data from external file.

- What kind of file we are trying to read from?
- What is the type of the file?
  - .properties type of file

- What is so special about this file? What makes it different from others?
    - It stores data in "key=value" format

- What is putting your (test) data in source code called?
    - "hard coding" is keeping your data in your source code
    - What does it mean?
    - It means if you have to go in your TESTS to change the test data, you have hard coded your data.

- What is wrong wrong with hard coding?
    - harder to maintain
    - not flexible (when your project gets bigger it will be harder to manage and maintain)
    - not re-usable

- What do we want to keep in our properties files?
    - Only important test data.
    - Only the data that will change the flow of your whole testing suite should be kept in the configuration.properties file.
    - You can create multiple .properties files to keep and store different types of test data.


--------------------------------------------

Step by step how do we read from .properties file?

#1- We create the object of Properties class from Java library.
 	- Why? 
 	- Because "Properties" class is capable of reading .properties type of files.

---> 	Properties properties = new Properties();

#2- We open the .properties file in java memory using FileInputStream
 	- We create object of FileInputStream
 	- We pass the path of the file we want to open into the constructor of FileInputStream 

---> FileInputStream file = new FileInputStream("configuration.properties");

#3- We load the "file" object into "properties" object.
 	- This way the "properties" object is now aware of where the configuration.properties is
 	- And now ready to read from it (extract data from it)

---> properties.load(file);

#4- We use .getProperty() method with our properties object to get the value of the key we want.

key = value
---> properties.getProperty("key"); ---> "value"

browser = chrome
username=janedoe

---> properties.getProperty("username"); ---> janedoe
---> properties.getProperty("browser"); ---> chrome
---> properties.getProperty("janedoe"); ---> null





























