FROM airhacks/payara
COPY ./target/rest-service.war ${DEPLOYMENT_DIR}

EXPOSE 8080