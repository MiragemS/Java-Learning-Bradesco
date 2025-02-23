import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Manager();
        Employee emp2 = new Salesman();
        printEmployee(emp);
        printEmployee(emp2);
    }

    public static void printEmployee(Employee emp){
        switch (emp){
            case Manager manager -> {
                emp.setName("João");
                manager.setLogin("joao@gmail.com");
                manager.setPassword("2k3ikdo");

                System.out.println(emp.getClass());
                System.out.println(emp.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
            }

            case Salesman salesman -> {
                emp.setName("João");
                salesman.setLogin("joao@gmail.com");
                salesman.setPassword("2k3ikdo");

                System.out.println(emp.getClass());
                System.out.println(emp.getName());
                System.out.println(salesman.getLogin());
                System.out.println(salesman.getPassword());
            }
            default -> {
                System.out.println("Nenhum trabalhador encontrado");
            }
        }

    }
}