import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        while(true){
            System.out.println("Escolha o cálculo desejado: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair");
            option = sc.nextInt();
            if(option == 1) System.out.println(squareForms());
            else if(option == 2) System.out.println(rectangleForms());
            else if(option == 3) System.out.println(circleForms());
            else if(option == 4) break;
            else continue;
        }
    }

    private static double squareForms(){
        System.out.println("Informa o lado do quadrado: ");
        double side = sc.nextDouble();
        return new Square(side).squareArea();
    }

    private static double rectangleForms(){
        System.out.println("Informa a base do retângulo: ");
        double base = sc.nextDouble();
        System.out.println("Informe a altura do retângulo: ");
        double height = sc.nextDouble();
        return new Rectangle(height, base).rectangleArea();
    }

    private static double circleForms(){
        System.out.println("Informe o tamanho do raio: ");
        double radius = sc.nextDouble();
        return new Circle(radius).circleArea();
    }
}