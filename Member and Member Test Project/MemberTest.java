/*
 * MemberTest.java
 *
 * Project 2: class MemberTest is used to test the class
 *            Member. You must add another test to create
 *            a third member and print it out.
 *
 * Created on 16 October 2016
 */

/**
 * (Note this was created by the lecturer)
 * @author john.nelson
 */
public class MemberTest
{

    /**
     * The program execution begins with the main method
     * @param args the command line arguments
     */
    public static void main( String[] args )
    {
        System.out.println( "Java application to test the Member.java class\n");

        // Test 1  create default Member object
        System.out.println( "Test 1: create a new member object");

        Member member1 = new Member();

        printMember( member1 );

        // Test 2  create Member object and fully initialise
        System.out.println( "Test 2: create a new member object and set the fields");

        Member member2 = new Member();
        member2.setFullName("Fred Flintstone");
        member2.setIdNumber(16120000);
        member2.setEmailAddress("fred@hanna-barbera.dinocom");
        member2.setTelephoneNumber("+000 61 123321");
        member2.setDateOfJoin("01 Sep 2016");
        member2.setMembershipPaid( true );

        printMember( member2 );

        // Test 3 add some events to events attended
        System.out.println( "Test 3: add five events attended");

        member2.setEventsAttended( 4 );
        // Add one more event for member2
        member2.setEventsAttended( member2.getEventsAttended() + 1 );

        printMember( member2 );               // Redisplay member should be 5 events


        // Test 4  create Member object and fully initialise it, then display it
        System.out.println( "Test 4: Another member.......");

        /*######################################################################
         * Create and set the details for a third member here and display
         *######################################################################
         */
        Member member3 = new Member();
        member3.setFullName("Linus Sebastian");
        member3.setIdNumber(12364068);
        member3.setEmailAddress("linus.sebastian@aol.com");
        member3.setTelephoneNumber("+353 62 348930");
        member3.setDateOfJoin("01 Jan 2000");
        member3.setEventsAttended( 55 );
        member3.setMembershipPaid( true );

        // print the third member by calling the printMember method below
        printMember( member3 );
    } // end main

    /**
     * Print member details.
     * @param member  The member whose details you wish to print
     */
    public static void printMember( Member member )
    {
        // display details for this member
        System.out.println("The member's details are:");

        System.out.printf( "  Full Name                 : %s\n", member.getFullName() );
        System.out.printf( "  Id number                 : %s\n", member.getIdNumber() );
        System.out.printf( "  Email Address             : %s\n", member.getEmailAddress() );
        System.out.printf( "  Contact Telephone Number  : %s\n", member.getTelephoneNumber() );
        System.out.printf( "  Date of Join              : %s\n", member.getDateOfJoin() );

        System.out.printf( "  Number of Events Attended : %s\n", member.getEventsAttended() );
        System.out.printf( "  Membership Fee Paid       : %b\n", member.getMembershipPaid() );

        // display details about the completion of member details
        System.out.print("  >>> The member's details are ");
        if (member.isValidMember()) {
            System.out.println( "valid.");
        } else {
            System.out.println( "not valid.");
        }
        System.out.println();
    } // end printMember()

} // end class MemberTest
