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
              



