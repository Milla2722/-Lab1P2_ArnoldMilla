package lab1p2_arnoldmilla;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

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
        ArrayList <String> registro = new ArrayList<>();
        while (opc <= 4){
            switch (opc){
                case 1:{  
                    String usuario = "";
                    System.out.println("Ingrese su nombre");
                    usuario += sc.next();
                    usuario += ";";
                    System.out.println("Ingrese su apellido");
                    usuario += sc.next();
                    usuario += ";";
                    System.out.println("Ingrese su fecha de nacimiento formato dd/MM/yyyy");
                    String fecha = sc.next();
                    Date fechaD = new Date(fecha);
                    int año = fechaD.getYear();
                    if (año > 111){
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
                    System.out.println(registro);
                }break;
            
                case 3:{
            
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
    
}
