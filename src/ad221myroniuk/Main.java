package ad221myroniuk;

public class Main
{
    // 1 задание:
    public static boolean checkArray(int[] arr)
    {
        if (arr.length < 2)
        {
            return false; // Массив должен быть длиной 2 или более
        }

        for (int i = 1; i < arr.length; i++) //Проверка, что каждый элемент больше или равен предыдущему

        {
            if (arr[i] < arr[i - 1])
            {
                return false;
            }
        }
        return true;
    }
    // 2 задание:
    public static void fizzBuzz()
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    // 3 задание:
    public static boolean canSplitArray(int[] arr)
    {
        if (arr.length < 2)
        {
            return false; // Массив должен быть длиной 2 или более
        }

        int totalSum = 0;
        for (int num : arr)
        {
            totalSum += num;
        }

        if (totalSum % 2 != 0)
        {
            return false; // Если сумма элементов нечетная, нельзя разделить равными частями
        }

        int halfSum = totalSum / 2;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            currentSum += arr[i];
            if (currentSum == halfSum)
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args)
    {
        int[] arr1 = {1, 1, 1, 2, 1};
        int[] arr2 = {2, 1, 1, 2, 1};
        int[] arr3 = {10, 10};

        // Вызов метода для проверки каждого элемента массива
        boolean result1 = checkArray(arr1);
        boolean result2 = checkArray(arr2);

        // Вызов метода для проверки разделения массива
        boolean result3 = canSplitArray(arr3);

        // Вывод результатов в терминал
        System.out.println("Результат проверки массива arr1: " + result1); // Выведет true
        System.out.println("Результат проверки массива arr2: " + result2); // Выведет false
        System.out.println("Результат проверки разделения массива arr3: " + result3); // Выведет true

        // Вызов метода для игры FizzBuzz.
        fizzBuzz();
    }

}