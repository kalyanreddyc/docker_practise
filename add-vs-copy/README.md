# This will gives the difference between COPY and ADD.

## Docker COPY command Syntax
`COPY <src> <dst>`

`<src>: Source directory/file`
`<dst>: Destination directory/file`

## Docker ADD command Syntax
`ADD <src> <dst>`

`<src>: Source file/directory`
`<dst>: Destination`

## https://www.java4coding.com/contents/docker/docker-copy-command  --> for more information

## Build your Docker image with the following command:
`docker build -t hello-drilldevops-copy:1.0 -f Dockerfilecopy .`
`docker build -t hello-drilldevops-add:1.0 -f Dockerfileadd .`

##  Run the Docker Container
`docker run hello-drilldevops-copy:1.0`
`docker run hello-drilldevops-add:1.0`
