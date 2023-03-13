import java.util.*;

public class Main {
        static Scanner in = new Scanner(System.in);
        LinkedList<ContactBook> newList;
        public Main() {
            newList = new LinkedList<>();
        }
        public void add(){
            System.out.print("Enter first and last name: ");
            String name = in.nextLine();
            System.out.print("Enter an email address: ");
            String email = in.nextLine();
            System.out.print("Enter phone number: ");
            String number = in.nextLine();
            ContactBook contact = new ContactBook(name, email, number);
            newList.add(contact);
        }
        public void delete(){
            System.out.print("Enter the contact you want to delete: ");
            String delete = in.nextLine();
            for(ContactBook s:newList){
                while(!delete.equals(s.name)){
                    System.out.print("Contact is not found. Please reenter the contact: ");
                    delete = in.nextLine();
                }
                if(delete.equals(s.name)){
                    newList.remove(s);
                    System.out.println("Successfully deleted");
                }
    }
}
        public void emailSearch(){
            System.out.print("Enter the email you want to search: ");
            String search = in.nextLine();

            for (ContactBook contact : newList) {
                if (contact.getEmail().equals(search)) {
                    System.out.println("Name: " + contact.getName());
                    System.out.println("Email: " + contact.getEmail());
                    System.out.println("Phone number: " + contact.getNumber());
                    return;
                }
            }
            System.out.println("The email you search is not found.");
        }
        public void printList(){
            System.out.println("Contact List:");
            for (ContactBook contact : newList) {
                System.out.println("Name: " + contact.getName());
                System.out.println("Email: " + contact.getEmail());
                System.out.println("Phone number: " + contact.getNumber());
                System.out.println();
            }
        }
        public void search(){
            System.out.print("Enter the name you want to search: ");
            String search = in.nextLine();
            System.out.println("Search results:");
            for (ContactBook contact : newList) {
                if (contact.getName().toLowerCase().contains(search.toLowerCase()) ||
                        contact.getEmail().toLowerCase().contains(search.toLowerCase())) {
                    System.out.println("Name: " + contact.getName());
                    System.out.println("Email: " + contact.getEmail());
                    System.out.println("Phone number: " + contact.getNumber());
                    System.out.println();
                }
            }
        }
        public void quit(){
            System.out.println("Exit");
            System.exit(0);
        }
        public static void main(String[] args) {
            Main main = new Main();
            while (true) {
                System.out.println("*************************");
                System.out.println("(A)dd");
                System.out.println("(D)elete");
                System.out.println("(E)mail Search");
                System.out.println("(P)rint List");
                System.out.println("(S)earch");
                System.out.println("(Q)uit");
                System.out.println("*************************");
                System.out.print("Please enter a command: ");
                String command = in.nextLine().toUpperCase();
                switch (command) {
                    case "A":
                        main.add();
                        break;
                    case "D":
                        main.delete();
                        break;
                    case "E":
                        main.emailSearch();
                        break;
                    case "P":
                        main.printList();
                        break;
                    case "S":
                        main.search();
                        break;
                    case "Q":
                        main.quit();
                        break;
                    default:
                        System.out.println("Please try again.");
                }
            }
        }
    }