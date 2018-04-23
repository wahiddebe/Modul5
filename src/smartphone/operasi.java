/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphone;

/**
 *
 * @author acer
 */
public class operasi {
    public int hp,byr,p,jml,hasil;
    
    public int kembalian(){
        int kembali;
        kembali=byr-(p*jml);
        hasil=kembali;
        return kembali;}
    public void tx(){
        System.out.print("\t\t\t\t\t\t\t\t|Terimakasih telah membeli Xiaomi");}
    public void k(String nama,int jumlah){
        System.out.println("\t\t\t\t\t\t-Maaf, uang anda tidak cukup untuk membeli Xiaomi  "+nama+" sejumlah "+jumlah+" buah-");}
}
