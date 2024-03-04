## Single-Stage Drawback: In the single-stage build, the final image contains everything from the JDK including tools and libraries necessary only for compiling the Java code, not for running it. This makes the image unnecessarily large for runtime.

## Multi-Stage Advantage: The multi-stage build produces a leaner image, containing only the JRE and the compiled application, reducing the size significantly. This demonstrates how unnecessary components can be left out of the final image, leading to more efficient storage and faster deployment times.

## Smaller images are faster to download, deploy, and generally contain fewer components that could be exploited.

## Build the single stage image
`docker build -t single-stage-hello-world:1.0 .`

## Build the multi stage image
`docker build -t multi-stage-hello-world:1.0 .`

## check the difference in sizes of the image
`docker images`

## Run the container
`docker run multi-stage-hello-world:1.0`
`docker run single-stage-hello-world:1.0`



