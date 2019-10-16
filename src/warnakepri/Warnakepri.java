/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warnakepri;

import java.util.Scanner;
import static warnakepri.warna.ANSI_BLUE;
import static warnakepri.warna.ANSI_BLUE_BACKGROUND;
import static warnakepri.warna.ANSI_CYAN;
import static warnakepri.warna.ANSI_GREEN;
import static warnakepri.warna.ANSI_GREEN_BACKGROUND;
import static warnakepri.warna.ANSI_PURPLE;
import static warnakepri.warna.ANSI_PURPLE_BACKGROUND;
import static warnakepri.warna.ANSI_RED;
import static warnakepri.warna.ANSI_RED_BACKGROUND;
import static warnakepri.warna.ANSI_RESET;
import static warnakepri.warna.ANSI_WHITE;
import static warnakepri.warna.ANSI_YELLOW;
import static warnakepri.warna.ANSI_YELLOW_BACKGROUND;

/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deksripsi Program : Program ini berisi program untuk menampilkan kepribadian
 * anda melalui warna yang anda pilih yang sudah berbasis objek oriented
 */
public class Warnakepri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        warna warna1 = new warna();
        nama nama1 = new nama();
        Scanner scn = new Scanner(System.in);
        
//        teksnya
        System.out.print(ANSI_RED+"YUK "+ANSI_RESET);
        System.out.print(ANSI_GREEN+"CEK "+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"KEPRIBADIANMU "+ANSI_RESET);
        System.out.print(ANSI_CYAN+"DARI "+ANSI_RESET);
        System.out.print(ANSI_PURPLE+"WARNA "+ANSI_RESET);
        System.out.print(ANSI_BLUE+"FAVORITMU "+ANSI_RESET+"\n");
        
//        teks + backgroundnya
        System.out.print("\n"+ANSI_RED_BACKGROUND+ANSI_WHITE+"\t MERAH \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_GREEN_BACKGROUND+ANSI_WHITE+"\t HIJAU \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_YELLOW_BACKGROUND+ANSI_WHITE+"\t KUNING \t\n"+ANSI_RESET);
        System.out.print(ANSI_BLUE_BACKGROUND+ANSI_WHITE+"\t BIRU \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_PURPLE_BACKGROUND+ANSI_WHITE+"\t UNGU \t\t\n\n"+ANSI_RESET);
        
//        input
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna1.warnamu = scn.next();
        System.out.print("NAMA KAMU : ");
        nama1.namaMu = scn.next();
        
        
      nama1.tampilNama(nama1.namaMu);
      warna1.hasilTest(warna1.warnamu);
        
    }
    
}
