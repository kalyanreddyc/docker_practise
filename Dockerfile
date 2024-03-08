# Use Red Hat Universal Base Image 8 as the base image
FROM registry.access.redhat.com/ubi8/ubi:latest

# Use echo command to print "Hello, DrillDevOps" when the container starts
CMD ["echo", "Hello, DrillDevOps"]
