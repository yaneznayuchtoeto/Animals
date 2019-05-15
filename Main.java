public class Main  {

    public static void main(String[] args) {
        Animal a= Select.select("ferret","platypus");
        try {
            System.out.println(a.name);

            a.walk();
            a.sleep();
            a.eat();
        }catch (Exception e){
            System.out.println("animal doesn't exist");
        }
    }
}