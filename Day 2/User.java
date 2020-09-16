class User {
    String name;
    int age;
    long phone;
    Identifier identifier; 
    User(String name, int age, long phone, Identifier identifier) {
        this(name, age);
        this.phone = phone;
        this.identifier = identifier;
        System.out.println("User(String, int, long, Identifier) constructor");
    }
    User(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("User(String, int) constructor");
    }
    void setPhone(long phone) {
        this.phone = phone;
    }
    void display() {
        System.out.println("Name = "+this.name+", Age = "+age+", Phone = "+phone);
        System.out.println("Pan = "+identifier.pan+", Aadhar No = "+identifier.aadharNo);
        System.out.println("----------------------");
    }
}