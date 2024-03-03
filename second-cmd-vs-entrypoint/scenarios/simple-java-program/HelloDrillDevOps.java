public class HelloDrillDevOps {
    public static void main(String[] args) {
        boolean verbose = false;

        for (String arg : args) {
            if ("--verbose".equals(arg)) {
                verbose = true;
            }
        }

        if (verbose) {
            System.out.println("Verbose mode enabled. Hello, DrillDevOps Team!");
        } else {
            System.out.println("Hello, DrillDevOps Team!");
        }
    }
}