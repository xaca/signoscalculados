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
        }else if(mes == 7){
            if(dia <= 22){
                signo = "Cancer";
            }else if(dia <= 31){
                signo = "Leo";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que julio solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 8){
            if(dia <= 23){
                signo = "Leo";
            }else if(dia <= 31){
                signo = "Virgo";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que agosto solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 9){
            if(dia <= 23){
                signo = "Virgo";
            }else if(dia <= 30){
                signo = "Libra";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que septiembre solo tiene 30 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 10){
            if(dia <= 23){
                signo = "Libra";
            }else if(dia <= 31){
                signo = "Scorpio";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que octubre solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 11){
            if(dia <= 22){
                signo = "Scorpio";
            }else if(dia <= 30){
                signo = "Sagitario";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que noviembre solo tiene 30 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 12){
            if(dia <= 21){
                signo = "Sagitario";
            }else if(dia <= 31){
                signo = "Capricornio";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que diciembre solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else{
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Recuerda que solo hay 12 meses y por lo tanto van de 1 a 12");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
            if(dia > 31){
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que todos los meses tienen alrededor de 30 o 31 dias a excepcion de febrero");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
            }
            otraVez(name);
        }

        return signo;
    }

    static int dias(){                                                                             //Dias vividos

        int dia;
        int mes;
        int año;
        int vivido = 0;

        System.out.println("");
        Scanner user = new Scanner(System.in);
        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       Para eso necesito:");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");

        System.out.println("     .-^-.");
        System.out.println("    '\"'|`\"` Tu año de nacimiento: ");
        System.out.println("       j");
        System.out.println("");
        año = user.nextInt();
        System.out.println("");

        Calendar fecha = new GregorianCalendar();
        mes = fecha.get(Calendar.MONTH);
        dia = fecha.get(Calendar.DATE);

        vivido = (((2021-año)*365) + ((mes+1)*30) + dia);
        if(vivido < 0){
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Al parecer aun no has nacido");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
        }
       return vivido;

    }

    static float añosPerros(){                                                                   //Edad en años perro
        float diasP = 0;
        float edad;

        System.out.println("");
        Scanner user = new Scanner(System.in);
        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       Para eso necesito:");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");

        System.out.println("     .-^-.");
        System.out.println("    '\"'|`\"` Tu edad: ");
        System.out.println("       j");
        System.out.println("");
        edad = user.nextFloat();
        System.out.println("");

        diasP = edad/7;

       return diasP;
    }

    static int numeroLogia(String name){                                                //calcula el numero - numerologia
        int numero = 0;
        int numeroP;
        int dNac;

        System.out.println("");
        Scanner user = new Scanner(System.in);
        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       Para eso necesito:");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");

        System.out.println("     .-^-.");
        System.out.println("    '\"'|`\"` Tu dia de nacimiento: ");
        System.out.println("       j");
        System.out.println("");
        dNac = user.nextInt();
        System.out.println("");

        if(dNac <= 31){
            numeroP = (dNac%10) + (dNac/10);
            numero = (numeroP%10) + (numeroP/10);
        }else{
            System.out.println("Recuerda: Los meses solo tienen maximo 31 dias");
            otraVez(name);
        }

        return numero;
    }

    static void otraVez(String name){                                                        //Reiniciar sin salir
        System.out.println("");
        Scanner user = new Scanner(System.in);

        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       ¿Deseas intentarlo otra vez?");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");
        System.out.println("a. Si");
        System.out.println("b. No");
        String quiero = user.nextLine();

        if(quiero.equals("a")){
            try {
                int eleccion = menu(name);
                queHacer(eleccion, name);
            } catch (Exception InputMismatchException) {
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que las opciones son numeros");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else{
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Hasta luego Buddy <3");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
            System.exit(0);
        }

    }

    static void algoMas(String name){                                                   //pregunta si quiere salir

        System.out.println("");
        Scanner user = new Scanner(System.in);

        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       ¿Deseas hacer algo mas?");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");
        System.out.println("a. Si");
        System.out.println("b. No");
        String mas = user.nextLine();

        if(mas.equals("a")){
            int eleccion = menu(name);
            queHacer(eleccion, name);
        }else{
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Hasta luego Buddy <3");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
            System.exit(0);
        }
    }

}