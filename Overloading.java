package file_java.semester2.Pewarisan;

public class Overloading {
    double luas;
    double a= 0.5;
     void luasbangun (double panjang,double lebar){
         luas = panjang * lebar;
         System.out.println("Luas = "+luas);
     }

     void luasbangun (int panjang, int lebar, int a){
         luas = panjang * lebar * a;
        System.out.println("Luas = "+luas);
     }
    
}
