package lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;

public class MainClassFromLessonOne {
    public static void main(String[] args) {
      

        exerciseOneHw(10);

        // 1.Задать одномерный массив и найти в нем минимальный и максимальный элементы
        
          private static void exerciseOneHw(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("минимальный элемент в массиве = %s\n", min);

        System.out.printf("максимальный элемент в массиве = %s", max);
    }
}

        exerciseTwoHw();

        /*2. Дан массив nums = [3,2,2,3] и число val = 3.
        /*Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.*/
        
         private static void exerciseTwoHw() {
        int[] arr = new int[]{3, 2, 2, 1, 5, 2, 2, 3};
        System.out.println(Arrays.toString(arr));
        int val = 3;
        int shift = 1;
        for (int i = 0; i < arr.length - shift; i++) {
            while (arr[arr.length - shift] == val) {
                shift++;
            }

            if (arr[i] == val) {
                int temp = arr[i];
                arr[i] = arr[arr.length - shift];
                arr[arr.length - shift] = temp;
                shift++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }



        exerciseThreeHw();

       /* 3*. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59*/
    }

    private static void exerciseThreeHw() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(LocalDateTime.now());
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        int hour = LocalDateTime.now().getHour();
        if ((hour >= 5) && (hour < 12)) {
            System.out.printf("Доброе утро , %s!\n", name);

        } else if ((hour >= 12) && (hour < 18)) {
            System.out.printf("Добрый день, %s!\n ", name);
        } else if ((hour >= 18) && (hour < 23)) {
            System.out.printf("Доброй вечер, %s!\n", name);
        } else {
            System.out.printf("Доброй ночи, %s!\n", name);
        }

        iScanner.close();

    }

   
  
