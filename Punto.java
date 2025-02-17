import java.text.DecimalFormat;

public class Punto {
    public float x;
    public float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] coordCartesianas() {
        return new float[]{x, y};
    }

    public float[] coordPolares() {
        float r = Math.sqrt(x * x + y * y);
        float theta = Math.toDegrees(Math.atan2(y, x));
        return new float[]{r, theta};
    }

    @Override
    public String toString() {
        return "Punto(x=" + x + ", y=" + y + ")";
    }

    public static void main(String[] args) {
        Punto p = new Punto(7, 9);
        System.out.println(p);

        float[] cartesianas = p.coordCartesianas();
        System.out.println("Cartesianas: (" + cartesianas[0] + ", " + cartesianas[1] + ")");

        float[] polares = p.coordPolares();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Polares: (r=" + df.format(polares[0]) + ", theta=" + df.format(polares[1]) + "°)");
    }
}
