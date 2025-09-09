
import javax.faces.bean.ManagedBean;

@ManagedBean

public class Main {

    private double n1;
    private double n2;
    
   public void troca(){
       
       double t;
        t = n1;
       n1 = n2;
       n2 = t;
       
       
     
   } 

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    
    
    
}
