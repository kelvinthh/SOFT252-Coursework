/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.datamodel;

import university.datamodel.Mode;
import university.datamodel.RoomType;
import java.util.ArrayList;

/**
 *
 * @author WEEGEE
 */
public class Building {
    private ArrayList<Room> roomList;
    private String bldgName;
    private String bldgCode;
    
    Logger logger = new Logger();
    
    public Building(String bldgName,String bldgCode){
        roomList = new ArrayList<>();
        this.bldgCode = bldgCode;
        this.bldgName = bldgName;
        System.out.println("Establishing Building: " + bldgName + "(" + bldgCode + ")");
        logger.doLog("Establishing Building: " + bldgName + "(" + bldgCode + ")");
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    public String getBldgName() {
        return bldgName;
    }

    public void setBldgName(String bldgName) {
        this.bldgName = bldgName;
    }

    public String getBldgCode() {
        return bldgCode;
    }

    public void setBldgCode(String bldgCode) {
        this.bldgCode = bldgCode;
    }
    
    
    
    public void EstablishRoom(int level,int roomNo, RoomType roomType){
        boolean roomExisted = false;
        for(int i=0;i<roomList.size();i++)
        {
            if(roomList.get(i).getRoomNo() == roomNo){
                roomExisted = true;
            }
        }      
        if(!roomExisted)
        {
                roomList.add(new Room(bldgCode, level, roomNo, roomType));
                System.out.println("Room established.");
        }
    }
    
    public void DemolishRoom(int roomNo){
        for(int i = 0;i<roomList.size();i++)
        {
            if(roomList.get(i).getRoomNo() == roomNo)
            {
                roomList.remove(roomList.get(i));
                System.out.println("Room demolished.");
                break;
            }
        }
    }
    
    public Room FindRoom(String RoomName){
        Room room=null;
        for(int i= 0;i < roomList.size() ; i++){
            if(roomList.get(i).getStringNo().equals(RoomName)){
                room = roomList.get(i);
                break;
            }
        }
        return room;
    }
    
    public void ChangeMode(){
        Mode mode = Mode.Normal;
        for(int i = 0;i<roomList.size();i++)
        {
            if(roomList.get(i).getMode() == Mode.Normal){
                roomList.get(i).setMode(Mode.Emergency);
                mode = Mode.Emergency;
            }
            else if(roomList.get(i).getMode() == Mode.Emergency){
                roomList.get(i).setMode(Mode.Normal);
                mode = Mode.Normal;
            }
            
        }
        System.out.println(mode + " mode activated on building " + bldgName + "(" + bldgCode + ").");
        logger.doLog(mode + " mode activated on building " + bldgName + "(" + bldgCode + ").");
    }
}
