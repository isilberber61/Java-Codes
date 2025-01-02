public class HarfSesleri{
    public static void main(String[] args){
       char vowel = 'I';

       switch(vowel){
        case 'A':
        case 'I':
        case 'O':
        case 'U':
            System.out.println("Kalin sesli harftir.");
            break;
        default:
            System.out.println("Ince sesli harftir.");
       }

    }
}