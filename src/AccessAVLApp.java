//Program using AVL data structures
//dennis hammerschlag
//08 april

import java.util.*;
import java.io.File;
import java.io.IOException;

public class AccessAVLApp
{

static AVLTree<StudentTxt> S = new AVLTree<StudentTxt> ();
    public AccessAVLApp()
    {
    try{
        File file = new File("data/oklist.txt");
        Scanner scan = new Scanner (file);
        while (scan.hasNextLine()){ 
            String str = scan.nextLine();
            
            int index = str.indexOf(' ');
            String ID = str.substring(0,index);
            String Name = str.substring(index+1);
            
            StudentTxt ST = new StudentTxt(ID, Name);
            S.insert(ST);
            
            //This was for counting insertion operations
            
            //AVLTree avl = new AVLTree(); 
            //int opCounter = S.opCountInsert;
            //System.out.println(opCounter);
            //S.resetInsert(opCounter);
            }
            scan.close();
        }catch (Exception exception){
            System.out.println("File not found");
            }    
    }
    /**
    * Finds the ID of a student object if they are in BST, returns "Access denied" if they arent
    *
    * @param a string ID, thats used as a key to search for the student object in BST (using find method predefined by Proffessor)
    * @return the name of student if they are in the list, or "Access Denied" if they arent
    */
    
    public static void printStudent (String ID){
        if (S.find(new StudentTxt((ID)))!=null){
            System.out.println( (((S.find(new StudentTxt(ID))).data).toString(5)) );
            }
        else{  
          System.out.println("Denied Access");   
            }                  
    }
    /**
    * Prints out all students in txt file to screen
    *
    * @param none
    * @return the BST using the inOrder method predefined by proffessor
    */
    public static void printAllStudents(){
        //use inOrder()
        S.inOrder();          
    }
    
    /**
    * Main method that uses input from command line
    *
    * @param the string array called args from user when invoked via command line
    * @return the student name if the ID of that student is entered (use the printStudent method) or returns the entire list of students if the user doesnt input an ID or anything after invoking the class
    *    
    */
    public static void main ( String[] args)
    {
        AccessAVLApp AVL = new AccessAVLApp();    
        //AVLTree avl = new AVLTree();
            if (args.length != 0){
                String ID = args[0];
                //print out only studentname, if it exsts
                AVL.printStudent(ID);
                
                int opCounter = AVLTree.opCountFind ;
                System.out.println("Number of find comparison operations = "+opCounter);
                //System.out.println(opCounter);
                //avl.resetInsert(opCounter);
                }
            else{
                //print out all students 
                AVL.printAllStudents();
                int opCounter = AVLTree.opCountInsert;
                System.out.println("Number of insert comparison operations = "+opCounter);
                
                }
                
    }
}

        
        
        
        
    
    

