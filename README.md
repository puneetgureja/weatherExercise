weatherExercise
===============

To validate ZIp code and fetch City, State and Temprature Details

How to Complie the code 
-----------------------

1. Open command Prompt. 
2. Make sure mavne is installed by using mvn -version
3. Now type browse to directory where Weather Code is installed.
4. Issue below command 
   mvn eclipse:clean eclipse:eclipse 
 This command will download all required dependecies for the Project.

5. Now issue command - mvn   compile 
6. This will result in a Succesful Build if all dependencies are downloaded.


How to execute the test
-----------------------
7. issue - mvn test command to run all Junit test.

How to start the application
----------------------------
8. Edit Tomcat path in Pom.xml file 
9. Issue mvn clean install 
10. After you get a message Build Successfull
11 . Then issue Mvn deploy. 


 
