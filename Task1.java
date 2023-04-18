/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
(произведение чисел от 1 до n) */

package Homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int result_sum = 0;
        int result_fact = 1;
        for (int i = 1; i < number+1; i++) {
            result_sum += i;
            result_fact *= i;
        }
        System.out.printf("Треугольное число: %d\n", result_sum);
        System.out.printf("n! равен: %d\n", result_fact);
        
    }
        
}
    
