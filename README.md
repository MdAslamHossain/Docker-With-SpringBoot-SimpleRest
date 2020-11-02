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


## Start/Stop container
1. To run/off a container 'docker container start/stop container-id'


Tutorial : https://www.youtube.com/watch?v=w_aVnMmrASE


## 1. Create docker file and image
0. sudo su
1. nano Dockerfile
2. past : below code

0. FROM openjdk:11
1. WORKDIR /home/aslam/Downloads
2. RUN git clone https://github.com/MdAslamHossain/Docker-With-SpringBoot-SimpleRest.git
3. RUN chmod -R 777 docker
4. WORKDIR /home/aslam/Downloads/docker
5. RUN mvn clean
6. RUN mvn install
7. WORKDIR /home/aslam/Downloads/docker/target
8. ENTRYPOINT ["java","-jar","/anyName-which-is-in-pom.jar"]

9. run 'docker build -t anyImgName .'
## 4. Run docker container
0. 'docker run -it -p 8080:8080 imageName'

## Start/Stop container
1. To run/off a container 'docker container start/stop container-id'


Tutorial : https://www.youtube.com/watch?v=eEo4ZT3K-RE
