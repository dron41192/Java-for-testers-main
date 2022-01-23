package task_4_1;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        int min = -10;
        int max = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (max - min)) + min);
        }

        System.out.print("Start array: ");

        for (int i: array) {
            System.out.print(i + " ");
        }

        int indexOfMinPositiveNumber = getIndexOfMinPositiveNumber(array);
        int indexOfMaxNegativeNumber = getIndexOfMaxNegativeNumber(array);

        System.out.println();
        System.out.println("Min positive number index: " + indexOfMinPositiveNumber);
        System.out.println("Max negative number index: " + indexOfMaxNegativeNumber);

        reverse(array, indexOfMinPositiveNumber, indexOfMaxNegativeNumber);

        System.out.print("New array: ");

        for (int i: array) {
            System.out.print(i + " ");
        }
    }

    /**
     * @param array is array of random numbers.
     * @return returns the index of the minimum positive number.
     */
    public static int getIndexOfMinPositiveNumber(int[] array){
        int index = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0 && min > array[i])
            {
                min = array[i];
                index = i;
            }
        }

        return index;
    }

    /**
     * @param array is array of random numbers.
     * @return returns the index of the maximum negative number.
     */
    public static int getIndexOfMaxNegativeNumber(int[] array){
        int index = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++) {
            if(array[i] < 0 && max < array[i])
            {
                max = array[i];
                index = i;
            }
        }

        return index;
    }

    /**
     * Swaps two numbers.
     * @param array is array of random numbers.
     * @param indexOfMinPositiveNumber is the index of the minimum positive number.
     * @param indexOfMaxNegativeNumber is the index of the maximum negative number.
     */
    public static void reverse(int[] array, int indexOfMinPositiveNumber, int indexOfMaxNegativeNumber) {
        int temp = array[indexOfMinPositiveNumber];
        array[indexOfMinPositiveNumber] = array[indexOfMaxNegativeNumber];
        array[indexOfMaxNegativeNumber] = temp;
    }
}
