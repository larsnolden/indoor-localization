public class Beacons {

    private int id;
    private String deviceName;
    private String macAddress;
    private float longitude;
    private float latitude;
    private int floor;

    public void setId(int id) {
        this.id = id;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getId() {
        return this.id;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return this.latitude;
    }

    public int getFloor() {
        return this.floor;
    }

    @Override
    public String toString() {
        return "Beacon"+id+"{" +
                "id=" + id +
                ", deviceName='" + deviceName + '\'' +
                ", macAddress='" + macAddress + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", floor=" + floor +
                '}';
    }
}