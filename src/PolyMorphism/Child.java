package PolyMorphism;

public class Child extends MethodOveriding {

    @Override
        public void sum(int a,int b)
        {
            System.out.println(a+b);
        }

        @Override
        public void disp() {
            System.out.println("this is overiden from child");
        }

        public void MethodonlyInChild()
        {
            System.out.println("this method is from child only");
        }

        public static void main(String[] args) {
            MethodOveriding obj1 = new Child();
            obj1.sum(2,3);
            obj1.disp();
           // obj1.MethodonlyInChild();
            //The compiler says:
            //"Does MethodOveriding have a method called MethodonlyInChild()?" → ❌ No → compile-time error.
        }
}
