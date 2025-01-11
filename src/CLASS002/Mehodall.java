package CLASS002;

public class Mehodall {
//modifier void/nonvoid methodName () {}
    // Modifier: public,private,protected,default
    //local variable e kono modifier hoy na
    //modifier er kaj hocche  k k access korte parbe


    int salary = 50000;
    String name = "Foysal Ahmed";

    public void printsalary() {
        System.out.println("Foysal Salary" + salary);
    }

    public void printsalary2(String name) {
        System.out.println(name + "Foysal Salary" + salary);
    }

    public int sum(int a, int b) {
        System.out.println("abcdef");
        return a + b;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Mehodall test = new Mehodall();
        test.printsalary();
        test.printsalary2("50000");
        System.out.println(test.sum(567, 432));
        System.out.println(test.getName());

    }

}
