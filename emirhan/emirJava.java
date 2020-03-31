/*
 *
 */

import java.util.Scanner;

public class emirJava{
	public static void main(String[] args){
/*
		System.out.println("Soru 1 FOR-a:");
		soru1fora();
		System.out.print("\n");

		System.out.println("Soru 1 FOR-b:");
		soru1forb();
		System.out.print("\n");

		System.out.println("Soru 1 WHILE-a:");
		soru1whilea();
		System.out.print("\n");

		System.out.println("Soru 1 WHILE-b:");
		soru1whileb();
		System.out.print("\n");

		System.out.println("Soru 2:");
		soru2();
		System.out.print("\n");


		System.out.println("Soru 3:");
		soru3();
		System.out.print("\n");

*/








	}

	//Soru 1) for - a
	public static void soru1fora(){
			String ornekString = "Bu bir string";
			for(int i=0; i<ornekString.length(); i++){
				System.out.print(ornekString.charAt(i));    //stringlerde <stringADI>.charAt() fonksiyonu var
			}	                                            //dizi elemani gibi kacinci elemani istiyorsan
			System.out.print("\n");							//o sayiyi giriyorsun (1. eleman = 0, 2. eleman = 1, vs..)
	}

	//Soru 1) for - b
	public static void soru1forb(){
		double[][] dmatris = {
				{1.0, 2.0, 6.8, 1.4, 7.2},   // matrisi 3x5 aldim
		        {1.7, 6.2, 3.7, 9.0, 2.8},   // sayilar onemli degil
				{6.3, 0.3, 8.7, 8.8, 3.3},   // kafana gore takil
 		};

		for(int f=0; f<3; f++){        // f-first dongu satir sayisi
			for(int s=0; s<5; s++){    // s-second dongu sutun sayisi
				System.out.print(dmatris[f][s] + " ");
			}
			System.out.print("\n"); //satiri yazdirdiktan sonra alta gecerse matris gorunumu olur
		}
	}


	//Soru 1) while - a
	public static void soru1whilea(){
		String ornekString = "Bu bir string";
		int a = 0;  // 0. elemandan baslayacak
		while(a!=5){
			System.out.print(ornekString.charAt(a));
			a++;  // UNUTURSAN sıçarsın :) sonsuz donguye girer.
		}
		System.out.print("\n");
	}



	//Soru 1) while - b
	public static void soru1whileb(){
		double[] ddizi = {3.3, 4.3, 6.4, 2.4, 9.6, 7.8, 5.8, 1.9};
		int w = 0;
		double toplam = 0;  // toplam tutacak degisken
		while(w!=4){
			toplam += ddizi[w];  // "x += 2" demek "x = x + 2"
			w++;  // UNUTURSAN sıçarsın :) sonsuz donguye girer.
		}
		System.out.println(toplam);
	}


	//Soru 2)  tek satirdaki elemanlara 1 degerini, cift satirdaki elemanlara -1 degirini ver anladim. oyle yaptim
	public static void soru2(){
		int[][] imatris = new int[7][6];
		for(int k=0; k<7; k++){
			for(int l=0; l<6; l++){
				if(k%2==0){imatris[k][l] = 1;}  //0. satir bizim icin 1. satir
				else{imatris[k][l] = -1;}
			}
		}
		for(int k=0; k<7; k++){
			for(int l=0; l<6; l++){
				System.out.printf("imatris[%d][%d] = %d\n", k, l, imatris[k][l]); //c'den tanidik geliyor mu?
			}
		}
	}



	//Soru 3) toplama cikarma carpma
	public static void soru3(){

		//toplama
		int pay1 = 1;
		int payda1 = 2;
		int pay2 = 4;
		int payda2 = 3;
		if(payda1 == 0 || payda2 == 0){System.out.println("Payda 0 olamaz");}
		else if(payda1 == payda2){System.out.printf("%d/%d + %d/%d = %d/%d\n", pay1, payda1, pay2, payda2, pay1+pay2, payda1);}
		else{
			int temp1 = payda1;
			int temp2 = payda2;
			int pay1yeni = pay1 * temp2;
			int payda1yeni = payda1 * temp2;
			int pay2yeni = pay2 * temp1;
			int payda2yeni = payda2 * temp1;
			System.out.printf("%d/%d + %d/%d = %d/%d\n", pay1, payda1, pay2, payda2, pay1yeni+pay2yeni, payda1yeni);
		}


		//cikarma
		int pay3 = 7;
		int payda3 = 4;
		int pay4 = 5;
		int payda4 = 6;
		if(payda3 == 0 || payda4 == 0){System.out.println("Payda 0 olamaz");}
		else if(payda3 == payda4){System.out.printf("%d/%d - %d/%d = %d/%d\n", pay3, payda3, pay4, payda4, pay3-pay4, payda3);}
		else{
			int temp3 = payda3;
			int temp4 = payda4;
			int pay3yeni = pay3 * temp4;
			int payda3yeni = payda3 * temp4;
			int pay4yeni = pay4 * temp3;
			int payda4yeni = payda4 * temp3;
			System.out.printf("%d/%d - %d/%d = %d/%d\n", pay3, payda3, pay4, payda4, pay3yeni-pay4yeni, payda3yeni);
		}


		//carpma
		Scanner input = new Scanner(System.in);
		int pay5 = 5;
		int pay6 = 4;
		System.out.print("x degerini gir: ");
		int x = input.nextInt();

		if(x == 0){System.out.println("x 0 olamaz");}
		else{System.out.printf("%d/%d * %d/%d = %d/%d\n", pay5, x, pay6, x, pay5*pay6, (int) Math.pow(x,2));}


		//bolme

	}




}
