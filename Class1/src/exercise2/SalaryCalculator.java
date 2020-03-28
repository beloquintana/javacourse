package exercise2;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String arg[]){
        //Obtener el nombre del empleado
        System.out.println("Entre el nombre del empleado");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //Obtener la cantidad de horas trabajadas en el mes
        System.out.println("Entre el numero de horas que trabajo en el mes");
        double hoursWorked = scanner.nextDouble();

        //Obtener el valor hora del empleado
        System.out.println("Entre el valor hora al mes");
        double payRate = scanner.nextDouble();
        scanner.close();

        //Sumar los dos números
        double monthSalary = hoursWorked * payRate;
        //Mostrar el resultado de la suma
        System.out.println("El salario mensual del empleado " + name + " es de $" + monthSalary);

    }
}
