public class StackOfIntegers{
    private int[] elements;
    private int size;

    // Default Constructor
    public StackOfIntegers(){
        this.elements = new int[size];
        this.size = -1;
    }
    // Constructor with Specified Capacity
    public StackOfIntegers(int size){
        this.elements = new int[size];
        this.size = -1;
    }
    public boolean empty(){
        return this.size == 0;
    }
    public int peek(){
        return this.elements[size];
    }

    public void push(int value){
        // if (this.elements.length == size){
        //     System.out.println("Stack Overflow Error!");
        //     // printStack();
        //     System.out.println("Program Terminated.");
        //     System.exit(0);
        // }
        size += 1;
        this.elements[size] = value;
        // System.out.println("Inserted: " + value + " @ position: " + size);
        
    }

    public int pop(){
        // !!! Fixed removed_value not printing
        int removed_value = this.elements[size];
        // this.peek();
        // System.out.println("Removed: " + removed_value + " @ position: " + size);
       size --;
        return removed_value;
    }

    public int getSize(){
        return size;
    }

    public void printStack(){
        // System.out.println("Current top is: " + (size-1));
        // System.out.print("[ ");
        for(int i=0; i<size; i++){
            System.out.print(this.elements[i] + " ");
        }
        // System.out.print("]\n");
    }
}
