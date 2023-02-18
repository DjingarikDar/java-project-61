package hexlet.code;

import static java.util.Arrays.fill;

public class PrimeNumber {
    public static int[] getPrimeArray(int endNumber) {
        if (endNumber < 1) {
            return new int[0];
        }
        if (endNumber < 2) {
            return new int[]{1};
        }
        int[] numberArray = new int[endNumber + 1];
        fill(numberArray, 1);
        numberArray[0] = 0;
        numberArray[1] = 1;
        numberArray[2] = 1;
        for (int i = 2; i < numberArray.length; i += 2) {
            numberArray[i] = 0;
        }
        int startIndex = 3;
        for (int i = startIndex; i * i < numberArray.length; i += 2) {
            if (numberArray[i] == 1) {
                for (int j = i + i; j < numberArray.length; j = j + i) {
                    numberArray[j] = 0;
                }
            }
        }
        int indexForPrimeArray = 0;
        for (int item : numberArray) {
            indexForPrimeArray += item;
        }
        int[] primeNumberArray = new int[indexForPrimeArray];

        indexForPrimeArray = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == 1) {
                primeNumberArray[indexForPrimeArray] = i;
                indexForPrimeArray++;
            }
        }
        return primeNumberArray;
    }
}
