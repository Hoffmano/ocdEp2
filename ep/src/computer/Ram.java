package computer;

import java.util.LinkedList;
import java.util.*;
import computer.MemoryObject;

public class Ram {
    
    LinkedList<MemoryObject> linkedList = new LinkedList<MemoryObject>();
    
    

    public void insert(MemoryObject memoryObject) {
        

        linkedList.add(memoryObject);

    }
    
    public void remove(MemoryObject memoryObject) {

        linkedList.remove(memoryObject);

    }

    public String getAddress(LinkedList linkedList, String hexValue) {
        Iterator<MemoryObject> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            MemoryObject memoryObject = iterator.next();
            if(memoryObject.hexValue.equals(hexValue)){
                return memoryObject.address;
                
            }
        }
        return null;
    }
    
    public String getHexvalue(LinkedList linkedList, String address) {
        Iterator<MemoryObject> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            MemoryObject memoryObject = iterator.next();
            if(memoryObject.address.equals(address)){
                return memoryObject.hexValue;
                
            }
        }
        return null;
    }

    public int proximaLinhaVazia(LinkedList linkedList){
        return linkedList.size();
    }
}
