package javabasic.bien;

public class BienCucBo {



        public void sayHello(){
            int n= 10;    // đây là biến local
            System.out.println("Giá trị của n là: " + n);

        }

    public static void main(String[] args){

        BienCucBo bienLocal = new BienCucBo();
        bienLocal.sayHello();
    }

}
