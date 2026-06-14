public class DatacenterConfig {

    public static final String DEFAULT_REGION = "us-east-1";

    public static void printSop() {
        System.out.println("=== Datacenter Standard Operating Procedure ===");
        System.out.println("Region: " + DEFAULT_REGION);
        System.out.println("Rule: Turn all nodes ON before allocating memory.");
        System.out.println("================================================");
    }
}
