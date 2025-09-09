
import java.util.List;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;

@ManagedBean

public class Main {

    private int n1;
   private int n2;
private String x;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
 
 
    public void verifica() {

        if(n1 > 15){
            
            if(n2 == 1){
                
                x = "é elegivel";
                
                
            }else{
                x = "não é elegivel";
                
            }
            
            
            
        }else{
             x = "não é elegivel";
        }

    }

    

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }


}
