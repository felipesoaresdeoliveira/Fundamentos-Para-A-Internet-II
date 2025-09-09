
import java.util.List;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;

@ManagedBean

public class Main {

    private int n1;
    private int n2;
    private int n3;
    private String x;

    public void verifica() {

        double y = (n1 + n2 + n3) / 3;

        if (y >= 7) {
            x = "Passou";
        } 
        
        else if(n1 >= 9 || n2 >=9||n3 >=9){
            x = "Passou";
         
        } else {
            x = "Não Passou";
        }

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

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

}
