package lab1p2_arnoldmilla;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab1P2_ArnoldMilla {
static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("-------Menu-------");
        System.out.println("Ingrese una opcion: ");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Listar todo");
        System.out.println("3. Listar por dominio");
        System.out.println("4. Salir");
        int opc = sc.nextInt();
        String regexG = "^[a-zA-Z0-9._%&$+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String regexC = "";
        Pattern pt= Pattern.compile(regexG);
        Pattern dominioGmail= Pattern.compile("@gmail.com");
        //Matcher listar= dominioGmail.matcher();
                        
        ArrayList <String> registro = new ArrayList<>();
        while (opc < 4){
            switch (opc){
                case 1:{  
                    String usuario = "";
                    System.out.println("Ingrese su nombre");
                    usuario += sc.next();
                    usuario += ";";
                    System.out.println("Ingrese su apellido");
                    usuario += sc.next();
                    usuario += ";";
                    System.out.println("Ingrese su fecha de nacimiento formato yyyy/MM/dd");
                    String fecha = sc.next();
                    Date fechaD = new Date(fecha);
                    Date fechaA = new Date();
                    int año = fechaD.getYear();
                    int añoA = fechaA.getYear();
                    int mes = fechaD.getMonth();
                    int mesA = fechaA.getMonth();
                    int dia = fechaD.getDate();
                    int diaA = fechaA.getDate();
                    if ((año > añoA-13) && (mes >= mesA) && (dia > diaA)){
                        System.out.println("Usted es menor de edad");
                        break;
                    }                    
                    else {
                        usuario += fecha;
                        usuario += ";";
                    }
                    System.out.println("Ingrese su correo electronico");
                    usuario += sc.next();
                    usuario += ";";
                    System.out.println("Ingrese su contraseña");
                    usuario += sc.next();
                    usuario += ";";
                    registro.add(usuario);
                }break;
            
                case 2:{
                    listar(registro);
                }break;
            
                case 3:{
                    //Matcher match 
                }break;
            }
            System.out.println("-------Menu-------");
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Listar todo");
            System.out.println("3. Listar por dominio");
            System.out.println("4. Salir");
            opc = sc.nextInt();
        }
        
    }
    
    public static void listar (ArrayList <String> registro){
        for (int contador = 0; contador < registro.size(); contador++) {
            System.out.println(registro.get(contador));
            System.out.println("\n");
        }
    }    
}
