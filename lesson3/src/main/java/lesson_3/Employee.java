package lesson_3;

////Создать класс "Сотрудник" с полями:
//ФИО, должность, email, телефон, зарплата, возраст.
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль
//Создать массив из 5 сотрудников
//С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String number;
    private Integer salary;
    private Integer age;

    public Employee(String fullName, String position, String email, String number, Integer salary, Integer age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}