package questions;

class Employee {
    private int id;
    private String fname;

    public Employee(int id, String fname) {
        this.id = id;
        this.fname = fname;
    }

    
}

public class HashcodeAndEquals {

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"chandra");
        Employee e2 = new Employee(1,"chandra");

        System.out.println(e1.equals(e2));
        System.out.println(e1==e2);
    }
}
