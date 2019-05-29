package main;


import computer.MemoryObject;
import computer.Ram;
import java.util.Scanner;


public class Tradutor {
    
    int nextEmpyt = 0;
    boolean c = false;
    
    
    
    public static boolean isHexString(String strNum) {
        if(strNum.length() > 16) return false;
        
        try{
            Main.toInt(strNum);
        }
        catch(NumberFormatException e){
            System.out.println("not hex string error");
            System.exit(1);
        }
        
        
        return true;
    }
    
    public void decodifica(String code){
        
        
                
        // executar a decodificação do codigo
        Scanner scanner = new Scanner(code);
        while (scanner.hasNextLine()){
            
                //quebrar a string nos termos desajados
                String entrada = scanner.nextLine();
                //seapra a entrada em opcode e parametros
                String[] elementos = entrada.split(" ");
                //separa os parametros, caso haja mais de um
                String[] parametros = elementos[1].split(",");

                //da nome aos elementos
                String operacao = elementos[0];
                String parametroA = parametros[0];
                String parametroB;
                if(parametros.length == 2){
                    parametroB = parametros[1];
                }
                else{
                    parametroB = "";
                }

                String hexValue = "";

                switch(operacao){
                    case "mov":
                        switch(parametroA){
                            case "ax":
                                switch(parametroB){
                                    case "ax":
                                        //mov ax,ax
                                        hexValue = "000000";
                                        hexValue += "00000";
                                        hexValue += "10000";
                                        break;
                                    case "bx":
                                        //mov ax,bx
                                        hexValue = "000000";
                                        hexValue += "00000";
                                        hexValue += "10001";
                                        break;
                                    case "cx":
                                        //mov ax,cx
                                        hexValue = "000000";
                                        hexValue += "00000";
                                        hexValue += "10010";
                                        break;
                                    case "dx":
                                        //mov ax,dx
                                        hexValue = "000000";
                                        hexValue += "00000";
                                        hexValue += "10011";
                                        break;
                                    case "[ax]":
                                        //mov ax,[ax]
                                        hexValue = "000111";
                                        hexValue += "00000";
                                        hexValue += "10000";
                                        break;
                                    default:
                                        if(isHexString(parametroB)){
                                            c = true;
                                            MemoryObject obj = new MemoryObject(Main.toHex(nextEmpyt + 1), parametroB);
                                            Main.ram.insert(obj);
                                            hexValue = "000111";
                                            hexValue += "00000";
                                            hexValue += Main.toHex(nextEmpyt + 1);
                                        }
//                                        else(parametroB.charAt(0) == '['){
//                                            int i = 0;
//                                        }
                                        
                                }
                                break;
                            case "[ax]":
                            case "bx":
                            case "[bx]":
                            case "cx":
                            case "[cx]":
                            case "dx":
                            case "[dx]":
                            default:
                            
                        }
                        break;
                }

                
                MemoryObject obj = new MemoryObject(Main.toHex(nextEmpyt), hexValue);
                Main.ram.insert(obj);
                
                if(c == true){
                    nextEmpyt += 2;
                }
                else{
                    nextEmpyt += 1;
                }
                c = false;
                
                

        }


    }

}
