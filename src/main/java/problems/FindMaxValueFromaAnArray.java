package problems;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValueFromaAnArray {
    public static void main(String[] args) {
        int [] values={22,23,43,93,47,111};
        int largest=values[0];
        for (int i=0;i<values.length; i++){
            if (largest<values[i]);
            largest=values[i];
        }
        System.out.println(largest);
    }

}
