import java.util.*;
class Menu{
 public static void main (String[]args){
  Scanner sc=new Scanner(System.in);
  
  String[]menu={"Soto Lamongan","Bihun","Tempe Penyet","Nasi Uduk","Mie Rebus"};
  int[]harga={10000,8000,12000,10000,7000};
 //UNTUK MENYIMPAN PESANAN
  String nota="";
  int subtotal=0;
  int Tot=0;
  System.out.println();
  System.out.println("\"Daftar Menu Disajikan\"");
  System.out.println();
  System.out.println("Makanan \t\t\tHarga");
  System.out.println();
  
  for(int i=0; i<menu.length;i++){
   System.out.println((i+1) + "." + menu[i]+"\t\t"+harga[i]);
  }
  String jawab="y";
  
  while(jawab.equalsIgnoreCase("y")){
    
    System.out.println();
    System.out.print("Masukkan pilihan : ");
    int pilih=sc.nextInt();
    System.out.println();
    System.out.println(menu[pilih-1]);
    System.out.println();
    
    System.out.print("Masukkan Jumlah Pesanan : ");
    int a=sc.nextInt();
    System.out.println("Harga : "+harga[pilih-1]);
    subtotal=harga[pilih-1]*a;
    System.out.println("Bayar : "+subtotal);
    System.out.println();
    
    nota+=menu[pilih-1]+"\t\t"+a+" Porsi\t\t"+harga[pilih-1]+"\t\t"+subtotal+"\n------------------------------\n";
    Tot+=subtotal;
    System.out.println("Pesan lagi?[Y/N]");
    jawab=sc.next(); 
    System.out.println();
  }
    System.out.println("=================================================================");
    System.out.println("\t\tNota");
    System.out.println("=================================================================");
    System.out.println("MENU \t\t\tJUMLAH \t\t HARGA \t\t SUBTOTAL");
    System.out.println("-----------------------------------------------------------------");
    System.out.println(nota);
    System.out.println("=================================================================");
    System.out.println("Total bayar : "+Tot);
    System.out.println("=================================================================");
    System.out.println("Selamat Datang Kembali");
  
 }
}
