import java.util.Scanner;
import java.util.*;

public class AddressBook{
   List<Person> addressBook = new ArrayList<Person>();


   public void printBook(){
       System.out.println("***********ADDRESS BOOK***********");
       for(int i =0; i < addressBook.size(); i++){
           if(addressBook.get(i).firstName != "NA" && addressBook.get(i).lastName!= "na" && addressBook.get(i).lastName != "NA" && addressBook.get(i).firstName!= "na" ){

           }
           System.out.println("Name: " + addressBook.get(i).firstName + " " + addressBook.get(i).lastName);
           System.out.println("Company: " + addressBook.get(i).company);
           System.out.println("Phone Number: " + addressBook.get(i).phoneNumber);
           System.out.println("Address: " + addressBook.get(i).address);
           System.out.println("_____________________________");
       }
   }

   public static void main(String[] args){
       Person x = new Person();
       AddressBook myBook = new AddressBook();
       myBook.addressBook.add(x);
       Person y = new Person();
       myBook.addressBook.add(y);
       myBook.printBook();
   }



}
