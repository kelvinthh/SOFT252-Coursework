/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.datamodel;

import java.util.ArrayList;

/**
 *
 * @author WEEGEE
 */
public class DataModel {
    ArrayList<User> userArrayList = new ArrayList<>();
    ArrayList<Room> roomArrayList = new ArrayList<>();
    Campus c17 = new Campus("City 17");
    
    public void generateData(){
           
        c17.EstablishBuilding("Black Mesa", "BKM");
        c17.EstablishBuilding("Ravenholm", "RVH");
        
        c17.FindBuilding("BKM").EstablishRoom(1, 01, RoomType.LECTURE_HALL);
        c17.FindBuilding("BKM").EstablishRoom(1, 02, RoomType.STUDENT_LAB);
        c17.FindBuilding("BKM").EstablishRoom(1, 03, RoomType.RESEARCH_LAB);
        c17.FindBuilding("BKM").EstablishRoom(1, 04, RoomType.STAFF_ROOM);
        c17.FindBuilding("BKM").EstablishRoom(1, 05, RoomType.SECURE_ROOM);
        
        c17.FindBuilding("RVH").EstablishRoom(1, 01, RoomType.LECTURE_HALL);
        c17.FindBuilding("RVH").EstablishRoom(1, 02, RoomType.STUDENT_LAB);
        c17.FindBuilding("RVH").EstablishRoom(1, 03, RoomType.RESEARCH_LAB);
        c17.FindBuilding("RVH").EstablishRoom(1, 04, RoomType.STAFF_ROOM);
        c17.FindBuilding("RVH").EstablishRoom(1, 05, RoomType.SECURE_ROOM);
        
        for(int i = 0; i < c17.getBldgList().size();i++)
        {
            for(int j = 0; j < c17.getBldgList().get(i).getRoomList().size();j++)
            {
                roomArrayList.add(c17.getBldgList().get(i).getRoomList().get(j));
            }
        }
        
        User alyx = new User("Alyx Vance", UserType.GUEST, "1111111");
        userArrayList.add(alyx);
        
        User freeman = new User("Gorden Freeman", UserType.STUDENT, "2222222");
        userArrayList.add(freeman);
        
        User eli = new User("Eli Vance", UserType.STAFF, "3333333");
        userArrayList.add(eli);
        
        User alien = new User("Vortigaunt", UserType.CLEANER, "4444444");
        userArrayList.add(alien);
        
        User barney = new User("Barney Calhoun", UserType.SECURITY, "5555555");
        userArrayList.add(barney);
        
        User breen = new User("Wallace Breen", UserType.MANAGER, "6666666");
        userArrayList.add(breen);
        
        User gman = new User("G-MAN", UserType.EMER, "7777777");
        userArrayList.add(gman);
        
//        c17.FindBuilding("RVH").ChangeMode();
//        gman.Access(c17.FindBuilding("RVH").FindRoom("RVH105"));
    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    public Campus getC17() {
        return c17;
    }

    public ArrayList<Room> getRoomArrayList() {
        return roomArrayList;
    }
    
}
