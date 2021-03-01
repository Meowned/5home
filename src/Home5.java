class Person {
    private String FIO;
    private String post;
    private String email;
    private String tel;
    private double salary;
    private int age;

    Person (String fio, String post, String email, String tel, double salary, int age) {
        this.FIO = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Сотрудник несовершеннолетний");
        }
    }
    int GetAge() {
        return age;
    }

    void Show() {
        System.out.println(FIO + " " + post + " " +  email + " " + tel + " " + salary + " " + age);
    }
}

public class Home5 {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "8989898989", 18004, 31);
        persArray[1] = new Person("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "989898989", 34644, 42);
        persArray[2] = new Person("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "798979797", 33465, 33);
        persArray[3] = new Person("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "798797979", 37844, 26);
        persArray[4] = new Person("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "897987979", 45501, 47);

        for (Person item : persArray) {
            if (item.GetAge() > 40) item.Show();
        }
    }
}