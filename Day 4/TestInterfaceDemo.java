interface FoodService {
    void starters();
    void mainCourse();
}
class Adigas implements FoodService {
    public void starters() {
        System.out.println("Adigas - Sweets and Adgias Fast Food");
    }
    public void mainCourse() {
        welcomeDrink();
        System.out.println("Adigas Rotis and Adigas Biryani");
    }
    public void welcomeDrink() {
        System.out.println("Adigas welcome drink");
    }
}
class A2B implements FoodService {
    public void starters() {
        System.out.println("A2B - Sweets and A2B Fast Food");
    }
    public void mainCourse() {
        System.out.println("A2B Rotis and A2B Biryani");
    }
}
class TestInterfaceDemo {
   public static void main(String[] args) {
    A2B a2B = new A2B();
    Adigas adigas = new Adigas();

    FoodService service = a2B;
    service.starters();
    service.mainCourse();

    service = adigas;
    service.starters();
    service.mainCourse();
   }
}
