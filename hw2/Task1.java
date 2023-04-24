package hw2;

import java.util.Scanner;

/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */

public class Task1 {

    public static void main(String[] args) {
        float number = getFloat();
        System.out.println("Вы ввели " + number);
    }

    public static float getFloat(){
        Scanner enterNumber = new Scanner(System.in);
        float number;
        //boolean isFloat = false;
        while(true) {
            System.out.println("Введите число типа float: ");
            //String data = enterNumber.nextLine();
            try {
                number = Float.parseFloat(enterNumber.nextLine());
                return number;
                //isFloat = true;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Повторите попытку.");
                return getFloat();
            }
        }
        
    }
}
