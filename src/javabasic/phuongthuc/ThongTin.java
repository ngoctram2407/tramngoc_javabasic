package javabasic.phuongthuc;

public class ThongTin {
    public static String COMPANY_NAME = "KMS";
    public static String ADDRESS = "Quang Nam";
    public static String PHONE = "0395119145";
    public static String EMAIL = "tramnguyen@gmail.com";


    public static void getInfoCompany(){
        System.out.println("Company_Name: "+ COMPANY_NAME);
        System.out.println("Address: "+ ADDRESS);
        System.out.println("Phone: "+ PHONE);
        System.out.println("Email: "+ EMAIL);
    }

    public static String getCompanyName(){
        return COMPANY_NAME;
    }
    public static String getEMAIL(){
        return EMAIL;
    }
}
