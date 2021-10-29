import java.lang.Math;

public class Point3d extends Point2d { //создаем трехмерный класс точки
    public double zCoord; //объявляем координату
    public Point3d(double x, double y, double z) { //инициилизируем координаты
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d() {//вызываем конструктор с тремя параметрами
        this(0,0,0);
    }
    public double getZ() { //возвращаем координату z

        return zCoord;
    }
    public void setZ(double val) { //задаем значение координате z

        zCoord = val;
    }
    public boolean Equal3d(Point3d obj) { //метод для сравнения значений

        return this.xCoord == obj.xCoord && this.yCoord == obj.yCoord && this.zCoord == obj.zCoord;
    }
    public double distanceTo(Point3d obj) { //метод для подсчета расстояния между 2 точками с точностью до сотых
        return Math.ceil(Math.abs(Math.sqrt(Math.pow(obj.xCoord - this.xCoord, 2) + Math.pow(obj.yCoord - this.yCoord, 2) + Math.pow(obj.zCoord - this.zCoord, 2)))*100)/100;
    }
    public static void main(String[] args) {
    }
}
