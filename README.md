# RestService
##Description
Basic framework for a rest-service.  This framework includes:
1) Build application WAR for deployment on application service
2) Docker build
3) Unit tests
4) Component tests of deployed component

##Deploy to Docker (Dockerfile)
$ docker build -t rest-service .
$ docker run -p 8080:8080 rest-service

Access from browser at: http://localhost:8080/rest-service/query
