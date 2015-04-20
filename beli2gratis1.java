import java.io.*;
public class Beli2{
  public static void main (String[]args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   //variabel
    int jumlahbarang ;
    int bonus;
    int total;
    int hargakaos;
    //output
    System.out.println("=====================");
    System.out.println("     Toko Tshirt");
    System.out.println("Promo beli 2 gratis 1"); 
    System.out.println("=====================");
     System.out.println();
    System.out.println("harga 1 kaos 25000");
    
    System.out.print("Jumlah Barang yang dibeli= ");
    jumlahbarang=Integer.parseInt(br.readLine());
    bonus=(jumlahbarang/2);
    total=(jumlahbarang*25000);
     
     System.out.println("Jumlah Barang Anda : "+jumlahbarang+", jadi bonus anda dapat "+bonus);
   
      
  System.out.println();
  System.out.println("Total Barang Anda "+(jumlahbarang+bonus));    
   System.out.println("Total Harga Kaos Rp. "+total);  
     System.out.print("Masukkan Pembayaran Anda= ");
     int bayar=Integer.parseInt(br.readLine());
     System.out.println("====================================");
     System.out.println("kembalian Anda= "+(bayar-total));
     System.out.println("Terima Kasih Selamat Datang Kembali");
     System.out.println("====================================");
  }
}
