# spring-boot-rest
Sample REST application using spring boot.

<br>
Steps to run<br>
1) Build the application using mvn clean package<br>
2) Run the generated jar using the below command
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
a) java -jar target/spring-boot-rest-0.1.0.jar <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		This will start the embedded tomcat application running on port 8888 as configured by 		the application.properties<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
b) java -jar target/spring-boot-rest-0.1.0.jar --spring.config.name=devtest<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		This command will start the embedded tomcat application running on port 8090 as configured by the devtest.properties<br>