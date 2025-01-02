//import java.util.Scanner;

public class AsalSayi{
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number: ");
        // int num =scanner.nextInt();
        int num = 12;

        if(isAsal(num)){
            System.out.println(num  + " bir asal sayidir.");
        }else{
            System.out.println(num  + " bir asal sayi degildir.");
        }
        //scanner.close();
    }

    public static boolean isAsal(int num){
        if (num <= 1) {
            return false;
        }
        for(int i =2; i<=Math.sqrt(num);i++){
            if(num %i == 0){
                return false;
            }
        }
    return true;
    }
}