/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.datamodel;

import university.datamodel.Mode;
import university.datamodel.RoomType;


/**
 *
 * @author WEEGEE
 */
public class Room {
    
    private int level;
    private int roomNo;
    private RoomType roomType;
    private Mode mode;
    //Makes room number like '09' possible to be displayed
    private String stringNo;
    
    Logger logger = new Logger();

    public Room(String bldgCode, int level, int roomNo, RoomType roomtype) {
        this.level = level;
        this.roomNo = roomNo;
        this.roomType = roomtype;
        this.mode = Mode.Normal;
        
        //Check if the room number is greter or equals to 10
        boolean doubleDigit;
        
        if(roomNo >= 10)
        {
            doubleDigit = true;
        }
        else
        {
            doubleDigit = false;
        }
        
        if(doubleDigit){
            this.stringNo = bldgCode + level + roomNo;
        }
        else
        {
            this.stringNo = bldgCode + level + "0" + roomNo;
        }
        
        System.out.println("Room Established: " + stringNo + "("+ roomtype.getTypeString() + ")"+" Mode: "+mode);
        logger.doLog("Room Established: " + stringNo + "("+ roomtype.getTypeString() + ")"+" Mode: "+mode);
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public String getStringNo() {
        return stringNo;
    }

    public void setStringNo(String stringNo) {
        this.stringNo = stringNo;
    }
        
}
