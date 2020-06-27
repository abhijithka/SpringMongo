minikube stop
minikube delete
minikube start
minikube status
eval $(minikube docker-env)
./gradlew bootJar
docker build -t cricketapi .
kubectl apply -f kube
minikube service cricket
kubectl get pods --watch