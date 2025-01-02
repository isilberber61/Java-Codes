public class MukemmelSayilar{
    public static void main(String[] args) {
        //6 ----> 1,2,3
        //28 ----> 1,2,4,7,14

        int sum = 0;
        int num = 28;

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum+=i;
            }
        }

        if(sum == num ){
            System.out.println(num + " sayisi bir mukemmel sayidir.");
        }else{
            System.out.println(num + " mukemmel bir sayi degildir.");
        }
        
    }

}