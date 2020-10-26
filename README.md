# Docker-With-SpringBoot-SimpleRest
## 1. Create executable jar
1. mvn clean
2. mvn install
then get the jar in terget folder
## 2. Create docker file
1. create a file named 'Dockerfile'  in root directory
2. past : 

1.FROM openjdk:11
2.VOLUME /tmp
3.ADD target/Rest_api-0.0.1-SNAPSHOT.jar app.jar
4.ENTRYPOINT ["java","-jar","/app.jar"]

## 3. Build docker image
1. go to the directory where 'Dockerfile' is located
2. run 'sudo docker build -t anyName .'
## 4. Run docker container
1. 'sudo docker run -p8080:8080 fileName'

## Other cmd
1. to run/off a container 'sudo docker container stop/stop container-id'
