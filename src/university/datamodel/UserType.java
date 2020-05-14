/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.datamodel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author WEEGEE
 */
public enum UserType {
    GUEST, STAFF, STUDENT, CLEANER, MANAGER, SECURITY, EMER;
    
    Date date = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
    String now = ft.format(date);

    public String getTypeString(){
        String typeString;
        switch(this){
            case GUEST:
                typeString = "Visitor/Guest";
                break;
            case STAFF:
                typeString = "Staff";
                break;
            case STUDENT:
                typeString = "Student";
                break;
            case CLEANER:
                typeString = "Contract Cleaner";
                break;
            case MANAGER:
                typeString = "Manager";
                break;
            case SECURITY:
                typeString = "Security";
                break;
            case EMER:
                typeString = "Emergency Responder";
                break;
            default:
                typeString = "Invalid Personnel";
        }
        return typeString;
    }
    
    public boolean IsAccessible(Room room){
        boolean accessible = false;
        switch(this){
            
            case GUEST:
                if(room.getRoomType() == RoomType.LECTURE_HALL && room.getMode() == Mode.Normal)
                {
                    if(IsInTime("08:29:59", "22:00:01"))
                        accessible = true;
                }
                break;
                
            case STAFF:
                if(room.getMode() == Mode.Normal)
                {
                    if(room.getRoomType() == RoomType.LECTURE_HALL || room.getRoomType() == RoomType.STUDENT_LAB || room.getRoomType() == RoomType.RESEARCH_LAB || room.getRoomType() == RoomType.STAFF_ROOM)
                    {
                        if(!IsInTime("00:00:00", "05:29:59"))
                            accessible = true;
                    }
                }
                break;
                
            case STUDENT:
                if(room.getMode() == Mode.Normal)
                {
                    if(room.getRoomType() == RoomType.LECTURE_HALL || room.getRoomType() == RoomType.STUDENT_LAB)
                    {
                        if(IsInTime("08:29:59", "22:00:01"))
                            accessible = true;
                    }
                }
                break;
                
            case CLEANER:
                if(room.getMode() == Mode.Normal)
                {
                    if(room.getRoomType() == RoomType.LECTURE_HALL || room.getRoomType() == RoomType.STUDENT_LAB || room.getRoomType() == RoomType.RESEARCH_LAB || room.getRoomType() == RoomType.STAFF_ROOM)
                    {
                        if(IsInTime("05:29:59", "10:29:59") || IsInTime("17:29:59", "22:29:59"))
                            accessible = true;
                    }
                }
                break;
            
            case MANAGER:
                if(room.getMode() == Mode.Normal)
                {
                    accessible = true;
                }
                break;
                
            case SECURITY:
                accessible = true;
                break;
                
            case EMER:
                if(room.getMode() == Mode.Emergency)
                {
                    accessible = true;
                }
                break;
        }
        return accessible;
    }
    
    public boolean IsInTime(String startTime, String endTime)
    {
        boolean isInTime = false;
        
        try{
            Date time1 = ft.parse(startTime);
            Date time2 = ft.parse(endTime);
            Date currentTime = ft.parse(now);
        if(currentTime.after(time1) && currentTime.before(time2))
            isInTime = true;
        } catch(ParseException e){
            e.printStackTrace();
        }
        return isInTime;
    }
    
}
