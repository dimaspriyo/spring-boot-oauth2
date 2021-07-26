FROM jboss/keycloak:latest
COPY ./realm-export.json /tmp/realm-export.json
ENV DB_VENDOR=POSTGRES
ENV DB_ADDR=postgres
ENV DB_DATABASE=keycloak
ENV DB_USER=keycloak
ENV DB_SCHEMA=public
ENV DB_PASSWORD=password
ENV KEYCLOAK_USER=admin
ENV KEYCLOAK_PASSWORD=admin
ENV KEYCLOAK_IMPORT=/tmp/realm-export.json -Dkeycloak.profile.feature.upload_scripts=enabled          