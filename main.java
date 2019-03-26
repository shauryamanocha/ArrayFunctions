import java.util.Arrays;
import java.util.Scanner;

class main{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        getUserArray();
    }
    public static void getUserArray(){
        int len = Integer.MAX_VALUE;//dummy values
        int max  = Integer.MAX_VALUE;
        System.out.println("Enter the array length");
        while(len == Integer.MAX_VALUE){
            try{
                len = scan.nextInt();
            }catch(Exception e){
                System.out.println("Please enter a valid entry");
            }
        }
        System.out.println("Enter the maximum array value");
        while(max == Integer.MAX_VALUE){
            try{
                max = scan.nextInt();
            }catch(Exception e){
                System.out.println("Please enter a valid entry");
            }
        }
        System.out.println("Your array is");
        System.out.println(Arrays.toString(randArr(len,max)));

        System.out.println("Would you like to try again? (Y/N)");
        String again = "";
        while(again == ""){
            try {
                String input = scan.next();
                if(input.toUpperCase().equals("Y")){
                    again = "Y";
                }if(input.toUpperCase().equals("N")){
                    again = "N";
                }
            } catch (Exception e) {
                System.out.println("please enter a valid entry");
            }
        }
        switch(again){
            case "Y":
            getUserArray();
            break;
            case "N":
            System.out.println("Ok buh bye");
            break;
        }
        
        
    }

    public static int randomDice(){
        //returns a number from 0-5.9, removes the decimal (0-5) and then offsets it (1-6)
        return (int)random(6)+1;
    }
    public static double random(int max){
        //returns a random number between 0 and max(exclusive)
        return Math.random()*max;
    }
    public static int[] randArr(int len){
        int[] arr = new int[len];
        for(int i = 0;i<len;i++){
            arr[i] = (int)random(100);
        }
        return arr;
    }

    public static int[] randArr(int len, int maxVal){
        int[] arr = new int[len];
        for(int i = 0;i<len;i++){
            arr[i] = (int)random(maxVal)+1;
        }
        return arr;
    }
}