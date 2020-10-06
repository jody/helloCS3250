# helloCS3250
Hello World project for CS3250

## Overview
A basic "hello world" application in Java, intended to demonstrate the use of build automation (using Apache Ant), unit testing (using JUnit 5), style checking (using checkstyle), and collaborative software development (using Git and GitHub). Created for MSU Denver's CS3250, section 2, Fall 2020.

## Requirements
This repository contains all of the project-specific code and libraries that are needed to compile, run, and test the program. However, the following must also be installed on your system:
* The Java Development Kit (JDK) version 8 or higher, which can be found at either of the following locations:
  * https://openjdk.java.net/
    * Installation instructions: https://openjdk.java.net/install/
  * https://adoptopenjdk.net/
* Apache Ant
  * Installation instructions: https://ant.apache.org/manual/install.html
  
## Setup, Compile, and Run
Once you have the JDK and Apache Ant installed, simply clone the project's repository and then invoke Ant to build and run the program:

    $ git clone https://github.com/jody/helloCS3250.git
    $ cd helloCS3250
    $ ant
    
If you wish to run the program again without re-compiling, you can do so with:

    $ ant run
    
A list of all available Ant commands and their descriptions can be seen by typing:

    $ ant -p

## Testing
This project features unit tests written in JUnit5. To run the tests, simply use the built in Ant command:

    $ ant test
    
An html readout will be generated to make viewing the test reports more convenient. It will be located at `reports/testresults/index.html`

## Style Checking
There is also a built-in style checker that will verify all code meets the style guidlines of the project. You can run it with:

    $ ant checkstyle
    
The tool will produce an html report that can be found at `reports/checkstyle/checkstyle_report.html`
