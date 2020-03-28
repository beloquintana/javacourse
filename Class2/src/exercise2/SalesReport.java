package exercise2;

import java.util.Scanner;

public class SalesReport {

    public static void main(String arg[]){

        int salesBse = 5;

        System.out.println("Entre el numero de ventas que hizo en la semana");
        Scanner scanner = new Scanner(System.in);
        int salesEmployee = scanner.nextInt();
        scanner.close();

        if(salesEmployee >= salesBse){
            System.out.println("Felicitaciones! Llegaste al numero de ventas semanales");
        }else{
            int salesMissing = salesBse - salesEmployee;
            System.out.println("Usted no cumplio con las ventas semanales. Le faltaron " + salesMissing + " ventas");
        }

    }
}
