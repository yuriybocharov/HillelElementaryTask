import java.util.Stack;


public class MyStack {
    Stack<Character> stack = new Stack<> ();

    public void pushStack(String s) {
        for (int i = 0; i < s.length (); i++) {
            stack.push (s.charAt (i));
        }
    }

   public void brackets() {
        int a = 0;
        int b = 0;
        char c;
        while (!stack.empty ()) {
            c = stack.pop ();
            if (c == ('(')) {
                a++;
            }
            if (c == (')')) {
                b++;
            }
        }
        System.out.println ("Открывыющих скобок = " + a + " " + " Закрывающих скобок " + b);
    }

}