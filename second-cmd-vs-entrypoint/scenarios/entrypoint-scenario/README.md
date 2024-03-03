## Build your Docker image with the following command:
`docker build -t hello-drilldevops-app-entry:1.0 .`

##  Run the Docker Container
`docker run hello-drilldevops-app-entry:1.0`

## Passing Additional Arguments
`docker run hello-drilldevops-app-entry:1.0 --verbose`

## Override ENTRYPOINT and execute a different JAR:
`docker run --entrypoint java hello-drilldevops-app-entry:1.0 -jar /app/HelloDrillDevOps.jar`

## Here, the --entrypoint flag is used to change the initial command to java, essentially bypassing the original ENTRYPOINT. Following the --entrypoint flag, the new command to execute is specified, allowing the container to run the HelloDrillDevOps.jar instead of first-demo-jar-1.1-SNAPSHOT.jar.