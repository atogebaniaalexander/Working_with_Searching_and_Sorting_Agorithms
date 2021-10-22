
import java.util.*;
public class Main {
    public static void stringInputs(Scanner num, String[] list) {
        int n = list.length;
        String item = "item";
        System.out.println("==========================================================================================");
        for (int i = 0; i < n; i++) {
            list[i] = num.next();
        }
        System.out.println("======================================================================================");
        System.out.println("Your List is:");
        for (int i = 0; i < n; i++) {
            System.out.println(item + (i + 1) + " : " + list[i]);
        }

    }
    public static int optionPane(Scanner num) {
        System.out.println("======================================================================================");
        System.out.println("Please Enter the number of the task you want to perform on the list.");
        System.out.println("1.Search the list\t\t 2.Sort the list");
        return num.nextInt();
    }
    public static int welcomeMessage(Scanner in){
        System.out.println("==========================================================================================");
        System.out.println("Welcome!");
        System.out.println("This application allows a user to choose a searching or sorting algorithm \n and request the list of items to search or sort\n");
        System.out.println("==========================================================================================");
        System.out.println("Which data values do you want to add to the list.\n1.integers\t\t2.Strings");
        return in.nextInt();
    }
    public static int sizeOfArray(Scanner input){
        System.out.println("==========================================================================================");
        System.out.println("Please enter the total number of items you want to add to the list.");
        return input.nextInt();
    }
    public static void intInputs(Scanner input,int[] itemList){
        int n = itemList.length;
        String item = "item";
        int[] list = new int[n];
        System.out.println("==========================================================================================");
        System.out.println("Please enter the items you want to add to the list.");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("======================================================================================");
        System.out.println("Your List is:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(item + (i + 1) + " : " + list[i]);
        }
        System.arraycopy(list, 0, itemList, 0, n);
    }
    public static void main(String[] args) {
        //declaration of the scanner which allow the program user to interact with the program by inputting data through the console.
        Scanner num = new Scanner(System.in);
        //the variable input will store the return value for the method optionPane().
        int input;
        //the method welcomeMessage() is called and its return value is store in the variable inputType.
        int inputType = welcomeMessage(num);

        // this try function will try the code and catch any input that is not specified in the code.
        try {
            //this condition check the return value of the method welcomeMessage() and runs the code specified for each option entered.
            //to choose data type to use as elements for the list
            //for integer elements for the list
            if(inputType==1){
                //the method sizeOfArray() is called which determines size of array to be used to store the user inputs.
                int n = sizeOfArray(num);

            // empty array is created of size n with holds the return value of the method sizeOfArray()
            int[] list= new int[n];
            //Receive inputs from the user to populate the array
            intInputs(num,list);
            //select a searching or sorting algorithm
            input = optionPane(num);

            MenuForInt(input,list);

            }
            //for String elements for the list
            else if(inputType==2) {
                //the method sizeOfArray() is called which determines size of array to be used to store the user inputs.
                int n = sizeOfArray(num);

                // empty array is created of size n with holds the return value of the method sizeOfArray()
                String[] stringList = new String[n];
                //Receive inputs from the user to populate the array
                stringInputs(num, stringList);

                //select a searching or sorting algorithm
                input = optionPane(num);

                MenuForString(input,stringList);

            }else {
                System.out.println("==========================================================================================");
                System.out.println("Sorry! you have entered a wrong number.");
            }
        } catch (Exception e) {
            System.out.println("==========================================================================================");
            System.out.println("Sorry! you have entered a wrong input.");
        }

    }
    public static void IntSearchingPane(int[] itemList) {
        System.out.println("==========================================================================================");
        System.out.println("Please Enter the number of the approach you want to use to search the list.");
        System.out.println("1.Linear search\t\t 2.Binary search\n99.Go Back");
        Scanner num = new Scanner(System.in);
        try {
            int b = num.nextInt();
            int a;
            if (b == 1) {
                System.out.println("==========================================================================================");
                System.out.println("Enter search key");
                int key = num.nextInt();
                int results = Searching.linearSearch(itemList, key);
                System.out.println("==========================================================================================");
                if (results == -1) {
                    System.out.println("Element not present");
                } else {
                    System.out.println("Element found at index " + results);
                    for (int i = 0; i < itemList.length; i++) {
                        System.out.print(itemList[i] + " ");
                    }
                    System.out.println();
                }
                System.out.println("==========================================================================================");
                System.out.println("Enter the numbers to perform the tasks below\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a = optionPane(num);
                    MenuForInt(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("\t\t\tGoodbye!");
                }
            } else if (b == 2) {
                Sorting.ascendingOrderSort(itemList);
                System.out.println("==========================================================================================");
                System.out.println("Enter search key");
                int key = num.nextInt();
                int store = Searching.searchIntItems(itemList,key);
                if (store == -1) {
                    System.out.println("Element not present");
                } else {
                    System.out.println("Element found at index " + store);
                    for (int i = 0; i < itemList.length; i++) {
                        System.out.print(itemList[i] + " ");
                    }
                    System.out.println();

                }
                System.out.println("==========================================================================================");
                System.out.println("Enter the numbers to perform the tasks below\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a = optionPane(num);
                    MenuForInt(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("Goodbye!");
                }
            }
            else if (b == 99) {
                a =optionPane(num);
                MenuForInt(a,itemList);
            }
        } catch (Exception e) {
            System.out.println("==========================================================================================");
            System.out.println("Sorry! you have entered a wrong input.");
        }
    }
    public static void sortingPane(int[] itemList) {
        System.out.println("==========================================================================================");
        System.out.println("Please Enter the number of the approach you want to use to sort the list.");
        System.out.println("1.Selection sort\t2.Bubble sort\t3.shell sort\n4.nearly sorted\t\t5.merge sort\t\t99.Go Back");
        Scanner num = new Scanner(System.in);
        Sorting sort = new Sorting();
        try {
            int c = num.nextInt();
            int a;
            if (c == 1) {
                Sorting.selectionSort(itemList);
                System.out.println("Enter the numbers to perform the tasks below\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a =optionPane(num);
                    MenuForInt(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("\t\t\tGoodbye!");
                }
            } else if (c == 2) {
                sort.bubbleSort(itemList);
                System.out.println("Enter the numbers to perform the tasks below\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a =optionPane(num);
                    MenuForInt(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("\t\t\tGoodbye!");
                }
            } else if (c == 3) {
                sort.shellSort(itemList);
                System.out.println("Enter the numbers to perform the tasks below\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a =optionPane(num);
                    MenuForInt(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("\t\t\tGoodbye!");

                }
            }else if(c == 4){
                sort.nearlySorted(itemList);
                System.out.println("Enter the numbers to perform the tasks below\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a =optionPane(num);
                    MenuForInt(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("\t\t\tGoodbye!");
                }
            } else if(c == 5){
                Sorting.mergeSort(itemList,0,itemList.length);
                System.out.println("Enter the numbers to perform the tasks below\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a =optionPane(num);
                    MenuForInt(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("\t\t\tGoodbye!");
                }

            }
            else if (c == 99) {
                a =optionPane(num);
                MenuForInt(a,itemList);
            }
        } catch (Exception e) {
            System.out.println("==========================================================================================");
            System.out.println("Sorry! you have entered a wrong input.");
        }
    }
    public static void stringSearchingPane(String[] itemList){
        System.out.println("==========================================================================================");
        System.out.println("Please Enter the number of the approach you want to use to search the list.");
        System.out.println("1.Linear search\t\t 2.Binary search\t\t 99.Go Back");
        Scanner num = new Scanner(System.in);
        try {
            int b = num.nextInt();
            int a;
            if (b == 1) {
                System.out.println("==========================================================================================");
                System.out.println("Enter search key");
                String key = num.next();
                int results = Searching.linearSearchForString(itemList, key);
                System.out.println("==========================================================================================");
                if (results == -1) {
                    System.out.println("Element not present");
                } else {
                    System.out.println("Element found at index " + results);
                    for (int i = 0; i < itemList.length; i++) {
                        System.out.print(itemList[i] + " ");
                    }
                    System.out.println();
                }
                System.out.println("==========================================================================================");
                System.out.println("Enter the number of any tasks below you want to perform\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a = optionPane(num);
                    MenuForString(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("\t\t\tGoodbye!");
                }
            } else if (b == 2) {
                System.out.println("==========================================================================================");
                System.out.println("Enter search key");
                String key = num.next();
                Sorting.ascendingOrderSortString(itemList);
                int result = Searching.binarySearchForString(itemList,  key);
                System.out.println("==========================================================================================");
                if (result == -1) {
                    System.out.println("Element not present");
                } else {
                    System.out.println("Element found at index " + result);
                    for (int i = 0; i < itemList.length; i++) {
                        System.out.print(itemList[i] + " ");
                    }
                    System.out.println();
                }
                System.out.println("==========================================================================================");
                System.out.println("Enter the number of any tasks below you want to perform\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a =optionPane(num);
                    MenuForString(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("\t\t\tGoodbye!");

                }
            } else if (b == 99) {
                a =optionPane(num);
                MenuForString(a,itemList);
            }
        } catch (Exception e) {
            System.out.println("==========================================================================================");
            System.out.println("Sorry! you have entered a wrong input.");
        }
    }
    public static void stringSortingPane(String[] itemList){
        System.out.println("==========================================================================================");
        System.out.println("Please Enter the number of the approach you want to use to sort the list.");
        System.out.println("1.Selection sort\t\t 2.Bubble sort\n3.Insertion sort \t\t99.Go Back");
        Scanner num = new Scanner(System.in);
        Sorting sort = new Sorting();
        try {
            int c = num.nextInt();
            int a;
            if (c == 1) {
                System.out.println("==========================================================================================");
                sort.selectionSortForString(itemList);
                System.out.println("Enter the number of any tasks below you want to perform\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a =optionPane(num);
                    MenuForString(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("\t\t\tGoodbye!");
                }
            } else if (c == 2) {
                System.out.println("==========================================================================================");
                sort.bubbleSortForString(itemList);
                System.out.println("Enter the number of any tasks below you want to perform\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a =optionPane(num);
                    MenuForString(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("\t\t\tGoodbye!");
                }
            }else if(c==3) {
                System.out.println("==========================================================================================");
                sort.insertionSortForString(itemList);
                System.out.println("Enter the number of any tasks below you want to perform\n1.Go Back\t\t2.Exit");
                int option = num.nextInt();
                if (option == 1) {
                    a =optionPane(num);
                    MenuForString(a,itemList);
                } else if (option == 2) {
                    System.out.println("==========================================================================================");
                    System.out.println("\t\t\tGoodbye!");
                }
            } else if (c == 99) {
                a =optionPane(num);
                MenuForString(a,itemList);
            }
        } catch (Exception e) {
            System.out.println("==========================================================================================");
            System.out.println("Sorry! you have entered a wrong input.");
        }
    }
    //this method allows the user to recursively select and implement either a searching or sorting algorithm for int values until the user opt to stop the program.
    public static void MenuForInt(int input, int[] list) {
        //select a searching algorithm to use
        if (input == 1) {
            IntSearchingPane(list);
        }
        //select a sorting algorithm to use
        else if (input == 2) {
            sortingPane(list);
        }
        else {
            System.out.println("==========================================================================================");
            System.out.println("Wrong input!");
        }
    }
    //this method allows the user to recursively select and implement either a searching or sorting algorithm for String values until the user opt to stop the program.
    public static void MenuForString(int input,String[] stringList) {
        //select a searching or sorting algorithm
        if (input == 1) {
            stringSearchingPane(stringList);
        }
        //select a sorting algorithm to use
        else if (input == 2) {
            stringSortingPane(stringList);
        }
        else {
            System.out.println("==========================================================================================");
            System.out.println("Wrong input!");
        }
    }
}
