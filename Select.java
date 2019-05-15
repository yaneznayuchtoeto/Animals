public class Select{

    public static Animal select(String name, String s) {
        switch (s) {
            case ("ferret"):
                System.out.print("name ");
                return new Ferret(name);
            case ("platynus"):
                System.out.print("name ");
                return new Platynus(name);
        }
        return null;

    }
}