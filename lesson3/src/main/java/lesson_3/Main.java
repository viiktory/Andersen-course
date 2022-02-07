package lesson_3;

public class Main {

    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Elizabeth Smith", "Engineer", "smithel@gmail.com", "+380976552907", 30500, 30);
        persArray[1] = new Employee("Marcus Aelius", "Developer", "devmarc@gmail.com", "+380506490908", 50000, 40);
        persArray[2] = new Employee("Mary Steward", "Web Designer", "maryy@gmail.com", "+380951494832", 40000, 44);
        persArray[3] = new Employee("Bernard Charles", "Developer", "charles@gmail.com", "+380960952911", 55000, 39);
        persArray[4] = new Employee("Alex Stone", "HR Manager", "stoneale@gmail.com", "+380668725987", 55500, 41);

        for (Employee employee : persArray)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }
}
