
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
public class myAdd {
    public <T extends Number> double addme (T tFirst, T tSecond) {
        double addsum = 0.0;
        addsum = tFirst.doubleValue()+tSecond.doubleValue();
        return addsum;
    }
}
