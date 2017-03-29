package code;

/**
 * Created by cuongdd2@gmail.com on 18-Mar-17.
 */
public class Person2 {
    private int age;

    public Person2(int initialAge) {
        if (initialAge >= 0) this.age = initialAge;
        else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void yearPasses() {
        this.age++;
    }

    public void amIOld() {
        String msg;
        if (this.age < 13) msg = "You are young.";
        else if (this.age >= 18) msg = "You are old.";
        else msg = "You are a teenager.";
        System.out.println(msg);
    }
}
