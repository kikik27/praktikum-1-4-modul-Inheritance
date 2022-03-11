package file_java.semester2.Pewarisan;

public class Anak extends Ayah{
    double nilaimax=99.9;
    String nama ;
    int age=17;
    
    public void setNama(String nama) {
    this.nama=nama;    
    }

    public void cetak(){
        System.out.println("Nama = "+nama);
        System.out.println("Sifat = "+super.sifat);
        System.out.println("tb = "+super.tb);
        System.out.println("Umur = "+age);
        super.hobi();
    }
}   
