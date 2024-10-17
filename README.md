________________________________________
AAIB Task Automation
This is an automation framework developed for testing task to the AAIB ,The framework is written in Java and leverages TestNG for managing test execution and reporting.
Project Overview
The main goal of this project is to automate several tasks and validations, ensuring robust and efficient testing. It is designed to be modular and scalable, making it easy to expand for further test cases.
Features
•	Automated Test Suite: Covers key functionalities related to the AAIB task.
•	Test Reports: Automatically generates reports after execution.
•	Modular Framework: Easily extendable for adding new tests or modifying existing ones.
•	Data-Driven Testing: Capable of handling data-driven tests using external files (Excel).
Folder Structure
•	src/main/java: Contains the main automation scripts.
o	BaseTest.java: A base class to manage common functionalities (like setup and close browser).
o	TestCases.java: Includes specific test cases implemented using TestNG annotations (@Test).
o	Utilities.java: Utility functions for common actions (Data Provider, Extent Report and Excel Utility).
•	test-output: Stores TestNG reports after execution.
o	index.html: Test report with details about pass/fail rates and test steps.
•	Key Dependencies (pom.xml)
The following dependencies are defined in the pom.xml file:
•	Selenium WebDriver: For browser automation.
•	TestNG: For testing framework and annotations.
•	Extent Reports: For generating HTML reports after the test runs.

