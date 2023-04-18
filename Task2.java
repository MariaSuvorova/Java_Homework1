// Вывести все простые числа от 1 до 1000 

package Homework1;

public class Task2 {
    public static void main(String[] args) {
        System.out.printf("Простые числа от 1 до 1000: 2 ");
        for (int i = 3; i < 1001; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                } 
            }
                if (flag == true){
                System.out.printf("%d ", i);
                }   
        }
    }
}
