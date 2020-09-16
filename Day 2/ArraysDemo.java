class ArraysDemo {
    public static void main(String[] args) {
      String[] arr = new String[4];
      arr[0] = "Alex";
      arr[1] = "Bruce";
      for(int i = 0; i < arr.length; i++) {
        if(arr[i] != null)
            System.out.println(arr[i]);
      }  
      System.out.println("---------------------");
      String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
      for(int i = 0; i < days.length; i++) {
          System.out.print(days[i]+" ");
      }
    }
}