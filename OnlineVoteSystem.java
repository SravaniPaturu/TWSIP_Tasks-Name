import java.util.*;

class Authentication
{
    public static String user="sravani",phno="12345678", username,PhoneNumber,candidate_name1,candidate_name2,party_name1,party_name2;
    public static int age,candidate1_Votes=0,candidate2_Votes=0;
    static void login()
    {
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter User Name:");
    username=sc.nextLine();
    System.out.print("Enter Phone Number:");
    PhoneNumber=sc.nextLine();
    }
}
class Candidate extends Authentication
{   
    static void details()
    {
    ArrayList<String> l=new ArrayList<String>();
    System.out.println("Enter Candidates Names:");
    Scanner sc=new Scanner(System.in);
    candidate_name1=sc.nextLine();
    candidate_name2=sc.nextLine();
    System.out.print("Enter candidate Partys Names:");
    party_name1=sc.nextLine();
    party_name2=sc.nextLine();
   
     l.add(candidate_name1+":"+party_name1);
    l.add(candidate_name2+":"+party_name2);
    System.out.println("candidate list:"+l); 
   }
}

class Eligibility extends Authentication
{
    static void eleg()
    {   
        if(username.equals(user)&&PhoneNumber.equals(phno))
        {
            
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = sc.nextInt();
        if (age >= 18) {
            
            System.out.println("You are eligible to vote");
            System.out.println("Please select a candidate to vote for:");
        System.out.println("1. Candidate 1");
        System.out.println("2. Candidate 2");

        
        int choice = sc.nextInt();

        
        if (choice == 1) {
            candidate1_Votes++;
        } else if (choice == 2) {
            candidate2_Votes++;
        }
        System.out.println("Candidate 1: " + candidate1_Votes + " votes");
        System.out.println("Candidate 2: " + candidate2_Votes + " votes");
        }
        else {
           
            System.out.println("You are not eligible to vote.");
        }
    }
}
}
class OnlineVoteSystem
{
    public static void main(String args[])
    {   
        Authentication a=new Authentication();
        a.login();
        Candidate c=new Candidate();
        c.details();
        Eligibility e=new Eligibility();
        e.eleg();
        
    }
}   