/*
* ToDo 01:
 Complete the followings:

The Course class should have:
    - ID 
    - Name
    - Code

 - You need to have setters and getters for all data members

 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).

 */
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {

    // Member variables
    private int id;
    private String name;
    private String code;

    // Sets the value of id to the parameter
    public void setID(int id) {
        this.id = id;
    }

    // Returns the value of id
    public int getID() {
        return id;
    }

    // Sets the value of name to the parameter
    public void setName(String name) {
        this.name = name;
    }

    // Returns the value of name
    public String getName() {
        return name;
    }

    // Sets the value of code to the parameter
    public void setCode(String code) {
        this.code = code;
    }

    // Returns the value of code
    public String getCode() {
        return code;
    }

    // Default constructor
    public Course() {
        id = 0;
        name = "";
        code = "";
    }

    // Overloaded constructor to set each variable to the parameter
    public Course(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
}
