package Code.Stack;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: "+animals);
        //output : Stack: [Lion, Dog, Horse, Cat]

        System.out.println(animals.peek());
        // output : Cat

        animals.pop();

        System.out.println(animals.peek());
    }
}
