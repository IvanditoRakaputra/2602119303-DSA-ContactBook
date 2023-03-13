public class ContactBook {
    public String name;
    public String number;
    public String email;

    public ContactBook(String name, String number,String email){
        this.name = name;
        this.number = number;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Name: " + name + " ,Number: " + number + " ,Email: " + email;}
}
