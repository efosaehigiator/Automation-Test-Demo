# Automation-Test-Demo
Automation Test
I have developed this Framework using cucumber, the test cases are written in gherkin syntax, these are I use to generate my step definitions.
it is a page object model framework, I created a seperate java class for the features under test, this helps to manage the code better and also created seperate classes where I implement my step definations, the pages classes is where I implement all the methods to use in the step definations, after implementing all the methods, I then create an object of the page class to enable me call all the methods.
I have also created a seperate utilities class as I do not need to call the webdriver in all the tests, The Runnerclass is a Junit runner which I use to run the test, this helps me to be able to generate html reports, and to be able to classify scenarios to test by using the tags.
