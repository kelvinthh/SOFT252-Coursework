/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.datamodel;

/**
 *
 * @author WEEGEE
 */
public enum RoomType {
    LECTURE_HALL,
    STUDENT_LAB,
    RESEARCH_LAB,
    STAFF_ROOM,
    SECURE_ROOM;
    
    public String getTypeString(){
        String typeString;
        switch(this){
            case LECTURE_HALL:
                typeString = "Lecture Hall";
                break;
            case STUDENT_LAB:
                typeString = "Student Lab";
                break;
            case RESEARCH_LAB:
                typeString = "Researh Lab";
                break;
            case STAFF_ROOM:
                typeString = "Staff Room";
                break;
            case SECURE_ROOM:
                typeString = "Secure Room";
                break;
            default:
                typeString = "Unknown Room";
        }
        return typeString;
    }
}

