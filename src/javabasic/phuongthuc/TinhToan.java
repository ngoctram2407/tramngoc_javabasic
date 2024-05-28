package javabasic.phuongthuc;

public class TinhToan {
    public static int cong2SoNguyen(){
        return 10 +2;
    }

    public static void cong3SoNguyen(){
       System.out.println(10 +2 +10);
    }

    static void welcome( String name){
        System.out.println("Xin chao: "+ name);
    }
    public static void main(String[] args){
        cong3SoNguyen();

        welcome("Tram");
    }
}
