public class Punto {
    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

    public static void main(String[] args) {
        Punto puntoA = new Punto();
        puntoA.setX(23.5);
        puntoA.setY(-14.0);
        System.out.println("punto en x:" + puntoA.getX());
        System.out.println(puntoA.toString());

    }

}
