public class ArrayUtility {


    public static void print(int[] array) {
        System.out.println("Array One: ");
        System.out.println("Array Two: ");
        System.out.println("Array Three: ");
        System.out.println("Array Four: ");
    }

    public static int sum(int[] array) {

        int sum = 0;

        for (int i=0; i<array.length; i++) {
            sum +=array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;

        double truncated = (double)Math.floor(average * 100) / 100;

        return truncated;

    }

    public static int minimum(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }

        }
        return smallest;
    }

    public static int maximum(int[] array) {
        int largest = array[array.length-1];
        for (int i=1; i<array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
    public static int evenCount(int[] array) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] % 2 == 0 ) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
       int length  = array.length;
       int[] reversedArray = new int[length];
       for (int i=0; i<array.length; i++) {
           reversedArray[i] = array[length -1 -i];
       }
       return reversedArray;
    }

    public static void reverseTwo(int[] array) {
        int length  = array.length;
        for (int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[length -1 -i];
            array[length -1 -i] = temp;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i=0; i<array.length; i++) {
            if (array[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i=0; i<array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i=0; i<array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for(int i=0; i<array.length; i++) {
            String element = String.valueOf(array[i]);
            if(i > 0) {
                result += ", ";
            }
            result += element;
        }
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int temp = array[array.length-1];
        for(int i=array.length-1; i>0; i--) {
            array[i] = array[i-1];
        }
        array[0] = temp;

    }

    public static void shiftLeft(int[] array) {
        int temp = array[0];
        for(int i=0; i<array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = temp;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for(int i=0; i<n; i++) {
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for(int i=0; i<n; i++) {
            shiftLeft(array);
        }
    }


}
