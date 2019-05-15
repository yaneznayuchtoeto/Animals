public class Ferret extends Animal {
    public Ferret(String name){
        this.name=name;
    }
    public void select(String name){
        this.name=name;
    }
    public void walk() {
        System.out.println("ferret "+name+" walking");
    }
    public void eat() {
        System.out.println("ferret "+name+" walking");
    }
    public void sleep() {
        System.out.println("ferret "+name+" sleeping");
    }
}