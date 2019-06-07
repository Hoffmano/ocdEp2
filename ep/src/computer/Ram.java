package computer;

import java.util.LinkedList;
import java.util.*;
import computer.MemoryObject;
import java.util.function.IntFunction;

public class Ram {
    
    public static LinkedList<MemoryObject> linkedList = new LinkedList<MemoryObject>();

    public static void printHexValue(){
        for (Iterator i = linkedList.iterator(); i.hasNext();) {
          MemoryObject obj = (MemoryObject) (i.next());
             System.out.println(obj.address + " " + obj.hexValue);
         }
    }

    

    public static void insert(MemoryObject memoryObject) {
        

        linkedList.add(memoryObject);

    }
    
    public static void remove(MemoryObject memoryObject) {

        linkedList.remove(memoryObject);

    }
    
    public static void clear(){
        linkedList.clear();
    }

    public static String getAddress(LinkedList linkedList, String hexValue) {
        Iterator<MemoryObject> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            MemoryObject memoryObject = iterator.next();
            if(memoryObject.hexValue.equals(hexValue)){
                return memoryObject.address;
                
            }
        }
        return null;
    }
    
    public static String getHexvalue(LinkedList linkedList, String address) {
        Iterator<MemoryObject> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            MemoryObject memoryObject = iterator.next();
            if(memoryObject.address.equals(address)){
                return memoryObject.hexValue;
                
            }
        }
        return null;
    }

    public static int proximaLinhaVazia(LinkedList linkedList){
        return linkedList.size();
    }
}
