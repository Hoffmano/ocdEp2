
package computer;

public class MemoryObject {

    Ram ram = new Ram();
    public String address;
    public String hexValue;

    public MemoryObject(String address, String hexValue) {
        this.address = address;
        this.hexValue = hexValue;
    }    
}
