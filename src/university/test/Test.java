/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.test;

import university.datamodel.RoomType;
import university.datamodel.UserType;
import university.datamodel.Mode;
import university.datamodel.Campus;
import university.datamodel.User;
import java.util.ArrayList;

/**
 *
 * @author WEEGEE
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<User> UserArrayList = new ArrayList<>();
        Campus cb = new Campus("Cyka Blyat");
        cb.EstablishBuilding("B Site", "BOMBB");
        cb.FindBuilding("BOMBB").EstablishRoom(1, 11, RoomType.LECTURE_HALL);
        cb.FindBuilding("BOMBB").EstablishRoom(1, 12, RoomType.STUDENT_LAB);
        cb.FindBuilding("BOMBB").EstablishRoom(1, 13, RoomType.RESEARCH_LAB);
        cb.FindBuilding("BOMBB").EstablishRoom(1, 14, RoomType.SECURE_ROOM);
        cb.FindBuilding("BOMBB").EstablishRoom(1, 15, RoomType.STAFF_ROOM);
        
        User xi = new User("Chairman Xi", UserType.GUEST, "1111111");
        UserArrayList.add(xi);
        
        User cyka = new User("Russian Kid", UserType.STUDENT, "2222222");
        User nahui = new User("Zooker Bled", UserType.STAFF, "3333333");
        User mahboi = new User("Floor Scrubber", UserType.CLEANER, "4444444");
        User blyat = new User("Kaifeng Fakeface", UserType.SECURITY, "5555555");
        User rushb = new User("Vladimir Putin", UserType.MANAGER, "6666666");
        User nypd = new User("Fat Ass Police", UserType.EMER, "7777777");

        
        xi.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB111"));
        cyka.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB113"));
        nahui.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB114"));
        mahboi.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB114"));
        blyat.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB112"));
        nypd.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB111"));
        rushb.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB112"));
        
        cb.FindBuilding("BOMBB").ChangeMode();
        xi.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB111"));
        cyka.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB113"));
        nahui.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB114"));
        mahboi.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB114"));
        blyat.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB112"));
        nypd.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB111"));
        rushb.Access(cb.FindBuilding("BOMBB").FindRoom("BOMBB112"));
        
    }
    
}
