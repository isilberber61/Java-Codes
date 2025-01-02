public class ArkadasSayi{
    public static void main(String[] args){
        //220-284 
        int sum = 0;
        int sum1 = 0;
        int num = 220;
        int num1 = 284;

        for(int i = 1; i < num ; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        for(int j = 1; j < num1 ; j++){
            if(num1 % j == 0){
                sum1 += j;
            }
        }
        if(sum1 == num){
            if(sum == num1){
                System.out.println(num + " ve " + num1 + " arkadas sayidir.");
            }
            else{
                System.out.println(num + " ve " + num1 + " arkadas sayi degildir.");
            }
        } 

        }
}
