/**
 * Member.java
 *
 * Member class creates variables for a member object and provides set and get methods to create a member.
 * Checks using if statements to ensure member details are valid and then a boolean method isValidMember
 * to check if the member is valid.
 *
 * @author (name redacted) 
 * @version (30 Oct 2016)
 */
public class Member //begin class Member
{
    //creates variables for member
    private long idNumber;
    private String fullName;
    private String emailAddress;
    private String telephoneNumber;
    private String dateOfJoin;
    private int eventsAttended;
    private Boolean membershipPaid;

    public Member( ) //create a null constructor
    {
        idNumber = 0;
        fullName = null;
        emailAddress = null;
        telephoneNumber = null;
        dateOfJoin = null;
        eventsAttended = 0;
        membershipPaid = true;
    }

    public Member( long id, String name, String email, String telephone,
    String dOJ, int events, Boolean membership ) //create Member constructor with variables
    {
        idNumber = id;
        fullName = name;
        emailAddress = email;
        telephoneNumber = telephone;
        dateOfJoin = dOJ;
        eventsAttended = events;
        membershipPaid = membership;
    }

    public void setIdNumber( long id ) //set ID method
    {
        if( id > 49999999 && id < 10000000) //if statement setting ID to zero if outside limits
        {
            id = 0;
        }
        idNumber = id;
    }

    public void setFullName( String name ) //set name method
    {
        fullName = name;
    }

    public void setEmailAddress( String email ) //set email method
    {
        emailAddress = email;
    }

    public void setTelephoneNumber( String telephone ) //set telephone method
    {
        telephoneNumber = telephone;
    }

    public void setDateOfJoin( String dOJ ) //set date of join method
    {
        dateOfJoin = dOJ;
    }

    public void setEventsAttended( int events ) //set EventsAttended method
    {
        if( events > 100 && events < 0) //set to zero if less than 0 or greater than 100
        {
            events = 0;
        }
        eventsAttended = events;
    }

    public void setMembershipPaid( Boolean membership ) //set MembershipPaid method
    {
        membershipPaid = membership;
    }

    public long getIdNumber( ) //get IdNumber method
    {
        return idNumber;
    }

    public String getFullName( ) //get FullName method
    {
        return fullName;
    }

    public String getEmailAddress( ) //get EmailAddress method
    {
        return emailAddress;
    }

    public String getTelephoneNumber( ) //get TelephoneNumber method
    {
        return telephoneNumber;
    }

    public String getDateOfJoin( ) //get DateOfJoin method
    {
        return dateOfJoin;
    }

    public int getEventsAttended( ) //get EventsAttended method
    {
        return eventsAttended;
    }

    public Boolean getMembershipPaid( ) //get membershipPaid method
    {
        return membershipPaid;
    }

    public boolean isValidMember()
    {
        if( idNumber != 0 && fullName != null && membershipPaid == true )
        //member is valid if ID is not zero, there is a full name and membership has been paid
        {
            return true;
        }
        else
        {
            return false;
        }
    }
} //end class
