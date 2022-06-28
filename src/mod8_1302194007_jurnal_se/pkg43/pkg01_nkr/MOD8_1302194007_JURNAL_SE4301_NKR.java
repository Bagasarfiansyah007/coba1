package mod8_1302194007_jurnal_se.pkg43.pkg01_nkr;

import java.time.LocalDateTime;


public class MOD8_1302194007_JURNAL_SE4301_NKR {

    
    public static void main(String[] args) {
        LocalDateTime  time = LocalDateTime.now();
        email_1302194007[] pesan = new email_1302194007[2];
        int id =0;
        
        email_1302194007.Emailtable.outputQueryCreate();
        System.out.println("Query input data ke tabel emails :");
        System.out.println("INSERT INTO emails VALUES ");
        pesan[0] = new email_1302194007(1,"bagas","reminderpraktiku","Halo 1302194009",time,true);
        pesan[1] = new email_1302194007(2,"agus","rhaloakugay","watasiwa 1302194009",time,false);
        pesan[0].outputQueryInsert();
        pesan[1].outputQueryInsert();
    }
}
