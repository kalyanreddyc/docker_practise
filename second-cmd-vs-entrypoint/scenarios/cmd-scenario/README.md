## Build the image
`docker build -t hello-drilldevops-app-cmd:1.0 .`

## Run the container  with above image
`docker run hello-drilldevops-app-cmd:1.0`

## Run Your Docker Container Again with overided CMD
`docker run hello-drilldevops-app-cmd:1.0 java -jar /app/HelloDrillDevOps.jar`

