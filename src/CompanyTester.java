import java.util.*;

public class CompanyTester
{
    public static void main(String[] args)
    {
        ArrayList<Company> companyList = new ArrayList<Company>();
        Scanner keyboard = new Scanner(System.in);

        while(true){
            System.out.println("Please enter a company name, enter \"exit\" to quit");
            String companyName = keyboard.nextLine();
            if(companyName.toLowerCase().equals("exit")){
                break;
            }
            else{
                System.out.println("Is this an online company, \"yes\" or \"no\": ");
                String isOnline = keyboard.nextLine();
                if(isOnline.toLowerCase().equals("yes")){
                    System.out.println("Please enter the website address: ");
                    String webAddress = keyboard.nextLine();
                    companyList.add(new OnlineCompany(companyName, webAddress));
                }
                else{
                    System.out.println("Please enter the street address: ");
                    String streetAddress = keyboard.nextLine();
                    System.out.println("Please enter the city: ");
                    String city = keyboard.nextLine();
                    System.out.println("Please enter the state: ");
                    String state = keyboard.nextLine();
                    companyList.add(new Company(companyName, streetAddress, city, state));
                }
            }
        }
        for(Company company: companyList){
            System.out.println("\n"+company);
        }
    }
}