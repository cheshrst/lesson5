package geekbrains.homework5.online;

class Person {
    private String fio;
    private String post;
    private String email;
    private String tel;
    private int salary;
    private int age;
    Person(String fio, String post, String email, String tel, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Сотруднику не может быть меньше 18 лет");
        }
    }
    int GetAge() {
        return age;
    }
    void Show() {
        System.out.println(fio + ", " + post + ", " +  email + ", " + tel + ", " + salary + "р, " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        int a = 5; //Кол-во сотрудников
        Person[] persArray = new Person[a];
        persArray[0] = new Person("Ivanov Ivan", "Стажировщик", "ivivan@mailbox.com", "+78005553535", 50000, 30);
        persArray[1] = new Person("Igor Ignatov", "Стажер", "igorIgnatov@mailbox.com", "+79993337755", 30000, 20);
        persArray[2] = new Person("Alesha Pupkin", "Начальник", "AleshaPupkin@mailbox.com", "+77006005040", 1000000, 70);
        persArray[3] = new Person("Ahalai Dolmatov", "Оффик", "AhalaiDolmatov@mailbox.com", "+79813457667", 60000, 50);
        persArray[4] = new Person("Ignat Igorevich", "Охранник", "IgnatIgorevich@mailbox.com", "+79283444044", 60000, 50);
        for(Person item : persArray) {
            if(item.GetAge() > 40) item.Show();
        }
    }
}
