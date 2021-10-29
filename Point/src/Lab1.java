import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble(); //сканируем введенные пользователем переменные
        double y1 = scan.nextDouble();
        double z1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double z2 = scan.nextDouble();
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        double z3 = scan.nextDouble();
        Point3d one = new Point3d(x1, y1, z1); //создаем 3 объекта Point3d
        Point3d two = new Point3d(x2, y2, z2); //на основе введенных переменных
        Point3d three = new Point3d(x3, y3, z3);

        if (!one.Equal3d(two) && !two.Equal3d(three) && !three.Equal3d(one)) { //проверяем равны ли какие-либо 2 точки
            System.out.println("Площадь треугольника равна " + computeArea(one, two, three));
        } else {
            System.out.println("Площадь треугольника не может быть посчитана");
        }
    }

    public static double computeArea(Point3d obj1, Point3d obj2, Point3d obj3) { //метод для вычисления площади треугольника
        double a = obj1.distanceTo(obj2);
        double b = obj2.distanceTo(obj3);
        double c = obj3.distanceTo(obj1);
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

}
