
import java.util.List;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;

@ManagedBean

public class Main {

    private int n1;
    private int n2;
   private List<Integer> impares;
   
 public List<Integer> getImpares() { return impares; }
 
    public void conta() {
impares = new ArrayList<>();
        for (int x = n1; x  <= n2; x++) {

            if (x % 2 == 1) {

                impares.add(x);

            }

        }

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

}
