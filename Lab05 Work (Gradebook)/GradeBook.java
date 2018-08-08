/* Week 5 Lab: Based on GradeBook.java (Fig 3.10)
 * Modified by: (name redacted)
 * Date 09 10 2016
 * Summary of Changes
 *  1. Added a second string variable to represent the course's instructor
 *  2. Addded set and get methods for instuctorName
 *  3. Modified constructor public GradeBook to accept second parameter for instructorName and assigned instr to it
 *  4. Modified displayMessage to include instructor's name
 *  5. Added an integer instance variable for number of sudents called NumberStudents
 *  6. Provided set and get methods for this variable
 *  7. Modified displayMessage to include number of students
 */

public class GradeBook
{
   private String courseName; // course name for this GradeBook
   private String instructorName; // instructor name for this GradeBook
   private int NumberStudents; // number of students for this GradeBook

   // constructor initializes courseName with String argument
   public GradeBook( String name, String instr, int students ) // constructor name is class name
   {
      courseName = name; // initializes courseName
      instructorName = instr; //initialises instructorName
      NumberStudents = students; //initialises NumberStudents
   } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to set the instructor name
   public void setInstructorName( String instr )
   {
       instructorName = instr;
   } // end method setInstructorName

   // method to set numberstudents
   public void setNumberStudents ( int students )
   {
       NumberStudents = students;
   } // end method setNumberStudents

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName

   // method to retrieve the instructor name
   public String getInstructorName()
   {
       return instructorName;
   } // end method getInstructorName

   // method to retrive the number of students
   public int getNumberStudents()
   {
       return NumberStudents;
   } // end method getNumberStudents

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // this statement calls getCourseName to get the
      // name of the course this GradeBook represents
      System.out.printf( "\nWelcome to the grade book for\n%s!\n This course is presented by\n%s",
         getCourseName(), getInstructorName() );
      System.out.printf( "\nThere are %d students registered for this course",
         getNumberStudents() );
   } // end method displayMessage
} // end class GradeBook
