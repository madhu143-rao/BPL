public class bpl_card{
    int aadhaar_card=764534987;
    int ph_no=978652314;
    int otp=5464;

    
    void display(){
        System.out.println("Your deatils are---->\nAadhaar number: "+aadhaar_card+"\nphone number: "+ph_no+"\notp: "+otp);
        System.out.println("Your OTP is verified");
        System.out.println("Your login is successfully completed.");
    }
    public static void main(String[] args){
        bpl_card bp=new bpl_card();
        bp.display();
    }
}