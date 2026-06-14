public abstract class CloudResource implements Monitorable {

    protected String resourceId;
    protected boolean isActive;

    public CloudResource(String newResourceId) {
        this.resourceId = newResourceId;
        this.isActive = false;
    }

    public void togglePower() {
        isActive = !isActive;

        String powerState = isActive ? "ON" : "OFF";
        System.out.println("Power update -> Resource " + resourceId + " is now " + powerState);
    }

    public abstract void allocateMemory(int gigabytes);
}