import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Session {
	double num1,num2;
    Session(){
        while(true){
            System.out.print("> ");
            BufferedReader buf = new BufferedReader (new InputStreamReader(System.in));
            String op = null;
            try {
                op = buf.readLine();
                String[]arg = op.split(" ");
               num1 = Double.parseDouble(arg[1]);
               num2 = Double.parseDouble(arg[2]);
              Option obj = new Option(arg[0],num1,num2);
              obj.optionHandler();
            } catch (IOException e) {
                e.printStackTrace();
            }    
            
        }
    }
}
