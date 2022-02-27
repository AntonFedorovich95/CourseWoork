package ru.skypro;

import java.util.Arrays;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void FullName(Employee[] e) {
        String fullname;
        for (Employee fu : employees) {
            fullname = fu.fullName;
            System.out.println("Ф.И.О. - " + fullname);
        }
    }
    public static void Sum (Employee[] e) {
        double sum;
        double summ = 0;
        for (Employee su : employees) {
            sum = su.salary;
            summ += sum;
        }
        System.out.println("Сумма зарплат - " + summ);
    }
    public static void maxmin (Employee[] e) {
        double min = 100000;
        double max = 0;
        for (Employee element : employees) {
            if (element.salary > max) {
                max = element.salary;
            }
            if (element.salary < min) {
                min = element.salary;
            }
        }
        System.out.println("Минимальная зарплата - " + min);
        System.out.println("Максимальная зарплата - " + max);
    }
    public static void srednee (Employee [] e) {
        double sum = 0;
        double summ = 0;
        for (Employee su : employees) {
            sum = su.salary;
            summ += sum;
        }
        System.out.println("Средняя зарплата - " + summ/employees.length);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "employees = " + Arrays.toString(employees) +
                '}';
    }
    public static void main(String[] args) {
        Employee ivanov = new Employee("Иванов Иван Иванович", 1, 42500);
        Employee petrov = new Employee("Петров Петр Петрович", 2, 41200);
        Employee sidorov = new Employee("Сидоров Геннадий Павлович", 3, 45700);
        Employee anisimova = new Employee("Анисимова Анна Юрьевна", 5, 42700);
        Employee voronina = new Employee("Воронина Инна Евгеньевна", 3, 41400);
        Employee garina = new Employee("Гарина Ирина Викторовна", 5, 40000);
        Employee nikitin = new Employee("Никитин Сергей Иванович", 1, 42800);
        Employee sorokin = new Employee("Сорокин Игорь Геннадьевич", 4, 40700);
        Employee minin = new Employee("Минин Денис Анатольевич", 2, 43200);
        Employee manahov = new Employee("Манахов Артем Владимирович", 4, 47000);
        employees[0] = ivanov;
        employees[1] = petrov;
        employees[2] = sidorov;
        employees[3] = anisimova;
        employees[4] = voronina;
        employees[5] = garina;
        employees[6] = nikitin;
        employees[7] = sorokin;
        employees[8] = minin;
        employees[9] = manahov;
        //System.out.print(Arrays.toString(employees));
        //Arrays.stream(employees).forEach(System.out::println);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        FullName(employees);
        Sum(employees);
        maxmin(employees);
        srednee(employees);
    }
}