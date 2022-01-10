/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_dasar;

public class Tutorial_dasar {
    
    String hewan = "Domba";
    int kandang1 = 20, kandang2 = 100, hasil;
    
    public static void main(String[] args){
        // Membuat Objek dari Class tutorial_dasar
        Tutorial_dasar data = new Tutorial_dasar();
        System.out.println("Jenis Hewan: "+data.jenis());
        System.out.println("Jumlahnya: "+data.Jumlah()+ " Ekor");
    }
    
    String jenis(){
        //Mengembalikan Nilai Hewan
        return hewan;
    }
    
    int Jumlah(){
        hasil = kandang1 + kandang2;
        return hasil; //Mngembalikan Nilai dari Hasil
    }
}