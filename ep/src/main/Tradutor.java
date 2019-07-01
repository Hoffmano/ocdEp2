package main;


import computer.MemoryObject;
import java.util.Scanner;


public class Tradutor {
    
    
    int nextEmpyt = 0;
    boolean c = false;
    
    public static String padronizaW(String s){
        
        String aux = "";
        for(int i = 16 - s.length(); i > 0; i--){
            aux += "0";
        }
        return aux + s;
    }
    
    public static String padronizaAddress(String s){
        
        String aux = "";
        for(int i = 5 - s.length(); i > 0; i--){
            aux += "0";
        }
        return aux + s;
    }
    
    public static boolean isHexString(String strNum) {
        if(strNum.length() > 4) {
            System.out.println("Tradutor.isHexString(): error length > 4");
            System.exit(1);
        }
        
       
  
        int aux = Integer.parseInt(strNum,16);  
   
        
        
        
        return true;
    }
    
    public void decodifica(String code){
        
        int tA = -1;
        int tB = -1;
        
        //possiveis parametros
        int vazio = 0;
        int regs = 1;
        int eRegs = 2;
        int cons = 3;
        int eCons = 4;
                
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

                String op = "";
                String a = "";
                String b = "";
                
                
                //preencher as referencias hexadecimais
                switch(parametroB){
                    case(""):
                        tB = vazio;
                        break;
                    case("ax"):
                        tB = regs;
                        b = "00000";
                        break;
                    case("bx"):
                        tB = regs; 
                        b = "00001";
                        break;
                    case("cx"):
                        tB = regs; 
                        b = "00010";
                        break;
                    case("dx"):
                        tB = regs; 
                        b = "00011";
                        break;
                    case("[ax]"):
                        tB = eRegs;
                        b = "00000";
                        break;
                    case("[bx]"):
                        tB = eRegs; 
                        b = "00001";
                        break;
                    case("[cx]"):
                        tB = eRegs; 
                        b = "00010";
                        break;
                    case("[dx]"):
                        tB = eRegs; 
                        b = "00011";
                        break;
                    default:
                        parametroB = parametroB.replace('[',']');
                        String[] aux = parametroB.split("]");
                        if(aux.length == 1){
                            isHexString(parametroB);
                            c = true;
                            MemoryObject objB = new MemoryObject(Main.toHex(nextEmpyt + 1), padronizaW(parametroB));
                            Main.ram.insert(objB);
                            tB = cons;
                            b += padronizaAddress(Main.toHex(nextEmpyt + 1));
                        }
                        else{
                            parametroB = aux[1];
                            isHexString(parametroB);
                            c = true;
                            MemoryObject objB = new MemoryObject(Main.toHex(nextEmpyt + 1), padronizaW(parametroB));
                            Main.ram.insert(objB);
                            tB = eCons;
                            b += padronizaAddress(Main.toHex(nextEmpyt + 1));

                        }
                            
                }
                
                switch(parametroA){
                    case(""):
                        tA = vazio;
                        break;
                    case("ax"):
                        tA = regs;
                        a = "00000";
                        break;
                    case("bx"):
                        tA = regs; 
                        a = "00001";
                        break;
                    case("cx"):
                        tA = regs; 
                        a = "00010";
                        break;
                    case("dx"):
                        tA = regs; 
                        a = "00011";
                        break;
                    case("[ax]"):
                        tA = eRegs;
                        a = "00000";
                        break;
                    case("[bx]"):
                        tA = eRegs; 
                        a = "00001";
                        break;
                    case("[cx]"):
                        tA = eRegs; 
                        a = "00010";
                        break;
                    case("[dx]"):
                        tA = eRegs; 
                        a = "00011";
                        break;
                    default:
                        parametroA = parametroA.replace('[',']');
                        String[] aux = parametroA.split("]");
                        if(aux.length == 1){
                            isHexString(parametroA);
                            c = true;
                            MemoryObject objA = new MemoryObject(Main.toHex(nextEmpyt + 1), padronizaW(parametroA));
                            Main.ram.insert(objA);
                            tA = cons;
                            a += padronizaAddress(Main.toHex(nextEmpyt + 1));
                        }
                        else{
                            parametroA = aux[1];
                            isHexString(parametroA);
                            c = true;
                            MemoryObject objA = new MemoryObject(Main.toHex(nextEmpyt + 1), padronizaW(parametroA));
                            Main.ram.insert(objA);
                            tA = eCons;
                            a += padronizaAddress(Main.toHex(nextEmpyt + 1));

                        }
                            
                }
                
                switch(operacao){
                    case("mov"):
                        if(tA == regs && tB == regs) op += "000000";
                        else if(tA == regs && tB == cons) op += "000001";
                        else if(tA == eRegs && tB == regs) op += "000010";
                        else if(tA == eRegs && tB == cons) op += "000011";
                        else if(tA == eCons && tB == regs) op += "000100";
                        else if(tA == eCons && tB == cons) op += "000101";
                        else if(tA == regs && tB == eCons) op += "000110";
                        else if(tA == regs && tB == eRegs) op += "000111";
                        break;
                }


                hexValue += op + a + b;
                
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
