#### Creating a base or "golden" image for developers means preparing an image with all necessary runtime environments and common dependencies, but without application-specific artifacts or configurations. 
#### This base or golden image can then be used by developers to build their own Docker images for various applications.

## Build the Dockerfile
`docker build -t drilldevops/java-base-image:17 .`

## Run the image
`docker run -it drilldevops/java-base-image:17` 

## login into the container 
`docker run -it drilldevops/java-base-image:17  /bin/bash`
