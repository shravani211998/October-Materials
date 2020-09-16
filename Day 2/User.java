class User {
    String name;
    int age;
    long phone;
    
    User(String n, int a, long p) {
        System.out.println("User(String, int, long) constructor");
        name = n;
        age = a;
        phone = p;
    }
    User(String n, int a) {
        System.out.println("User(String, int) constructor");
        name = n;
        age = a;
    }
    void setPhone(long p) {
        phone = p;
    }
    void display() {
        System.out.println("Name = "+name+", Age = "+age+", Phone = "+phone);
        System.out.println("----------------------");
    }
}