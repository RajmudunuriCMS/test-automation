# test-automation
Setup
ChromeDriver is a separate executable that Selenium WebDriver uses to control Chrome. It is maintained by the Chromium team with help from WebDriver contributors. If you are unfamiliar with Selenium WebDriver, you should check out the Selenium site.

Follow these steps to setup your tests for running with ChromeDriver:

Ensure Chromium/Google Chrome is installed in a recognized location
ChromeDriver expects you to have Chrome installed in the default location for your platform. You can also force ChromeDriver to use a custom location by setting a special capability.
Download the ChromeDriver binary for your platform under the downloads section of this site
Help WebDriver find the downloaded ChromeDriver executable
Any of these steps should do the trick:
include the ChromeDriver location in your PATH environment variable
(Java only) specify its location via the webdriver.chrome.driver system property (see sample below)



Pre Requisites for developing Selenium scripts:

1) Programming Language (Java)
2) IDE needed to write a Java code(STS, Eclipse, Intellij)
3) Build tool (Maven) - Useful for Compiling, Collecting dependencies and Executing
4) Selenium WebDriver API (https://www.selenium.dev/selenium/docs/api/py/api.html)
5) Drivers needed to communicate to browser. Download the drivers here (https://www.selenium.dev/selenium/docs/api/javascript/index.html) 




