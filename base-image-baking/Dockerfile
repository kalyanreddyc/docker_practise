# Start with Red Hat Universal Base Image (UBI)
FROM registry.access.redhat.com/ubi8/ubi:8.9

# Label the image
LABEL maintainer="DrillDevOps <drilldevops@gmail.com>"
LABEL description="Java 17 Base Image with Essential Tools"

# Set environment variables for Java Version
ENV JAVA_VERSION 17

# Install Java 17 and other necessary tools
RUN yum update -y && \
    yum install -y java-${JAVA_VERSION}-openjdk-devel \
                   curl \
                   jq && \
    yum clean all

# Set JAVA_HOME environment variable
ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk

# Set the working directory (optional)
WORKDIR /app

# Set a generic command (optional)
CMD ["java", "-version"]