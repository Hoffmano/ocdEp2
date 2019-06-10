package main;

import computer.Ram;

//classe mestra o Main onde tudo começa
//version 1.0

public class Main {
    
    public static Ram ram = new Ram();
    public static Frame frame = new Frame();
    
    
    public static String toHex(int i){
        return Integer.toHexString(i);
    }
    
    public static int toInt(String s){
        return Integer.parseInt(s, 16);
    }
    
    public static void main(String[] args) {
//        System.out.println(toInt("fff"));
//        System.out.println(toInt("kqa"));
        frame.setVisible(true);   
        
    }

}
