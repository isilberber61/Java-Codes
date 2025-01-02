public class Method{
    public static void main(String[] args) {
       sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int arananDeger = 5;
        boolean var = false;

        for (int sayi : sayilar){
            if(sayi == arananDeger){
                var = true;
                break;
            }
        }

        if(var){
            mesajVer("Sayi mevcuttur: " +arananDeger);
        }else{
            mesajVer("Sayi mevcut degildir." +arananDeger);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}