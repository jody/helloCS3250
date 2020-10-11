# helloCS3250
Hello World project for CS3250

## Overview
An extensible "hello world" application in Java, intended to demonstrate the use of build automation (using [Apache Ant](https://ant.apache.org)), unit testing (using [JUnit 5](https://junit.org)), style checking (using [Checkstyle](https://checkstyle.org)), and collaborative software development (using [Git](https://git-scm.org) and [GitHub](https://github.com/about)). Created for use by students of _Software Development Methods and Tools_ (CS 3250) at Metropolitan State University of Denver.

This repository contains all project-specific files needed to build, run, test, and evaluate the application.

## Local Requirements
The following must also be installed on the local system:
* A Java Development Kit (JDK) version 8 or higher
  * Installation information can be found at the following locations:
    * https://adoptopenjdk.net/
    * https://openjdk.java.net/
    * https://www.oracle.com/java/technologies/javase-downloads.html
* Apache Ant
  * Installation information can be found at:
    * https://ant.apache.org/manual/install.html

## Local Setup, Build, Test, Evaluate
The following commands are appropriate for using a Command Line Interface (CLI).

### Make a local copy of the project's repository
    git clone https://github.com/jody/helloCS3250.git
Creates a local copy of the project.
    
    cd helloCS3250
Moves into the newly created project directory.

### Compile, Package, and Run the Program
    ant
Cleans the project directory, compiles the source code, packages the classes into an executable JAR file, and runs the program.
    
### Run the Program
    ant run
Runs the program, re-compiling and re-packaging only if necessary.
    
### View Project Help Information
    ant -p
Displays project help information.

### Run Unit Tests
    ant test
Runs the project's unit tests via [JUnit](https://junit.org).
An HTML-formatted report will be produced in directory `reports/testresults/`.  Open `index.html` to view the report.

### Run Code Convention Checks
    ant checkstyle
Runs the project-specified code convention checks via [Checkstyle](https://checkstyle.org).
An HTML-formatted report will be produced in directory `reports/checkstyle`.  Open `checkstyle_report.html` to view the report.
