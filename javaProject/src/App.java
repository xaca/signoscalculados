import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) throws Exception {                           //Inicio

        Scanner user = new Scanner(System.in);
        String name;
        int eleccion1 = 0;

        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       Hola");
        System.out.println("        / /__\\ \\      ¿Como deseas que te llame?");
        System.out.println("        \\/____\\/");
        System.out.println("");
        name = user.nextLine();

        try {
            eleccion1 = menu(name);
            queHacer(eleccion1, name);
        } catch (Exception InputMismatchException) {
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Recuerda que las opciones son numeros");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
            otraVez(name);
        }

    }

    static int menu(String name){                                                       //Menu
        System.out.println("");
        int option;
        Scanner user = new Scanner(System.in);

        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       Okay " + name + ", ¿Que deseas hacer?");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");

        System.out.println("    __| |____________________________________________| |__");
        System.out.println("    (__   ____________________________________________   __)");
        System.out.println("      | |                                            | |");
        System.out.println("      | |   1. Saber tu signo zodiacal                 | |");
        System.out.println("      | |   2. Saber cuantos dias has vivido         | |");
        System.out.println("      | |   3. Saber tu edad en años perro           | |");
        System.out.println("      | |   4. Saber tu numero segun la numerologia  | |");
        System.out.println("     _| |____________________________________________| |__");
        System.out.println("    (__   ____________________________________________   __)");
        System.out.println("       | |                                            | |");
        System.out.println("");
        option = user.nextInt();

        return option;
    }

    static void queHacer(int eleccion, String name){                              //Dice Que Hacer Al Programa
        if(eleccion == 1){
            String sZodiacal ="";
            try {
                sZodiacal = zodiaco(name);
            } catch (Exception InputMismatchException) {
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que los datos son en numeros no el letras");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Tu signo zodiacal es: " + sZodiacal);
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
        }else if(eleccion == 2){
            int dVividos = dias();
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Tu has vivido: " + dVividos + " dias");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
        }else if(eleccion == 3){
            float aPerro = añosPerros();
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Tu tienes: " + df.format(aPerro) + " años perro");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
        }
        else if(eleccion == 4){
            int nNum = numeroLogia(name);
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Tu numero segun la numerologia es: " + nNum );
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
        }else{
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       El Numero ingresado no es una opcion valida");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");

            otraVez(name);
        }
        algoMas(name);
    }

    static String zodiaco(String name) {                                                           //Signo Zodiacal
        System.out.println("");
        Scanner user = new Scanner(System.in);
        int mes;
        int dia;
        String signo = "";

        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       Para eso necesito:");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");

        System.out.println("     .-^-.");
        System.out.println("    '\"'|`\"` Tu mes de nacimiento (en numero): ");
        System.out.println("       j");
        System.out.println("");
        mes = user.nextInt();
        System.out.println("");

        System.out.println("     .-^-.");
        System.out.println("    '\"'|`\"` Y tu dia de nacimiento: ");
        System.out.println("       j");
        System.out.println("");
        dia = user.nextInt();
        System.out.println("");

        if(mes == 1){
            if(dia <= 20){
                signo = "Capricornio";
            }else if(dia <=31){
                signo = "Acuario";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que enero solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 2){
            if(dia > 29){
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que febrero solo tiene maximo 29 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }else if(dia <= 19){
                signo = "Acuario";
            }else{
                signo = "Piscis";
            }
        }else if(mes == 3){
            if(dia <= 20){
                signo = "Piscis";
            }else if (dia <= 31){
                signo = "Aries";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que marzo solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 4){
            if(dia <= 20){
                signo = "Aries";
            }else if(dia <= 30) {
                signo = "Tauro";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que abril solo tiene 30 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 5){
            if(dia <= 21){
                signo = "Tauro";
            }else if(dia <= 31){
                signo = "Geminis";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que mayo solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 6){
            if(dia <= 21){
                signo = "Geminis";
            }else if(dia <= 30){
                signo = "Cancer";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que junio solo tiene 30 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
