class Test {
    int x = 25; // instance variable
    static int y = 35; // class variable

    void demo() {
       System.out.println("demo()");
    }

    static void foo() {
        System.out.println("beginning of foo()");
        Test t = new Test();
        t.demo();
        System.out.println("end of foo()");
    }
}