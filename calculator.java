package metot2;
import java.util.Scanner;


public class HesapMakinesi {

	public float add(float a,float b) {
		float add=a+b;
		return(float)add;
	}
	public float minus(float a,float b) {
		if(a>b) {
			float minus=a-b;
			return(float)minus;
		}
		else {
			float minus =b-a;
			return(float)minus;
		}
	}
	public float divide(float a,float b) {
		float divide;
		if(b==0) {
			System.out.println("Bu işlem gerçekleştirilemez");
			return 1;
		}
		else {
			divide = a/b;
			return (float)divide;
		}
		
	}
	public float impact(float a,float b) {
		float impact=a*b;
		return (float)impact;
	}
	public float pow(double a,double b) {
		double pow= Math.pow(a, b);
		return (float)pow;
	}
	
	public float square(double a,double b) {
		double square=Math.pow(a,1/b);
		return(float)square;
	}
	
	public static void main(String[] args) {
		System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
		
		System.out.println("1.Toplama ");
		System.out.println("2.Çıkarma ");
		System.out.println("3.Çarpma ");
		System.out.println("4.Bölme ");
		System.out.println("5.Üssünü Alma ");
		System.out.println("6.Kökünü Bulma");
		
		Scanner scanner =new Scanner(System.in);
		int s=scanner.nextInt();
		
		switch(s) {
		
		case 1:
			HesapMakinesi hesap=new HesapMakinesi();
			Scanner scanner1 =new Scanner(System.in);
			float result=hesap.add(scanner.nextFloat(),scanner.nextFloat());
			System.out.println(result);
			break;
			
		case 2:
			HesapMakinesi hesap1=new HesapMakinesi();
			Scanner scanner2 =new Scanner(System.in);
			float result1=hesap1.minus(scanner.nextFloat(),scanner.nextFloat());
			System.out.println(result1);
			break;
		
		case 3:
			HesapMakinesi hesap2=new HesapMakinesi();
			Scanner scanner3 =new Scanner(System.in);
			float result2=hesap2.impact(scanner.nextFloat(),scanner.nextFloat());
			System.out.println(result2);
			break;
			
		case 4:
			HesapMakinesi hesap3=new HesapMakinesi();
			Scanner scanner4 =new Scanner(System.in);
			float result3=hesap3.divide(scanner.nextFloat(),scanner.nextFloat());
			System.out.println(result3);
			break;
			
		case 5:
			HesapMakinesi hesap4=new HesapMakinesi();
			Scanner scanner5 =new Scanner(System.in);
			float result4 =hesap4.pow(scanner.nextInt(),scanner.nextInt());
			System.out.println(result4);
			break;
			
		case 6:
			HesapMakinesi hesap5=new HesapMakinesi();
			Scanner scanner6 =new Scanner(System.in);
			float result5=hesap5.square(scanner.nextInt(),scanner.nextInt());
			System.out.println(result5);
			break;
		default:
			System.out.println("Geçerli seçim yapmadınız.");
		}
		
		
		
		
		
	}
}
