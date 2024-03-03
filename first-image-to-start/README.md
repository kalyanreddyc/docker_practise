# Instructions to build the image and run container from the image
## -f for full absolute path of Dockerfile when we name different instead of Dockerfile 

### Command to build Build image
#### if user is running this command in the same directory where the Dockerfile is there , 
#### use this command:  `docker build -t imagename:tag .` 
#### example: `docker build -t firstimage:1.0 .`
#### if the name of the file is different and path is different then 
#### use this command:  `docker build -t imagename:tag -f /path/to/dockerfile/demoDockerfile .`
# example: `docker build -t firstimage:1.0 -f /Users/kalyanreddy/drilldevops/demoDockerfile .`

# How to run a container from the above images
`docker run imagename:tag`
example: `docker run firstimage:1.0`    