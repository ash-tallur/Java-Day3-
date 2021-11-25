/*Print college names(any 5 colleges)
and departments - IT , CS , MECH , ECE , EEE , AERO , AUTO , EI -
Should use private variables for the department name and college . (Apply encapsulation) */

package Encapsulation;

import java.util.*;

public class CollegeDetails {
    //private variables
    private String nameOfCollege;
    private List<String> collegeDepartments = new ArrayList<>();

    public String getNameOfCollege() {
        return nameOfCollege;
    }

    public void setNameOfCollege(String nameOfCollege) {
        this.nameOfCollege = nameOfCollege;
    }

    public List<String> getCollegeDepartments() {
        return collegeDepartments;
    }

    //adding all the items to the department's array list
    public void setCollegeDepartments(List<String> collegeDepartmentsList) {
        this.collegeDepartments.addAll(collegeDepartmentsList);
    }
}

class GetCollegeDetails{
    public static void main(String[] args) {
        Map<String,Object> mapDepartment = new HashMap<>();

        //setting the 5 college name and department
        CollegeDetails firstCollege = new CollegeDetails();
        firstCollege.setNameOfCollege("BIT");
        //setting the college's departments by sending the instance of arraylist with values
        firstCollege.setCollegeDepartments(Arrays.asList("CS","EC","BioTech"));
        //adding the name and departments list to the map so it becomes a key value pair
        mapDepartment.put(firstCollege.getNameOfCollege(),firstCollege.getCollegeDepartments());

        CollegeDetails secondCollege = new CollegeDetails();
        secondCollege.setNameOfCollege("IIM");
        secondCollege.setCollegeDepartments(Arrays.asList("MBA","MCA","MECH"));
        mapDepartment.put(secondCollege.getNameOfCollege(),secondCollege.getCollegeDepartments());

        CollegeDetails thirdCollege  = new CollegeDetails();
        thirdCollege.setNameOfCollege("IIT");
        thirdCollege.setCollegeDepartments(Arrays.asList("CS","AUTO"));
        mapDepartment.put(thirdCollege.getNameOfCollege(),thirdCollege.getCollegeDepartments());

        CollegeDetails fourthCollege = new CollegeDetails();
        fourthCollege.setNameOfCollege("PESIT");
        fourthCollege.setCollegeDepartments(Arrays.asList("CS","EC","AUTO","EI"));
        mapDepartment.put(fourthCollege.getNameOfCollege(),fourthCollege.getCollegeDepartments());

        CollegeDetails fifthCollege = new CollegeDetails();
        fifthCollege.setNameOfCollege("RV");
        fifthCollege.setCollegeDepartments(Arrays.asList("CS","EC","EEE","MECH","EI","AUTO"));
        mapDepartment.put(fifthCollege.getNameOfCollege(),fifthCollege.getCollegeDepartments());

        System.out.println("The College details ");
        //Displaying the 5 collegeDetails
        for(Map.Entry i:mapDepartment.entrySet()){
            System.out.println(i.getKey() + " college's departments are " + i.getValue());
        }

    }
}


