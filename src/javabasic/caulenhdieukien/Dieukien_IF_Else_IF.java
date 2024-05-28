package javabasic.caulenhdieukien;

public class Dieukien_IF_Else_IF {
    public static void main(String[] args) {

        double DTB= 7.6 ;

        if( DTB >= 8 ){
            System.out.println("Gioi");
        } else if(DTB >6.5 && DTB < 8){
            System.out.println("Kha");
        } else if (DTB >= 5 && DTB <6.5 ){
            System.out.println("Trung Binh");
        } else{
            System.out.println("Yeu");
        }
    }

}
