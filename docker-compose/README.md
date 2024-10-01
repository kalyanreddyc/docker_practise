# Docker-compose
### Definition: Docker Compose is a tool for defining and running multi-container Docker applications.

### Configuration:  you use a YAML file to configure your application’s services, networks, and volumes.

### Purpose: Compose simplifies the development and testing workflows by managing the lifecycle of your application as a whole.

## Components 
### Services: Define what services are in the context of Docker Compose – essentially, individual containers.

### Networks: Explain how Docker Compose sets up networks for your containers to communicate.

### Volumes: Discuss how volumes are used to persist and share data between containers and the host system.

### docker-compose.yml:  the configuration file and its fundamental sections: version, services, networks, and volumes.

## Docker Compose Commands
`docker compose up`  :  start up your application with Docker Compose. \
`docker compose down` :  stop and remove the resources created by Compose.
`docker compose build` :  build or rebuild services.
`docker-compose up --build` : The --build flag forces the build to happen again, which can help if there have been any changes.
## Other commands
`docker compose logs` 
`docker compose exec` 
`docker compose restart`

## Real-time Scenarios and Demos
### Scenario : Setting up a simple web application with a front-end service, a back-end service, and a database.

### After running `docker compose up` , 
### 1. To Test the Nginx Connection
#### Since your Nginx container is mapped to port 80 on the host, you can test it by accessing your host's IP address or localhost in a web browser:
`http://localhost` or `http://<your_host_ip>`

### 2. Test the Connection to the App Service
#### If you have a route set up in your Nginx configuration to pass requests to your app, you should be able to access it using the same Nginx URL but with the appropriate endpoint. If not, you can temporarily map a port directly to the app service in your docker-compose.yml for testing purposes, like so:

`http://localhost:8000`

### To check the logs of services or containers use below 
`docker-compose logs app`
`docker-compose logs db`  
#### Above command also validates Database Connection, should see something database system is ready to accept connections

`docker-compose logs web`

### To Validate Internal Networking

`docker-compose exec app ping db`
#### Since we have defined a custom network `webnet`, all your services should be able to communicate with each other by their service names. You can validate this by executing a command within one container to ping another, for example, pinging `db` from `app`:


### =============>> Creating Node.js App start <<====================
### Commands to create simple node.js app. 
`mkdir app`
`cd app`
### This command creates a package.json file with default values.
`npm init -y`
###  Create a Simple Web Server . Install Express, a minimal web application framework for Node.js:
`npm install express`

### create server.js file in the app directory
`const express = require('express');`
`const app = express();`
`const PORT = process.env.PORT || 3000;`

`app.get('/', (req, res) => {`
`  res.send('Hello  DrillDevOps! From the Dockerized Node.js App!');`
`});`

`app.listen(PORT, () => {`
`  console.log(`Server is running on port ${PORT}`);`
`});`

### =============>> Creating Node.js App End <<====================

## ============>> Dockerfile Start <<=========================
### Dockerizing the Application. Create a Dockerfile in the app directory:
# Specify the base image
`FROM node:14`

# Set the working directory inside the container
`WORKDIR /usr/src/app`

# Copy package.json and package-lock.json
`COPY package*.json ./`

# Install dependencies
`RUN npm install`

# Bundle app source
`COPY ./app /usr/src/app`

# Bind to all network interfaces (allows access from the host)
`ENV PORT=3000`
`EXPOSE 3000`

`CMD ["node", "server.js"]`

## ============>> Dockerfile End <<=========================

### Build the dockerfile to get the image. Navigate back to the root of your project (or where your Dockerfile is located) and build the Docker image:
`docker build -t node-app-drilldevops:1.0 .`

### Run the Container 
`docker run -d --name node-app-container -p 3000:3000 node-app-drilldevops:1.0`

###  Node.js application is now running inside a Docker container and is accessible at  `http://localhost:3000`


### (Optiona) Integrating with Nginx .To make Nginx serve as a reverse proxy for your Node.js app, ensure your nginx.conf includes a section like this:

`server {`
    `listen 80;`

`    location / {`
        `proxy_pass http://node-app-container:3000;`
        `proxy_http_version 1.1;`
        `proxy_set_header Upgrade $http_upgrade;`
        `proxy_set_header Connection 'upgrade';`
        `proxy_set_header Host $host;`
        `proxy_cache_bypass $http_upgrade;`
    `}`
`}`



