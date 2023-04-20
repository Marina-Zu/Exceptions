//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task1 {
    public static void main(String[] args) {
        String[] sArray = {"a", null, "b"};
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        divide(10, 2);
        valueByIndex(array,10);
        printStringArray(sArray);

    }
    // division by zero
    public static void divide(int firstNum, int secondNum){
        if(secondNum == 0) throw new RuntimeException("На ноль делить нельзя");
        int result = firstNum/secondNum;
        System.out.printf(" %d : %d = %d\n", firstNum, secondNum, result);
    }

    // index outside the array
    public static void valueByIndex(int[] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента c таким индексом не существует");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

    // Null pointer exception
    public static void printStringArray(String[] sArray){
        for (String item: sArray){
            if(item == null) throw new NullPointerException("Данный элемент отсутствует");
            System.out.println(item);
        }
    }
}
