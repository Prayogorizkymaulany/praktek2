package praktek2;
public class pembelianairbotol {
    int hargasatuan;
    int jumlahpembelian;

    public pembelianairbotol() {
        hargasatuan=5000;
        jumlahpembelian=8;
    }
    
    void cetakInfo(){
        System.out.println("=========Pembelian Air Botol========");
        System.out.println("Harga Satuan     : "+hargasatuan);
        System.out.println("jumlah Pembelian : "+jumlahpembelian);
    }
    
     int totalpembelian(){
         int total;
         total = hargasatuan*jumlahpembelian;
         return total;  
     }
     
     void cetaktotal(){
         System.out.println("Total Pembelian : "+totalpembelian());
     }
}
