
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james
 */
public class mySum {
    
    public <T extends Number> double sum (List<T> list) {
        double sum = 0;
        for (Number n : list ) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
