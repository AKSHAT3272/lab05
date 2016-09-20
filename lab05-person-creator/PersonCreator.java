
/**
 * PersonCreator takes data from the person and 
 * simply prints out the information of that person
 * @author (Akshat Patel) 
 * @version (2016.09.13)
 */
 //Class PersonCreator
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

    //Constructor to initialize user Name
    public PersonCreator(String FirstName,String LastName)
    {
       Name=FirstName+ " " + LastName;
    
    }
     /* Purpose: Its a Method to getAddress
     *Example:Address="132 Earle Hall"
     */
    public void getAddress(String getAddress)
    {
       Address=getAddress;
    
     }
    /*Purpose: Its a Method to Define User Age
    *Example Age=18
    */
     public void getAge(int SetAge)
     { 
         Age=SetAge;
     }
     /*Purpose: Method to input Gender
     *Example : sex="Male"
     */
     public void getSex(String SetSex)
     {
         Sex=SetSex;
     }
    /* Purpose : Method to Define Height in Inches
    *  Example : Height=5.9 inches
    */
     public void getHeight(double SetHeight)
     {
      Height=SetHeight;
     }
     /* Purpose : Get User Weight in Pounds
     * Example Weight=120 Pounds
     */
     public void getWeight(double SetWeight)
    {
      Weight=SetWeight;
    }
    /*Purpose: Method with Conditional Statements to Get User's SSN number in Exact Format.
    * Example: SSN=666-66-6666
    */
    public void getSSN(int SFirst,int SMiddle,int SLast)
    {    //if Sfirst is bad the Generate a error
        if(SFirst < 0 && SFirst > 999)
        {
            System.out.println("Invalid Number");
        }
        //if SMiddle is bad the Generate a error
         else if(SMiddle < 0 && SMiddle > 99)
        {
            System.out.println("Invalid Number");
        }
        //if SLast is bad the Generate a error
         else if(SLast < 0 && SLast > 9999)
        {
            System.out.println("Invalid Number");
        }
        //Input Correct SSN without errors.
        else
        {
          SSN=SFirst+"-"+SMiddle+"-"+SLast;
        }
     } 
     /*Purpose:Get User's PhoneNumber in correct format
     * Example PhoneNumber=999-999-9999
     */
      public void getPhone(int PFirst,int PMiddle,int PLast)
    {   //if PFirst is bad the Generate a error
        if(PFirst < 0 && PFirst > 999)
        {
            System.out.println("Invalid Number");
        }
        //if PMiddle is bad the Generate a error
         else if(PMiddle < 0 && PMiddle > 999)
        {
            System.out.println("Invalid Number");
        }
        //if SLast is bad the Generate a error
         else if(PLast < 0 && PLast > 9999)
        {
            System.out.println("Invalid Number");
        }
        //Input Correct Phone without errors.
        else
        {
          Phone=PFirst+"-"+PMiddle+"-"+PLast;
        }
     } 
     /*Purpose:Get user's DOB in DD/MM/YYYY format
     *Example DOB=07/10/1998
     */
      public void getDOB(int Date,int Month,int Year)
    {    //if Date is wrong the Generate a error
        if(Date < 0 && Date > 31)
        {
            System.out.println("Invalid Number");
        }
         //if Month is wrong the Generate a error
         else if(Month < 0 && Month > 12)
        {
            System.out.println("Invalid Number");
        }
         //if Year is error the Generate a error
         else if(Year < 0 && Year > 2016)
        {
            System.out.println("Invalid Number");
        }
        //Input Correct DOB without errors
        else
        {
          DOB=Date+"/"+Month+"/"+Year;
        }
     } 
     /*Purpose: Prints all the details input by the user
     *Example-Akshat
              Male
              18 years
              132 Earle Hall NY 11530
              5.9 Inches
              120 Pound
              333-33-3333
              888-888-8888
              07/10/1998
     public void PersonCreator()
     {
         //prints the details of the person
         System.out.println(Name);//prints name
         System.out.println(Sex);//prints sex
         System.out.println(Age + "Years");//prints age in year
         System.out.println(Address);//prints address
         System.out.println(Height + "Inches");//Prints Height in inches
         System.out.println(Weight + "Pound");//Weight in pounds
         System.out.println(SSN);//Prints SSN
         System.out.println(Phone);//Prints PhoneNumber
         System.out.println(DOB);//Prints DOB
      }
    }
