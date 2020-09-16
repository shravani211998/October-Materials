class UserDemo {
    public static void main(String[] args) {
        Identifier id = new Identifier("ABC1234", 9238232);
        User u1 = new User("Alexandar", 25, 9900223399L, id);
        u1.display();
       
    }
}