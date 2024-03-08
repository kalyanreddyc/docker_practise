## In this exisiting setup, the ENTRYPOINT specifies that Java should execute, and the CMD provides the default JAR file to run. You can override the CMD part directly by supplying arguments at the end of the docker run command. However, if you want to override the ENTRYPOINT as well, you would use the --entrypoint flag.


## Override ENTRYPOINT and run a different command
`docker run --entrypoint /bin/bash hello-drilldevops-app-both:1.0 -c "echo Hello DrillDevOps"`

## In this example, instead of running the Java application, the container starts a Bash shell and executes echo Hello DrillDevOps. The --entrypoint flag changes the executable that the container starts with, ignoring both the ENTRYPOINT and CMD specified in the Dockerfile.


