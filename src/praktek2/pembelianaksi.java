
package praktek2;
public class pembelianaksi {
    public static void main(String[] args) {
        pembelianairbotol botol1 = new pembelianairbotol();
        botol1.hargasatuan = 3000;
        botol1.jumlahpembelian = 5;
        
        botol1.cetakInfo();
        
        System.out.println("Total Pembelian = "+botol1.totalpembelian());
        botol1.cetaktotal();
        
    }
    
}
