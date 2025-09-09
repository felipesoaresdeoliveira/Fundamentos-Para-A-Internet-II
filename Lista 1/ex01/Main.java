
import javax.faces.bean.ManagedBean;

@ManagedBean

public class Main {

    private double x;
    private double y;
    private double z;
    private double result;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void calcular() {
        result = (x + y) / (z * 2);

    }

}
