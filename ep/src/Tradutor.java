
import computer.MemoryObject;
import computer.Ram;
import java.util.Scanner;


public class Tradutor {
    
    public static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    
    public void decodifica(String code){
        
        Ram ram = new Ram();
                
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
                                        if(isNumeric(parametroB)){
//                                            MemoryObject newMemoryObject = new MemoryObject(parametroB);
//                                            ram.insert(newMemoryObject);
                                        }
                                }
                                break;
                        }
                        break;
                }

                //debug println
                //System.out.println(hexValue);




        }

    }

}
