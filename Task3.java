// Реализовать простой калькулятор
package Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"866");
        // Посимвольный ввод
        // System.out.print("Первое число:  ");
        // int num1 = Integer.parseInt(scanner.nextLine());
        // System.out.print("Действие:  ");
        // char operation = scanner.nextLine().charAt(0);
        // System.out.print("Второе число:  ");
        // int num2 = Integer.parseInt(scanner.nextLine());
        
        // Ввод в одну строку
        System.out.println("Что вычисляем? ");
        String str = scanner.nextLine();
        String[] parts = str.split("");
        int num1 = Integer.parseInt(parts[0]);
        String strOp = parts[1];
        char operation = strOp.charAt(0);    
        int num2 = Integer.parseInt(parts[2]);
        scanner.close(); 
        //System.out.println(Arrays.toString(parts));

        int result = 0;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
        }
        System.out.printf("%d %c %d = %d\n", num1, operation, num2, result);
    
    }
}
