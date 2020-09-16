class UserDemo {
    public static void main(String[] args) {
        User u1 = new User("Alexandar", 25);
        User u2 = new User("Charles", 45);
        u1.display();
        u2.display();
        //u1.phone = 9902039392L
        u1.setPhone(9900112233L);
        u2.setPhone(9911221144L);
        u1.display();
        u2.display();
       
    }
}