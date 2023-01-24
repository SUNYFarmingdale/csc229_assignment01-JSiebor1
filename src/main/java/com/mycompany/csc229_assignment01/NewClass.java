
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {
        Course c1 = new Course(); // initializes an empty course
        Course c2 = new Course(229, "Moaath", "CSC"); // initializes a course with the parameters
        
        // sets each respective member variable 
        c1.setID(229);
        c1.setName("Moaath");
        c1.setCode("CSC");
    }
    
}
