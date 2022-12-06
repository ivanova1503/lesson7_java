import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int razmer = scanner.nextInt();

        System.out.println("Введите значения массива");
        int[] newArray = new int[razmer];
        for (int i=0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }
        
        int count=0;
        for (int i=0; i < newArray.length; i++) {
            for (int j=0; j<array.length; j++) {
                if(newArray[i]==array[j]) {
                    count++;
                }
            }
        }
        if (count>0) {
            System.out.println("Данное значение имеется в константах");
        }
    }
}