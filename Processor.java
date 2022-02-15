public class Processor {
    public static void main(String[] args){
        StackOfIntegers stack1 = new StackOfIntegers(10);
        
        for(int i =0; i<10; i++){
            stack1.push(i);
        }
        
        while(!stack1.empty()){
            System.out.print(stack1.pop() + " ");
        }
        
        // stack1.push(69);
        // stack1.push(7);
        // // System.out.println("Num of items in Stack: " + stack1.getSize());
        // stack1.printStack();
        // stack1.pop();
        // stack1.printStack();
        // // System.out.println("Value at the top is: " + stack1.peek());
        // stack1.push(100);
        // stack1.push(21);
        // stack1.push(25);
        // stack1.pop();
        // stack1.printStack();
    }
}

//Value at the top is: 69
//Inserted: 100 @ top: 1
//Inserted: 21 @ top: 2
//Inserted: 25 @ top: 3
//Current top is: 3
//[ 69 100 21 25 ]
