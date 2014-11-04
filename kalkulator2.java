/**
* Write a description of class Tugas1 here.
*
* @author (Ricky Dito Ramadan)
* @version (4 November 2014)
*/
import java.util.Scanner;
public class kalkulator2{
public static void main (String [] args) {

int pilih, pilihan, nilai1, nilai2;
double hasil;

Scanner ipul=new Scanner (System.in);
System.out.println ("1. Penjumlahan");
System.out.println ("2. Pengurangan");
System.out.println ("3. Perkalian");
System.out.println ("4. Pembagian");
System.out.print("Masukan Pilihan Anda : ");
pilih=ipul.nextInt ();

System.out.print("Masukan Angka Pertama : ");
nilai1=ipul.nextInt ();
System.out.print("Masukan Angka Kedua : ");
nilai2=ipul.nextInt ();

switch(pilih) {
case 1:
hasil=nilai1+nilai2;
System.out.println ("Hasilnya Adalah = "+hasil);
break;
case 2:
System.out.println("1.Angka Pertama Dikurang Angka Kedua");
System.out.println("2.Angka Kedua Dikurang Angka Pertama");
System.out.print("Masukan Pilihan : ");
pilih=ipul.nextInt ();
if (pilih==1){
hasil=nilai1-nilai2;
System.out.println ("Hasilnya Adalah = "+hasil);}
else {
hasil=nilai2-nilai1;
System.out.println("Hasilnya Adalah = "+hasil);}

break;
case 3:
hasil=nilai1*nilai2;
System.out.println("Hasilnya Adalah = "+hasil);
break;
default:
System.out.println("1.Angka Pertama Dibagi Angka Kedua");
System.out.println("2.Angka Kedua Dibagi Angka Pertama");
System.out.print("Masukan Pilihan : ");
pilih=ipul.nextInt ();
if(pilih==1){
hasil=(double)nilai1/nilai2;
System.out.println("Hasilnya Adalah = "+hasil);}
else {
hasil=(double)nilai2/nilai1;
System.out.println("Hasilnya Adalah = "+hasil);}

}System.out.println ("…::Armin Mahroji::…");
}
}