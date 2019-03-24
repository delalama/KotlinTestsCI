# KotlinTestsCI
### Spring project with gradle and kotlin , managed by CI client TeamCity

This small project consists in a simple calculator functions implemented in kotlin it prints a table with ten operations of the common (+,-,x,/) arithmetic operations.

It has a tests section for each function.

Before the project is finished and the graddle build works fine i decided to learn a bit of TeamCity.

TeamCity is a CI product of JetBrains and in this setup i've configured only to see how VCS trigger works.

The idea is that the configuration of this project in TeamCity is listening to the origin repo and when it detects new changes it does an automatic build to make sure that we haven't broken the project.

## Overview of TC 
![alt text](https://github.com/delalama/KotlinTestsCI/blob/master/pics/1%20-%20TeamCity.png "TC project build overview")

## Small change on our project
![alt text](https://github.com/delalama/KotlinTestsCI/blob/master/pics/2%20-%20Force%20VCS%20trigger.png "Small change")

## Push changes
![alt text](https://github.com/delalama/KotlinTestsCI/blob/master/pics/3%20-%20Git%20push.png "Git push")

## See TC automatic response to the change
![alt text](https://github.com/delalama/KotlinTestsCI/blob/master/pics/4%20-%20TC%20auto%20build.png "TC working")

