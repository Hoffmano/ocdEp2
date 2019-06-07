package main;

import computer.Ram;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JFrame;

//classe mestra o Main onde tudo começa
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
