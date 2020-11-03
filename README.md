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

9. Access : jdbc:mysql://deviceIP:3307/dbName
## Start/Stop container
1. To run/off a container 'docker container start/stop container-id'


Tutorial : https://www.youtube.com/watch?v=w_aVnMmrASE

## Create a jar
0. Create a jar using IDE or CLI (Location of jar file should not be outer than Dockerfile)
## 1. Create docker file
0. Run 'sudo su'
0. Run 'touch Dockerfile' (in any directory but Location of jar file should not be outer than Dockerfile)
1. Open the 'Dockerfile'
2. past : below code

0. FROM openjdk:11
1. ADD API-1.jar API-1.jar
2. EXPOSE 8080
3. ENTRYPOINT ["java","-jar","API-1.jar"]

4. Run 'docker build -f Dockerfile -t dockerspring .' (To create docker image)
5. Run 'docker images' (show images)
## Create docker container with name and port
0. Run 'docker run --name app1 -d -p  8081:8080 dockerspring'
## Rename docker container
0. Run 'docker container rename oldName newName'

## Start/Stop container
1. To run/off a container 'docker container start/stop container-id'


Tutorial : https://www.youtube.com/watch?v=FlSup_eelYE


## Docker for angular
0. Check installed Node.js and Angular CLI on your local PC
1. Go to project base directory
2. Run 'ng build --prod'
2. Run 'sudo su'
3. Run 'touch Dockerfile'
4. Paste : 
5. FROM nginx:1.18.0-alpine
6. COPY /dist/dockerApp /usr/share/nginx/html



7. Run 'docker build -t dockerName .'
8. Run 'docker run --name containerName -d -p 90:80 imageName'



## Above configuration follows
http {
    include /etc/nginx/mime.types;
    server {
        listen 80;
        server_name localhost;
        root /usr/share/nginx/html;
        index index.html;
        location / {
            try_files $uri $uri/ /index.html;
        }
    }
}


1. Tutorial : https://www.youtube.com/watch?v=J9uKG22lBwA















