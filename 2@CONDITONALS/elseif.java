public class elseif {
    public static void main(String[] args) {
        int age = 5;
        if (age < 10) {
            System.out.println("u r a kid");
        } else if (age <= 0 && age < 10) {
            System.out.println("u r a kid");
        } else if (age > 10 && age < 18) {
            System.out.println("u r a teen");
        } else if (age > 18 && age < 50) {
            System.out.println("u r an adult");
        } else if (age > 50 && age < 60) {
            System.out.println("u r an man");
        } else {
            System.out.println("u r an old man");
        }
    }
}
