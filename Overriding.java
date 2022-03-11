package file_java.semester2.Pewarisan;

public class Overriding {
    float panjang,lebar;

    public void luas(){
    float luas=panjang*lebar;
    System.out.println("Luas Persegi panjang= "+luas);
}

    public void keliling(){
    float keliling=2*(panjang+lebar);
    System.out.println("Keliling Persegi panjang = " + keliling);
}
    
}
