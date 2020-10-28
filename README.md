# Docker-With-SpringBoot-SimpleRest

# Docker for MySQL
0. Run 'sudo su'
1. Run 'docker pull mysql:latest' (pull latest mysql image)
2. Run 'docker images' (Check docker images)
3. Run 'docker run --name mysql-container1 -d -p 3307:3306 -e MYSQL_ROOT_PASSWORD=root mysql:latest' (create a container or instance, here port 3307)
4. Run 'docker exec -it mysql-container1 /bin/bash' (to access bash for mysql-container1 container)
5. Run 'docker ps' to show running containers ('docker ps -a' to show all containers)
6. Run 'mysql -uroot -proot' (to login)
7. Run 'create database db-name'
8. 





Tutorial : https://www.youtube.com/watch?v=nCQE3ewl9ps
## 1. Create executable jar
1. mvn clean
2. mvn install
then get the jar in terget folder
## 2. Create docker file
1. create a file named 'Dockerfile'  in root directory
2. past : 

1. FROM openjdk:11
2. VOLUME /tmp
3. ADD target/Rest_api-0.0.1-SNAPSHOT.jar app.jar
4. ENTRYPOINT ["java","-jar","/app.jar"]

## 3. Build docker image
1. go to the directory where 'Dockerfile' is located
2. run 'sudo docker build -t anyName .'
## 4. Run docker container
1. 'sudo docker run -p8080:8080 fileName'

## Other cmd
1. to run/off a container 'sudo docker container stop/stop container-id'
