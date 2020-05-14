/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.datamodel;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author WEEGEE
 */
public class Logger {
    
    public void doLog(String message){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss dd-MMM-yyyy");
        try{
            
            FileWriter log = new FileWriter("log.txt", true);
            log.write("[" + ft.format(date) + "]" + message + "\r\n");
            System.out.println("Logged");
            log.close();
            
        }catch(IOException e){
            
            System.out.print(e);
            
        }
    }
    
}
