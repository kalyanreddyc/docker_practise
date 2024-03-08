# Docker Networks
## Docker networking allows containers to communicate with each other and with the outside world. Understanding Docker's network types is crucial for deploying, scaling, and managing containerized applications.

## Types of Docker Networks
## 1. Bridge Network (Default)
## 2. Host Network
## 3. Overlay Network
## 4. None Network
## 5. Macvlan Network

============================================
## 1. Bridge Network
###  The default network mode in Docker. When you start a Docker container without specifying a network, it gets added to a bridge network.

### Use Case: Bridge networks are used when your applications run in standalone containers that need to communicate.

### Create a Bridge Network:
`docker network create --driver bridge drilldevops_bridge`

### Run Containers in Your Network:
`docker run -d --name container1 --network drilldevops_bridge nginx`

`docker run -d --name container2 --network drilldevops_bridge alpine ping container1`

### Here, container2 can communicate with container1 using the bridge network
### To verify the container2 connecting to container1 , check the logs of container2
`docker logs container2`

### One Real-Time Scenario: Deploying multiple containers that need to communicate on the same Docker host, such as a web application container and a database container.

=============================================
## 2. Host Network
### Removes network isolation between the container and the Docker host, and use the host's networking directly.

### Use Case: Used when you want to avoid network overhead for the container or when dealing with network services that need to be exposed directly on the host's network.

`docker run -d --name webserver-container --network host <image>`
### image=nginx and -d = daemon mode 

### Real-Time Scenario: Running a container that monitors network traffic on the host.

===============================================

## 3. Overlay Network
### Supports multi-host networking, allowing containers running on different Docker hosts to communicate.

### Use Case: Ideal for Docker Swarm mode or container orchestration tools like kubernetes when you need to enable communication between a service's containers situated on different nodes.

### Initialize Swarm Mode (if not already in Swarm mode):
`docker swarm init`

### Create an Overlay Network:
`docker network create --driver overlay drilldevops_overlay`

### Deploy Services Using Your Network:
`docker service create --name service1 --network my_overlay nginx`

### Deploy Services Using Your Network:
`docker service create --name service1 --network drilldevops_overlay nginx`

### Real-Time Scenario: Setting up a scalable web application cluster with multiple services across different hosts.

==============================================
## 4. None Network

### Disables all networking for a container. Essentially, the container gets its own network stack but no configuration, making it isolated.

### Use Case: For containers that need to be completely isolated or for containers that handle their own network stack.

### Run Container with No Network:
`docker run -d --network none --name isolated_container alpine`

### Real-Time Scenario: Running a container for testing or security purposes where network access should be completely blocked.

================================================
## 5. Macvlan Network
### Allows you to assign a MAC address to a container, making it appear as a physical device on your network.

### Use Case: When you need containers to appear as physical hosts on the network, bypassing the Docker host’s network stack.

### Create Macvlan Network:
`docker network create -d macvlan \`
  `--subnet=192.168.1.0/24 \`
  `--gateway=192.168.1.1 \`
  `-o parent=eth0 drilldevops_macvlan`

### Run Container on Macvlan Network:
`docker run -d --name macvlan_container --network drilldevops_macvlan nginx`

### Real-Time Scenario: Integrating containers with legacy systems where containers need their own IP addresses on the physical network.

## Other Commands of Docker network
### Lists docker networks 
`docker network ls`