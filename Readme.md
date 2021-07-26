# Spring Boot Oauth2

## Prerequisite

 1. Port 8081, 8082, 679
 2. docker-compose 
 
 ## Getting Started
1. `sudo docker-compose up`
2. Prepare Keycloak configuration `http://localhost:8081`  (Admin / Admin)
3. Create `personal` realm
 ![Index](screenshoot/keycloak-create-realm.png "Create Realm")
4. Create `SpringBoot` client
 ![Index](screenshoot/keycloak-create-client.png "Create Client")
5. Edit `johndoe` user
 ![Index](screenshoot/keycloak-edit-client.png "Edit Client")
6. Create `johndoe` user
 ![Index](screenshoot/keycloak-add-user.png "Add User")
7. Set password
 ![Index](screenshoot/keycloak-set-password.png "Set User Password")
8. Create `GET_ALL` & `GET_BY_ID` roles
 ![Index](screenshoot/keycloak-create-realm.png "Create Roles")
9. Mapping roles to `johndoe` user
 ![Index](screenshoot/keycloak-role-mapping.png "Roles Mapping")


## Run Resource Server App
Located in `resource-server` folder

## Endpoint
- Get Token
```
curl --location --request POST 'http://localhost:8081/auth/realms/personal/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Cookie: JSESSIONID=5653E25A77C0CC63255B62E6405081D1.40ed8abe0b69; OAuth_Token_Request_State=022700a3-faf9-402b-9cea-4ed0ff64c445; JSESSIONID=092EF45F6A1FDF33CE70E2A074F87322' \
--data-urlencode 'username=johndoe' \
--data-urlencode 'password=johndoe' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'client_id=SpringBoot'
```


## Reference Link
- https://github.com/redis-developer/redis-datasets
- https://github.com/keycloak/keycloak-containers
- https://stackoverflow.com/questions/45279497/redis-docker-create-a-container-with-data/56696941#56696941
- https://www.baeldung.com/spring-boot-keycloak
- https://developers.redhat.com/blog/2020/11/24/authentication-and-authorization-using-the-keycloak-rest-api#keycloak_sso_demo
