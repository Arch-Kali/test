#include<stdio.h>
#include<stdlib.h>
//3 basamakli satilardan rakamlari farkli olanlari ekrana yazdir
//ödevdeki soru için sayaç kullan

int sayac=0;

void main()
{

	int anasayi, sayi, basamak_1, basamak_2, basamak_3;

	for(int i=100;i<1000;i++){
		anasayi=i;
		sayi=i;

		basamak_1=sayi%10;
		sayi/=10;
		basamak_2=sayi%10;
		sayi/=10;
		basamak_3=sayi;
		
		if(basamak_1==basamak_2 ||
		basamak_2==basamak_3 ||
		basamak_1==basamak_3){continue;}
		else{
			sayac++;
			printf("%d\n",anasayi);  // sayıları yazdır
		}
	}
	printf("\nsayaç: %d\n",sayac);
}
