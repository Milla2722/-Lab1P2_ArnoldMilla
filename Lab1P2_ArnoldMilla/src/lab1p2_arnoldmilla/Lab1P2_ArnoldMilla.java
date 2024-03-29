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
                                                                                            /////Array list de strings
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
                    System.out.println(año);
                    /////validación de la fecha, no me funciono hacerlo con días y meses por lo tanto solo hice año
                    if (año > añoA - 13){
                        System.out.println("Usted es menor de edad");
                        break;
                    }
                    else{
                        usuario += fecha;
                        usuario += ";";
                    }

                    System.out.println("Ingrese su correo electronico");
                        ///////////////////intento de hacer redex, funciona la redex cuando retorna falso pero se queda atorado al ser verdadero
                    boolean valid = ValidarCorreo(sc.next());
                    System.out.println(valid);
                    while(valid == false){
                        System.out.println("Correo invalido, ingrese otro correo electronico");
                       valid = ValidarCorreo(sc.next());
                    }
                    if (valid == true){
                       usuario += sc.next();                    
                        usuario += ";";
                    }
                    
                    System.out.println("Ingrese su contraseña");
                    boolean verif = Contra(sc.next());
                    
                    if (verif == true){
                        usuario += sc.next();
                        usuario += ";";
                    }
                    while (verif == false){
                        System.out.println("Contraseña no valida, ingrese otra contraseña con caracteres especiales");
                        verif = Contra(sc.next());
                    }
                    
                    System.out.println("Usuario registrado");
                    registro.add(usuario);
                }break;
            
                case 2:{
                    Listar(registro);
                }break;
                    
                case 3:{
                    Ordenar(registro); 
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
    
    public static void Listar (ArrayList <String> registro){
        for (int contador = 0; contador < registro.size(); contador++) {
            System.out.println(registro.get(contador));
            System.out.println("\n");
        }
    }

    public static void Ordenar (ArrayList<String> registro){
        //// Se me olvido como hacer el bubble sort y no quiero perder tiempo buscando como hacerlo así que hare 6 fors
        System.out.println("Gmail:");
        for (int cont = 0; cont < registro.size(); cont++) {
            String [] dominio = (registro.get(cont)).split(";");
            boolean contiene = (dominio[3]).contains("gmail");
            if (contiene == true){
                System.out.println(registro.get(cont));
            }
        }
        System.out.println("Outlook:");
        for (int cont = 0; cont < registro.size(); cont++) {
            String [] dominio = (registro.get(cont)).split(";");
            boolean contiene = (dominio[3]).contains("outlook");
            if (contiene == true){
                System.out.println(registro.get(cont));
            }
        }
        System.out.println("Yahoo:");
        for (int cont = 0; cont < registro.size(); cont++) {
            String [] dominio = (registro.get(cont)).split(";");
            boolean contiene = (dominio[3]).contains("yahoo");
            if (contiene == true){
                System.out.println(registro.get(cont));
            }
        }
        System.out.println("ICloud: ");
        for (int cont = 0; cont < registro.size(); cont++) {
            String [] dominio = (registro.get(cont)).split(";");
            boolean contiene = (dominio[3]).contains("icloud");
            if (contiene == true){
                System.out.println(registro.get(cont));
            }
        }
        System.out.println("ProtonMail");
        for (int cont = 0; cont < registro.size(); cont++) {
            String [] dominio = (registro.get(cont)).split(";");
            boolean contiene = (dominio[3]).contains("proton");
            if (contiene == true){
                System.out.println(registro.get(cont));
            }
        }
        System.out.println("FastMail");
        for (int cont = 0; cont < registro.size(); cont++) {
            String [] dominio = (registro.get(cont)).split(";");
            boolean contiene = (dominio[3]).contains("fast");
            if (contiene == true){
                System.out.println(registro.get(cont));
            }
        }
    }
    
    public static boolean Contra(String contra){
        boolean valid = false;
        
        for (int c = 0; c < contra.length(); c++) {
            char letra = contra.charAt(c);

            if ((letra < 48 && letra > 32) || (letra > 57 && letra < 65)) {
                valid = true;  
            }
        }
        
        return valid;
    }
    
    public static boolean ValidarCorreo(String correo){
        String regex = "^[a-zA-Z0-9._%&$+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
}
