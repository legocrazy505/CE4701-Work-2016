/* Week 5 Lab: Based on GradeBookTest.java (Fig 3.11)
 *  Modified by: (name redacted)
 *  Date 09 10 2016
 *  Summary of Changes
 *   1. Added argument for instructor's name to gradeBook1
 *   2. Used get method to display course name and instructor name of gradeBook1
 *   3. For the object created, added a displayMessage method
 *   4. Did above three changes to create objects for each module on course
 *   5. Modified test class to show number of students
 *   6. Changed gradeBook1 attributes using set methods
 */

public class GradeBookTest
{
   // main method begins program execution
   public static void main( String[] args )
   {
      // create GradeBook object
      GradeBook gradeBook1 = new GradeBook(
         "Bedrock Programming", "Fred Flinstone", 4 );
      GradeBook gradeBook2 = new GradeBook(
         "MS4021 Calculus 1", "Romina Gaburro", 50 );
      GradeBook gradeBook3 = new GradeBook(
         "MS4131 Linear Algebra 1", "Alan Hegarty", 50 );
      GradeBook gradeBook4 = new GradeBook(
         "PH4131 Mechanics/Heat/Electricity/Magnetism", "Ning Liu & Robert Lynch", 120 );
      GradeBook gradeBook5 = new GradeBook(
         "PH4051 Measurement and Properties of Matter", "Vincent Casey", 40 );

      // display initial value of courseName and InstrcutorName for each GradeBook
      System.out.printf( "gradeBook1 course name is: %s\n",
         gradeBook1.getCourseName() );
      System.out.printf( "gradeBook1 instructor name is: %s\n",
         gradeBook1.getInstructorName() );

      System.out.printf( "gradeBook2 course name is: %s\n",
         gradeBook2.getCourseName() );
      System.out.printf( "gradeBook2 instructor name is: %s\n",
         gradeBook2.getInstructorName() );

      System.out.printf( "gradeBook3 course-name is: %s\n",
         gradeBook3.getCourseName() );
      System.out.printf( "gradeBook3 instructor name is %s\n",
         gradeBook3.getInstructorName() );

      System.out.printf( "gradeBook4 course-name is: %s\n",
         gradeBook4.getCourseName() );
      System.out.printf( "gradeBook4 instructor name is %s\n",
         gradeBook4.getInstructorName() );

      System.out.printf( "gradeBook5 course-name is: %s\n",
         gradeBook5.getCourseName() );
      System.out.printf( "gradeBook5 instructor name is %s\n",
         gradeBook5.getInstructorName() );

     //call the Display Method for gradebooks
      gradeBook1.displayMessage();

      gradeBook2.displayMessage();

      gradeBook3.displayMessage();

      gradeBook4.displayMessage();

      gradeBook5.displayMessage();

   } // end main
} // end class GradeBookTest
