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
public class Campus {
    private String campusName;
    private ArrayList<Building> bldgList;
    
    Logger logger = new Logger();
    

    public Campus(String campusName) {
       bldgList = new ArrayList<>();
       this.campusName = campusName;
       System.out.println("Campus " + campusName + " has been established.");
       logger.doLog("Campus " + campusName + " has been established.");
    }

    public String getCampusName() {
        return campusName;
    }

    public ArrayList<Building> getBldgList() {
        return bldgList;
    }
    
    public void EstablishBuilding(String bldgName, String bldgCode){
        boolean bldgExists = false;
        for(int i = 0; i < bldgList.size();i++)
        {
            if(bldgList.get(i).getBldgName().equals(bldgName)){
                bldgExists = true;
                break;
            }
        }  
        if(!bldgExists)
        {
            bldgList.add(new Building(bldgName, bldgCode));
            System.out.println("Building " + bldgName + "(" + bldgCode + ") established.");
            logger.doLog("Building " + bldgName + "(" + bldgCode + ") established.");
        }
    }
    
    public Building FindBuilding(String bldgCode){
        Building tempBldg = null;
        for(int i =0;i < bldgList.size();i++){
            if(bldgList.get(i).getBldgCode().equals(bldgCode))
            {
                tempBldg = bldgList.get(i);
            }
        }
        return tempBldg;
    }
}
