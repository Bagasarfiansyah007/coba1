/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod8_1302194007_jurnal_se.pkg43.pkg01_nkr;

import java.time.LocalDateTime;

public class email_1302194007 {
    private int id;
    private String sender;
    private String subject;
    private String content ;
    private LocalDateTime datetime;
    private boolean starred;

    public int getId(){
        return id;
    }
    
    public void setId(int ID){
        id = ID;
    }
    
    public String getSender(){
        return sender;
    }
    
    public void setSender(String Sender){
        sender = Sender;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public void setSubject(String Subject){
        subject = Subject;
    }
    
    public String getContent(){
        return content;
    }
    
    public void setContent(String Content){
        content = Content;
    }
    
    public LocalDateTime getDateTime(){
        return datetime;
    }
    
    public void setDateTime(LocalDateTime DateTime){
        datetime = DateTime;
    }
    
    public boolean isStarred(){
        return starred;
    }
    
    public void setIsStarred(boolean Starred){
        starred = Starred;
    }
    
    public void outputQueryInsert(){
        System.out.println("( " + id + "," + sender + "," + subject + "," + content + "," + datetime + "," +starred +")"); 
    }
    
    public email_1302194007(int ID, String Sender, String Subject, String Content, LocalDateTime DateTime, boolean Starred){
        id = ID;
        sender = Sender;
        subject = Subject;
        content = Content;
        datetime = DateTime;
        starred = Starred;
    }
    
    public static class Emailtable{
        public static final String TABLE_NAME = "emails";
        public static final String ID = "email_id INT PRIMARY KEY,";
        public static final String SENDER = "from VARCHAR(100),";
        public static final String SUBJECT = "subject VARCHAR(100),";
        public static final String CONTENT = "content TEXT,";
        public static final String DATETIME = "date_time DATETIME,";
        public static final String STAR = "starred INT(1) DEFAULT 0";
        
        public static void outputQueryCreate(){
            System.out.println("Query pembuatan tabel " + TABLE_NAME + " :");
            System.out.println("CREATE TABLE " + TABLE_NAME + " (" );
            System.out.println("    " + ID);
            System.out.println("    " + SENDER);
            System.out.println("    " + SUBJECT);
            System.out.println("    " + CONTENT);
            System.out.println("    " + DATETIME);
            System.out.println("    " + STAR);
            System.out.println(");");
        }
    }
}
