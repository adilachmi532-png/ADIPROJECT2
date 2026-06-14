public class ComputeNode extends CloudResource {

    private int cpuCores;

    public ComputeNode(String computeResourceId, int numberOfCpuCores) {
        super(computeResourceId);
        this.cpuCores = numberOfCpuCores;
    }

    @Override
    public void allocateMemory(int gigabytes) {
        System.out.println("Compute allocation: " + gigabytes
                + " GB RAM assigned for inference tasks.");
    }

    @Override
    public String generateHealthReport() {
        String computeStatus = isActive ? "Healthy" : "Offline";

        return "Compute health report | ID: " + resourceId
                + " | Status: " + computeStatus
                + " | CPU cores: " + cpuCores;
    }

    @Override
    public int getUptime() {
        return isActive ? 24 : 0;
    }
}
