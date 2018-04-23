/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphone;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public final class isi {
    int hp,byr,kmb,p,jml,i,j;
    operasi x;
    
    public isi(){
    x = new operasi();
    menu();
    input();
    }
    public void input(){
    Scanner h = new Scanner(System.in);
    System.out.println("masukan nomor pilihan smartphone xiaomi : ");
    hp = h.nextInt();
    x.hp=this.hp;
    System.out.println("masukan jumlah smartphone xiaomi yang ingin anda beli : ");
    jml = h.nextInt();
    x.jml=this.jml;
    System.out.println("masukan nilai uang pembayaran : ");
    byr = h.nextInt();  
    x.byr=this.byr;
    }
    public void menu(){
    String [][] smart ={
            
            {"No","Seri Xiaomi","Harga(Rp)"},
            {"1.","Redmi 5A","1,250,000"}, 
            {"2.","Redmi Note 5A","1,400,000"}, 
            {"3.","Redmi 5\t","1,750,000"},   
            {"4.","Mi Note 3","2,245,000"},        
            {"5.","Redmi 5 Plus","2,385,000"}, 
            {"6.","Mi A1\t","2,599,000"},
            {"7.","Mi 6\t","5,399,000"},
            {"8.","Mi Mix 2","6,575,000"}
        };
    System.out.println("\n_________________________________________________________");    
    for ( i=0;i<9; i++){
            for ( j=0;j<3; j++){
                System.out.print(smart[i][j]+"\t|\t");  
            }
        System.out.println("\n---------------------------------------------------------");         //pindah baris
        }
}
    public void olah(){
        String [][] smart ={
            
            {"No","Seri Xiaomi","Harga(Rp)"},
            {"1.","Redmi 5A","1,250,000"}, 
            {"2.","Redmi Note 5A","1,400,000"}, 
            {"3.","Redmi 5\t","1,750,000"},   
            {"4.","Mi Note 3","2,245,000"},        
            {"5.","Redmi 5 Plus","2,385,000"}, 
            {"6.","Mi A1\t","2,599,000"},
            {"7.","Mi 6\t","5,399,000"},
            {"8.","Mi Mix 2","6,575,000"}
        };
    switch (hp) {
                case 1:
                    p =1250000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[1][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        
                    }
                    else{x.k(smart[1][1],jml);}
                    break;
                case 2:
                    p =1400000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[2][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[2][1],jml);}
                    break;
                case 3:
                    p =1750000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[3][1]+" Sejumlah "+jml+" buah|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[3][1],jml);}
                    break;
                case 4:
                    p =2245000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[4][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[4][1],jml);}
                    break;
                case 5:
                    p =2385000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[5][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[5][1],jml);}
                    break;
                case 6:
                    p =2599000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[6][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[6][1],jml);}
                    break;
                case 7:
                    p =5399000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[7][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[7][1],jml);}
                    break;
                case 8:
                    p =6575000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[8][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[8][1],jml);}
                    break;
                default:
                    System.out.println("masukan salah");
                    break;
            }
}
    
    
    }
