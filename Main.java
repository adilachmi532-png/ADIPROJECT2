public class Main {

    public static void main(String[] args) {

        DatacenterConfig.printSop();

        CloudResource[] datacenterNodes = {
                new ComputeNode("C-01", 16),
                new DatabaseNode("DB-01", 1024)
        };

        System.out.println();
        System.out.println("--- Activating cloud resources ---");

        for (CloudResource currentNode : datacenterNodes) {
            currentNode.togglePower();
        }

        System.out.println();
        System.out.println("--- Allocating memory and generating health reports ---");

        for (CloudResource currentNode : datacenterNodes) {
            currentNode.allocateMemory(32);
            System.out.println(currentNode.generateHealthReport());
            System.out.println("Reported uptime: " + currentNode.getUptime() + " hours");
            System.out.println("-----------------------------------------------");
        }

        System.out.println("Datacenter setup test completed successfully.");
    }
}