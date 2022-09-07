import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    String company;
    String phoneNumber;
    String address;

    Person(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name or NA...");
        String in = scanner.nextLine();
        if(in != "NA" && in != "na"){
            firstName = in;
        }
        System.out.println("Enter the last name or NA...");
        in = scanner.nextLine();
        if(in != "NA" && in != "na"){
            lastName = in;
        }
        System.out.println("Enter this persons company or NA...");
        in = scanner.nextLine();
        if(in != "NA" && in != "na"){
            company = in;
        }
        System.out.println("Enter this persons phone number or NA...");
        in = scanner.nextLine();
        if(in != "NA" && in != "na"){
            phoneNumber = in;
        }
        System.out.println("Enter this persons address or NA...");
        in = scanner.nextLine();
        if(in != "NA" && in != "na"){
            address = in;
        }
    }

    Person(String name){
        firstName = name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last name or NA...");
        String in = scanner.nextLine();
        if(in != "NA" && in != "na"){
            lastName = in;
        }
        System.out.println("Enter this persons company or NA...");
        in = scanner.nextLine();
        if(in != "NA" && in != "na"){
            company = in;
        }
        System.out.println("Enter this persons phone number or NA...");
        in = scanner.nextLine();
        if(in != "NA" && in != "na"){
            phoneNumber = in;
        }
        System.out.println("Enter this persons address or NA...");
        in = scanner.nextLine();
        if(in != "NA" && in != "na"){
            address = in;
        }

    }
}
