package JavaProject;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity=500;
    private int defaultPasswordLength =10;
    private String alternateEmail;
    private String companysuffix ="anycompany.com";

    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email created Successfully for !"+ firstName +" "+lastName);
        this.department=setDepartment();

        System.out.println(department);
        this.password =randomPassword(defaultPasswordLength);
//        System.out.println("Your Password is " +password);
        //combine elements to generate email
        email =firstName.toLowerCase()+""+lastName.toLowerCase()+"@"+department+"."+companysuffix;
//        System.out.println("Your email is "+email);
    }
    private String setDepartment(){
        System.out.print("New Employee:" +firstName+ " Department Codes \n1 For Sales \n2 for Development\n3 for Accounting \n Enter Department Codes: ");
        Scanner sc =new Scanner(System.in);
        int deptChoice = sc.nextInt();
        if(deptChoice ==1){
            return "sales";
        }else if(deptChoice==2){
            return "dev";
        }
        else if(deptChoice==3){
            return "acct";
        }else{
            return "";
        }
    }
    private String randomPassword(int length){
        String PasswordSet ="ABCDEFHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char []password =new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random()*PasswordSet.length());
            password[i] = PasswordSet.charAt(random);
        }
        return new String(password);

    }
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity =capacity;

    }
    public void setAlternateEmail(String email){
        this.alternateEmail=email;
    }
    public void changePassword(String Password){
        this.password =password;
    }
    public int getMailboxCapacity(){
        return  mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public  String getPassword (){
        return password;
    }
    public String showInfo(){
        return "DISPLAY NAME : "+firstName +" "+lastName +"\n"+
                "COMPANY NAME :"+email +"\n"+
                "MAILBOX CAPACITY : "+mailboxCapacity+ "mb";
    }

}
