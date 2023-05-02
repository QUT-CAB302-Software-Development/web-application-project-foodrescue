[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/cgVKkZfY)
[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-8d59dc4de5201274e310e4c54b9627a8934c3b88527886e3b421487c677d23eb.svg)](https://classroom.github.com/a/cgVKkZfY)
# Web Application with Spring Web and Thymeleaf

Food Rescue is a fully functional web application that enables retailers to reduce food waste by creating food listings for people to view and collect for free. With Food Rescue, retailers can easily create a listing of available leftover food items, including descriptions, quantities, and pick-up instructions.

Users can browse through the listings to find the available food items that they're interested in, and then reserve them for pick up. The application allows users to search for food by category, location, and availability.

The application is built using the Spring Boot framework and Thymeleaf templating engine, making it easy to extend and customize. The user interface is designed to be clean, and, intuitive. Food Rescue is a valuable tool for reducing food waste and helping to create a more sustainable and equitable food system.

## Dependencies

This project uses the following dependencies:

- Amazon Corretto 18
- spring-boot-starter-data-jpa
- spring-boot-starter-thymeleaf
- spring-boot-starter-web
- spring-boot-devtools
- mysql-connector-j 
- spring-boot-starter-test

## Software Requirements

This project requires the following software:

- IntelliJ IDEA Ultimate
  - Download: https://www.jetbrains.com/idea/download/
  - Obtain a free student license: https://www.jetbrains.com/community/education/#students

*Spring support is only available in IntelliJ IDEA Ultimate. For more information, see [Spring Support in IntelliJ IDEA](https://www.jetbrains.com/help/idea/spring-support.html).*

- mysql
  - Download: https://dev.mysql.com/downloads/windows/installer/8.0.html

## Getting Started

To get started, clone this repository and open the project in IntelliJ IDEA Ultimate. Maven will download the required dependencies defined in the `pom.xml` file.

### 1. Configure the Project SDK

To configure the project SDK, goto `File > Project Structure...` and select the `Project` tab. In the `SDK` dropdown, select `corretto-18`. 

If the `corretto-18` SDK is not available, you will need to download and install it. This can be done by clicking the `Add SDK > Download JDK...` button and select `Version: 18`, `Vendor: Amazon Corretto 18.0.2`.

### 2. Running the Application

To run the application, run the `main` method in the `example.application.FoodRescueApplication` class, found in `FoodRescue/src/main/java/application/FoodRescueApplication.java`.

This will start the application on port 8080. You can access the application by navigating to `http://localhost:8080/landing-page` in your browser.

### 3. Configure mysql

Create a new schema called food_rescue

### 4. Configure application.properties

Change the following:
- spring.datasource.username=xxxxx
- spring.datasource.password=xxxxxxxxxx

### Project Structure

In this project, the Java code is located in the `src/main/java` directory, and the HTML templates are located in the `src/main/resources/templates` directory. 

Test files are located in the `src/test/java` directory.

