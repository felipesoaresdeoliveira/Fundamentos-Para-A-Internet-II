
import java.util.List;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;

@ManagedBean

public class Main {

    private int n1;

    private String x;
    private String y;

    public void verifica() {

        if (n1 % 2 == 0) {
            x = "É Par";
        }
        if (n1 % 5 == 0) {
            y = "É dividido por 5";

        }

    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

}
