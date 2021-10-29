public class Point2d { //создаем двумерный класс точки
    public double xCoord; //объявляем координаты
    public double yCoord;
    public Point2d(double x, double y) { //инициилизируем координаты
        xCoord = x;
        yCoord = y;
    }
    public Point2d() { //вызываем конструктор с двумя параметрами

        this(0,0);
    }
    public double getX() { //возвращаем координату х

        return xCoord;
    }
    public double getY() { //возвращаем координату y

        return yCoord;
    }
    public void setX(double val) { //задаем значение координате х

        xCoord = val;
    }
    public void setY(double val) { //задаем значение координате y

        yCoord = val;
    }
    public boolean Equal2d(Point2d obj) { //метод для сравнения значений

        return this.xCoord == obj.xCoord && this.yCoord == obj.yCoord;
    }
    public static void main(String[] args) {
    }
}
