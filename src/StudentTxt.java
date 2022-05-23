/**
* Code to create an object of type Student, with a string namd and id, 
* implementing comparable interface
*
* @Author Dennis Hammerschlag
* @version 1.0
* @since 10 April
*/

public class StudentTxt implements Comparable<StudentTxt>{
    String Name;
    String id;
    public static int opCountInsert;
    
    StudentTxt (String ID, String name){
        this.Name = name;
        this.id = ID;
    }    
    StudentTxt(String ID){
        this.id=ID;
    }
    
    /**
    * Gets the name, accessor method
    * 
    * @param none
    * @return the Name of student object
    */
    public String getName()
    {
    return this.Name; 
    }
    /**
    * Gets the Id, accessor method
    * 
    * @param none
    * @return the ID of a student object
    */
    public String getID()
    {
    return this.id;
    }
    /**
    * Prints out name of student object, ID not needed for the purposes of the assignment
    * 
    * @param none
    * @return the name of a student object
    */
    public String toString()
    {
        return this.id+" "+this.Name;
    }
    /**
    *Gets the name of the current student object
    *
    * @param an integer, purely to overload the method
    * @return the Name instance variable of the student object, of type string
    */
    public String toString(int a)
    {
        return this.Name;
    }
    /**
    * Compares two student objects
    *
    * @param another student type object
    * @return 1 if they are the same student or -1 if not
    */
    public int compareTo (StudentTxt other)
    {
        return (this.id).compareTo(other.id);       
    }
}