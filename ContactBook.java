class ContactBook {
    public String name;
    public String email;
    public String number;
    public ContactBook(String name, String email,String number){
        this.name = name;
        this.email = email;
        this.number = number;
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
        System.out.println(super.toString());
        return String.format(
            "name: %s\nemail: %s\nnumber: %s\n",
            this.name,this.email,this.number);}
}
