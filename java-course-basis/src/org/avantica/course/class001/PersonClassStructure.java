package org.avantica.course.class001;


/**
 * CLASS STRUCTURE
 * =================================
 * - Variables: Also known al fields of a class.
 * - Methods:
 */
public class PersonClassStructure {

    /**
     * For declaring a variable is required to take into account the following structure:
     * <access modifier> <type> <name of the attribute>;
     * <access modifier> <type> <name of the attribute> = <initial value>;
     */

    // Here the attributes or properties of a class.
    private String name;
    private String lastName;
    private int age;


    /**
     * For implementing a method required to take into account the following structure:
     * <access modifier> <return type> <name of the method> () { ...... };
     */

    // Usually we need to define getters and setters as a convention.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // Another methods of a class. (If they are required for some logic of the application)
    // This method is going to return as the following example: Juan Perez Gonzales
    public String getFullName() {
        return this.name + " " + this.lastName;
    }

    // This method is going to return as the following example: Perez Gonzales, Juan
    public String getLastFirstName() {
        return this.lastName + ", " + this.name;
    }
}
