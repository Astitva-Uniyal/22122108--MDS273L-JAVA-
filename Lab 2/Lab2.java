import java.util.*;

class Lab2 {
    public static void  main(String[] args){

        Scanner s= new Scanner(System.in);
        int i=0;
        int ch=1;
        int n=0;
        String temp;
        String[] names= new String[1024];
        
        do{
            System.out.println("Press 0 to exit");
            ch= Integer.parseInt(s.nextLine());
        System.out.println("What do you want to do? \n 1. Enter a Name. \n 2. Remove a Name. \n 3. Search for a Name \n 4. Show all Names \n:");
        n= Integer.parseInt(s.nextLine());

        switch(n){

            case 0:
            System.out.println("Exiting...");
            break;

            case 1:
            System.out.println("Enter name");
            temp= s.nextLine();
            for(int j=0; j<=i;j++){
                if(temp==names[j]){
                    System.out.println("Name already Exists");
                }
                else{
                    names[i]= temp;
                    i++;
                }

            }
            break;

            case 2:
            int k=0;
            System.out.println("Enter name to remove");
            temp= s.nextLine();
            do{
                if(temp == names[k]){
                    for(int j= k; j<i;j++){
                        names[j]=names[j+1];
                    }
                    i--;
                }
                k++;
            }while(k<=i);
            break;

            case 3:
            k=0;
            System.out.println("Enter Name to Search");
            temp=s.nextLine();
            do{
                if(temp==names[k]){
                    System.out.println("Name found at " +k +"th position");
                }
                else{
                    System.out.println("Name does not exist");
                }
                k++;
            }while(k<=i);

            break;

            case 4:
            k=0;
            do{
                System.out.print(names[k]+"  ");
                k++;

            }while(k<=i);
            break;

            default:
            System.out.println("Enter Valid Response!!!");


        }

        }while(ch!=0);




        s.close();
    }
}