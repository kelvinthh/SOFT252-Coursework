/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.datamodel;


import university.datamodel.Room;
import university.datamodel.UserType;

/**
 *
 * @author WEEGEE
 */
public class User {
    private String name;
    private UserType userType;
    private String cardNo;
    
    Logger logger = new Logger();
    
    public User(String name, UserType userType, String cardNo) {
        this.name = name;
        this.userType = userType;
        this.cardNo = cardNo;
        logger.doLog("User created: " + name + " (" + userType.getTypeString() + "), ID: " + cardNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    
    
    public void Access(Room room){
        
        if(userType.IsAccessible(room)){
            logger.doLog("Access Granted. User: " + name + " (" + userType.getTypeString() + ", ID: " + cardNo + "), " + "Room: " + room.getStringNo() + "(Mode: " + room.getMode() + ")");
        }
        else
        {
            logger.doLog("Access Denied. User: " + name + " (" + userType.getTypeString() + ", ID: " + cardNo + "), " + "Room: " + room.getStringNo() + "(Mode: " + room.getMode() + ")");
        }
    }
}
