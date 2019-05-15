
public class Platynus extends Animal {
    public Platynus(String name){
        this.name=name;
    }
    public void select(String name){
        this.name=name;
    }
    public void walk() {
        System.out.println("platynus "+name+" walking");
    }
    public void eat() {
        System.out.println("platynus "+name+" eating");
    }
    public void sleep() {
        System.out.println("platynus "+name+" sleeping");
    }
}