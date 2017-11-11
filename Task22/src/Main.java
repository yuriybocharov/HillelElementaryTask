public class Main {

    public static void main(String[] args) {


        MyStack myStack1 = new MyStack ();
        MyStack myStack2 = new MyStack ();
        MyStack myStack3 = new MyStack ();
        MyStack myStack4 = new MyStack ();

        myStack1.pushStack ("((())))");
        myStack2.pushStack ("((((((()))))))");
        myStack3.pushStack ("((())))))");
        myStack4.pushStack ("(((((( Ну если я правельнно понял задание))))");

        myStack1.brackets ();
        myStack2.brackets ();
        myStack3.brackets ();
        myStack4.brackets ();
    }

   }

