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



