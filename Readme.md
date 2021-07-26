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

