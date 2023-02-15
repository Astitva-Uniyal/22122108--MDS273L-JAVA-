import java.util.*;

public class Lab3 {

    // method to calculate the mean of the given array
    static float mean(int[] arr) {
        float m = 0;
        float s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        m = s / arr.length;
        return m;
    }

    // method to calculate the median of the given array
    static int median(int[] arr) {
        int m = 0;
        int s = arr.length;
        if (s % 2 == 0) {
            m = arr[(s / 2) - 1];
        } else {
            m = arr[((s + 1) / 2)];
        }
        return m;
    }

    // method to calculate the mode of the given array
    static int mode(int[] arr) {
        int c = 0;
        int max = 0;
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            c = 0;
            for (int j = 0; j <= i; j++) {
                if (arr[i] == arr[j]) {
                    ++c;
                }
                if (c > max && c > 1) {
                    max = c;
                    m = arr[i];
                }

            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[0];
        int n = 0;
        int ch = 0;

        // loop to get inputs from user and add them to the array
        while (true) {
            System.out.print("Enter a number or 'n' to stop: ");
            String input = s.nextLine();

            if (input.equalsIgnoreCase("n")) {
                break;
            }

            int num = Integer.parseInt(input);
            int[] newArr = new int[arr.length + 1]; // create a new array with increased length
            System.arraycopy(arr, 0, newArr, 0, arr.length); // copy the old array to the new array
            newArr[newArr.length - 1] = num; // add the new input to the new array
            arr = newArr; // set the new array as the current array
        }

        // check if the array is empty
        if (arr.length == 0) {
            System.out.println("Array is empty");
        } else {

            do {
                // display the options for the user
                System.out.println(
                        "What do you want to do? \n 1. Find Mean. \n 2. Find Median. \n 3. Find Mode.  \n 4.All?");
                n = Integer.parseInt(s.nextLine());

                switch (n) {

                    case 1:
                        // call the mean method and display the result
                        System.out.println("Mean of array is " + mean(arr));
                        break;

                    case 2:
                        // call the median method and display the result
                        System.out.println("Median of array is " + median(arr));
                        break;

                    case 3:
                        // call the mode method and display the result
                        System.out.println("Mode of array is " + mode(arr));
                        break;

                    case 4:
                        // call all the methods and display the results
                        System.out.println("Mean of array is " + mean(arr));
                        System.out.println("Median of array is " + median(arr));
                        System.out.println("Mode of array is " + mode(arr));
                        break;

                    default:
                        System.out.println("Choose Correct Option.");
                        break;

                }

                // Ask the user if they want to continue or exit
                System.out.println("Press 0 to continue");
                ch = Integer.parseInt(s.nextLine());
            } while (ch == 0);

        }

        s.close();
    }
}
