docker-compose stop
docker stop $(docker ps -aq)
docker rm $(docker ps -aq)
./gradlew bootJar
docker-compose up -d