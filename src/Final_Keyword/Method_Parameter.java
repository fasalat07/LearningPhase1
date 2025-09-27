package Final_Keyword;

public class Method_Parameter {

    public static  void meth(final int n){

        //System.out.println(n++);//java: final parameter n may not be assigned
    }

    public static void main(String[] args) {

        meth(5);
    }
}
