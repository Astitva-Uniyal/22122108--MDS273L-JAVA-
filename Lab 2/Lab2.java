import java.util.*;

class Lab2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i = 1; 
        int ch = 1; // variable to continue the loop or exit
        int n = 0; // variable to store user choice
        String temp; // temporary variable to store the entered name
        String[] names = new String[1024]; // array to store the names

        // loop to continue the program until user presses 0 to exit
        do {
            System.out.println(
                    "What do you want to do? \n 1. Enter a Name. \n 2. Remove a Name. \n 3. Search for a Name \n 4. Show all Names \n");
            n = Integer.parseInt(s.nextLine()); // get user choice

            // switch case to perform action based on user choice
            switch (n) {

                case 1:
                    System.out.println("Enter name");
                    temp = s.nextLine();
                    for (int j = 0; j < i; j++) {
                        // check if the name already exists
                        if (temp.equals(names[j])) {
                            System.out.println("Name already Exists");
                        }
                        // if name does not exist, add it to the array
                        else {
                            names[i-1] = temp;
                            i++;
                        }

                    }
                    break;

                case 2:
                    int k = 0;
                    System.out.println("Enter name to remove");
                    temp = s.nextLine();
                    // loop to remove the entered name from the array
                    do {
                        if (temp.equals(names[k])) {
                            // shift all elements to left after the removed element
                            for (int j = k; j < i; j++) {
                                names[j] = names[j + 1];
                            }
                            i--; // decrement the number of names
                        }
                        k++;
                    } while (k < i);
                    break;

                case 3:
                    k = 0;
                    System.out.println("Enter Name to Search");
                    temp = s.nextLine();
                    // loop to search for the entered name in the array
                    do {
                        if (temp.equals(names[k])) {
                            System.out.println("Name found at " + k + "th position");
                            }
                        k++;
                    } while (k < i);

                    break;

                case 4:
                    k = 0;
                    // loop to print all names
                    do {
                        System.out.print(names[k] + "  ");
                        k++;

                    } while (k < i);
                    break;

                default:
                    System.out.println("Enter Valid Response!!!");
                    break;

            }

            System.out.println("Press 0 to exit");
            ch = Integer.parseInt(s.nextLine()); // get user choice to continue or exit
        } while (ch != 0);

        s.close();
    }
}
