package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {

    public void ejercicio1(){

        Scanner teclado = new Scanner(System.in);

        boolean err = true;
        int trim1 = 0;
        int trim2 = 0;
        int trim3 = 0;

        while(err==true){
            try{
                System.out.println("Introduce la nota del primer trimestre (0-10): ");
                trim1 = teclado.nextInt();
                System.out.println("Introduce la nota del segundo trimestre (0-10): ");
                trim2 = teclado.nextInt();
                System.out.println("Introduce la nota del tercer trimestre (0-10): ");
                trim3 = teclado.nextInt();

                if (trim1>=0 && trim2>=0 && trim3>=0 && trim1<=10 && trim2<=10 && trim3<=10){
                    err=false;
                }else{
                    System.out.println("Nota fuera de rango (0-10). Vuelve a introducirlas...");
                }

            }catch (InputMismatchException e){
                System.out.println("El valor introducido no tiene formato numérico. Vuelve a introducirlas...");
                teclado.nextLine();
            }
        }

        float suma_notas = trim1 + trim2 + trim3;
        float media = suma_notas/3;

        System.out.println("La media obtenida es " + media);

        if (media >=5){
            System.out.println("APROBADO.");
        }else{
            System.out.println("SUSPENSO.");
        }

    }

    public void ejercicio2(){

        Scanner teclado = new Scanner(System.in);

        boolean err=true;
        int num = 0;

        while (err==true) {
            try{
                System.out.println("Introduce un número...");
                num = teclado.nextInt();
                err=false;
            }catch (InputMismatchException e){
                System.out.println("ERROR. Introduce un formato válido...");
                teclado.nextLine();
            }
        }

        if (num<0){
            num = num * -1;
        }

        System.out.println("El valor absoluto es " + num);

    }
}
