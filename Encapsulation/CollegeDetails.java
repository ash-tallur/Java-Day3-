/*Print college names(any 5 colleges)
and departments - IT , CS , MECH , ECE , EEE , AERO , AUTO , EI -
Should use private variables for the department name and college . (Apply encapsulation) */

package Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class CollegeDetails {
    //private variables
    private String nameOfCollege;
    private List<String> collegeDepartments;

    public String getNameOfCollege(){
        return nameOfCollege;
    }

    public void setNameOfCollege(String nameOfCollege) {
        this.nameOfCollege = nameOfCollege;
    }

    public List<String> getCollegeDepartments() {
        return collegeDepartments;
    }

    public void setCollegeDepartments(List<String> collegeDepartments) {
        this.collegeDepartments = collegeDepartments;
    }

    public static void main(String[] args) {
        //Creating collegeDetails object and setting its name as well departments
        CollegeDetails[] colleges = new CollegeDetails[5];

        //setting the 5 college name by accessing the index
        colleges[0] = new CollegeDetails();
        colleges[0].setNameOfCollege("BIT");
        //setting the college's departments by sending the instance of arraylist with values
        colleges[0].setCollegeDepartments(new ArrayList<String>(List.of("CS","EC","BioTech")));

        colleges[1] = new CollegeDetails();
        colleges[1].setNameOfCollege("IIM");
        colleges[1].setCollegeDepartments(new ArrayList<String>(List.of("MBA","MCA","MECH")));

        colleges[2] = new CollegeDetails();
        colleges[2].setNameOfCollege("IIT");
        colleges[2].setCollegeDepartments(new ArrayList<String>(List.of("CS","AUTO")));

        colleges[3] = new CollegeDetails();
        colleges[3].setNameOfCollege("PESIT");
        colleges[3].setCollegeDepartments(new ArrayList<String>(List.of("CS","EC","AUTO","EI")));

        colleges[4] = new CollegeDetails();
        colleges[4].setNameOfCollege("RV");
        colleges[4].setCollegeDepartments(new ArrayList<String>(List.of("CS","EC","EEE","MECH","EI","AUTO")));

        //Displaying the 5 collegeDetails
        for(int i=0;i<5;i++){
            System.out.println("College Name: " + colleges[i].getNameOfCollege());
            System.out.println("Departments:" );
            //As departments are another list, we are using for loop to access the list and get the details
            for(int j=0;j<colleges[i].collegeDepartments.size();j++){
                System.out.println(colleges[i].getCollegeDepartments().get(j));
            }
        }
    }
}


