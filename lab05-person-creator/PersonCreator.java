
/**
 * PersonCreator takes data from the person and 
 * simply prints out the information of that person
 * @author (Akshat Patel) 
 * @version (2016.09.13)
 */
    public class PersonCreator
   {
   private String Name,Sex;
   private String Address;
   private int Age;
   private double Height;
   private double Weight;
   private String SSN;
   private String Phone;
   private String DOB;

    //Constructor
    public PersonCreator(String FirstName,String LastName)
    {
    Name=FirstName+ " " + LastName;
    
    }

    public void getAddress(String getAddress)
    {
       getAddress=Address;
    
     }
    
     public void getAge(int SetAge)
     { 
         Age=SetAge;
     }
     
     public void getSex(String SetSex)
     {
         Sex=SetSex;
     }

     public void getHeight(double SetHeight)
     {
      Height=SetHeight;
     }

     public void getWeight(double SetWeight)
    {
      Weight=SetWeight;
    }
    
    public void getSSN(int SFirst,int SMiddle,int SLast)
    {
        if(SFirst < 0 && SFirst > 999)
        {
            System.out.println("Invalid Number");
        }
        
         if(SMiddle < 0 && SMiddle > 99)
        {
            System.out.println("Invalid Number");
        }
         if(SLast < 0 && SLast > 9999)
        {
            System.out.println("Invalid Number");
        }
        
        else
        {
          SSN=SFirst+"-"+SMiddle+"-"+SLast;
        }
     } 
     
      public void getPhone(int PFirst,int PMiddle,int PLast)
    {
        if(PFirst < 0 && PFirst > 999)
        {
            System.out.println("Invalid Number");
        }
        
         if(PMiddle < 0 && PMiddle > 999)
        {
            System.out.println("Invalid Number");
        }
         if(PLast < 0 && PLast > 9999)
        {
            System.out.println("Invalid Number");
        }
        
        else
        {
          Phone=PFirst+"-"+PMiddle+"-"+PLast;
        }
     } 
     
      public void getDOB(int Date,int Month,int Year)
    {
        if(Date < 0 && Date > 31)
        {
            System.out.println("Invalid Number");
        }
        
         if(Month < 0 && Month > 12)
        {
            System.out.println("Invalid Number");
        }
         if(Year < 0 && Year > 2016)
        {
            System.out.println("Invalid Number");
        }
        
        else
        {
          DOB=Date+"/"+Month+"/"+Year;
        }
     } 
     public void PersonCreator()
     {
         //prints the details of the person
         System.out.println(Name);
         System.out.println(Sex);
         System.out.println(Age + "Years");
         System.out.println(Address);
         System.out.println(Height + "Inches");
         System.out.println(Weight + "Pound");
         System.out.println(SSN);
         System.out.println(Phone);
         System.out.println(DOB);
      }
    }
