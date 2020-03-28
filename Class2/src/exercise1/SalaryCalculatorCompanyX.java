package exercise1;

import java.util.Scanner;

public class SalaryCalculatorCompanyX {

    public static void main(String arg[]){
        double weekSalary = 1000;
        double bonus = 150;
        int salesBonus = 10;

        System.out.println("Entre la cantidad de ventas realizadas por el empleado");
        Scanner scanner = new Scanner(System.in);
        int salesEmployee = scanner.nextInt();
        scanner.close();

        if(salesEmployee > salesBonus) {
            weekSalary = weekSalary + bonus;
        }

        System.out.println("El salario del empleado de de $ " + weekSalary);
    }
}
