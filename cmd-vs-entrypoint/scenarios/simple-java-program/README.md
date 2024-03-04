## Run below command to compile the java code
`javac HelloDrillDevOps.java`
## This will compile your Java program into a bytecode file named HelloDrillDevOps.class

## Before packaging your program into a JAR file, you need to create a manifest file that specifies the entry point of your application (i.e., the class with the main method). Create a new file named Manifest.txt and add the following line:
`Main-Class: HelloDrillDevOps`

## Now, package your compiled Java class into a JAR file using the jar command. Run the following command in your terminal or command prompt:
`jar cvfm HelloDrillDevOps.jar Manifest.txt HelloDrillDevOps.class`
