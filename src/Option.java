
public class Option {
	 String arg1;
	 double arg2,arg3;
	    Option(String arg1,double arg2,double arg3){
	        this.arg1 = arg1;
	        this.arg2 = arg2;
	        this.arg3 = arg3;
	    }
	    void optionHandler(){
	        switch (arg1){
	            case "help": System.out.println("Help");break;
	            case "add": new Addition(arg2,arg3);break;
	            case "sub":break;
	            case "mul": break;
	            case "div": break;
	            default: new Session();
	        }
	    }
}
