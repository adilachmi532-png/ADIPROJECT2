public class DatabaseNode extends CloudResource {

    private int storageCapacityGb;

    public DatabaseNode(String databaseResourceId, int totalStorageCapacityGb) {
        super(databaseResourceId);
        this.storageCapacityGb = totalStorageCapacityGb;
    }

    @Override
    public void allocateMemory(int gigabytes) {
        System.out.println("Database allocation: " + gigabytes
                + " GB RAM reserved for indexing operations.");
    }

    @Override
    public String generateHealthReport() {
        String databaseStatus = isActive ? "Operational" : "Offline";

        return "Database health report | ID: " + resourceId
                + " | Status: " + databaseStatus
                + " | Storage: " + storageCapacityGb + " GB";
    }

    @Override
    public int getUptime() {
        return isActive ? 48 : 0;
    }
}
    

