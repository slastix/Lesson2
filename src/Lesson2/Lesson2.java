package Lesson2;

/**
 * Created by Kola on 07.04.15.
 */
public class Lesson2 {
    public static void main(String[] args) {
        char ch = 'c';
        System.out.println((int)ch); //явное преобразование типов

        int[] array = new int[20];
        int i = 0;
        while(i < array.length){
            array[i] = (int)(Math.random()*200-100);
            i++;//i = i + 1
            // i+=2;  --> i = i + 2
        }
        System.out.println();
        //for (int j = 0; j < array.length; j++) {
        //
        //}
        for (int j = 0; j < array.length; j++) {
            System.out.printf("%4d",array[j]);
        }
        System.out.println();
        System.out.println();
        for (int k = 0; k < 9 ; k++) {
            for (int l = 0; l < 9; l++) {
                System.out.printf("%3d", (l + 1) * (k + 1));

            }
            System.out.println();
        }
    }
}
