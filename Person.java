public class Person {
    static String name;
    static String post;
    static String email;
    static String phoneNumb;
    static int salary;
    static int age;



    public static void PrintPerson(){
        System.out.println("ФИО:            " + name);
        System.out.println("Должность:      " + post);
        System.out.println("email:          " + email);
        System.out.println("Номер телефона: " + phoneNumb);
        System.out.println("Зарплата:       " + salary);
        System.out.println("Возраст:        " + age);
        System.out.println();
    }
    public Person(String name, String post, String email, String phoneNumb, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumb = phoneNumb;
        this.salary = salary;
        this.age = age;
//        PrintPerson();
        while (age > 40) {
            PrintPerson();
            break;
        }
    }
}
