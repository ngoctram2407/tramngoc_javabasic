package javabasic.bien;

public class BienToanCuc {

    String name = "Tram";
    int age = 25 ;
    String address = "Quang Nam";

    public void Info1(){
        System.out.println("Name :"+ name);
        System.out.println("Age :"+ age);
        System.out.println("Address :"+ address);
    }

    public void Info2(){
        System.out.println("Name :"+ name);
        System.out.println("Age :"+ age);
        System.out.println("Address :"+ address);
    }

    public static void main(String[] args){
      BienToanCuc bientoancuc = new BienToanCuc();
     System.out.println("Address :"+ bientoancuc.address);
    }
}
