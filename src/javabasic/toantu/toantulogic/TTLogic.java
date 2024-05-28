package javabasic.toantu.toantulogic;

public class TTLogic {
    public static void main(String[] args){
        String mess1 = "Lap xau";
        String mess2 ="Lap xau";

        int number1 = 40;
        int number2= 40;
        // Toan tu va &&
        /*
        - Toan tu va se dung khi tat ca  deu dung va nguoc lai se sai
        - Dung de ket hop cac dieu kien lai voi nha
         */
System.out.println((mess1 == mess2) && ( number2 == number1));
        // Toan tu hoc
        /*
        Toan tu hoac se dung khi chi can 1 trong cac dieu kien dung
         */

        System.out.println((mess1 != mess2) ||  ( number2 == number1));
    }
}
