package DSA;

class Stack{

    int[] arr = new int[5];
    int top;
    int size;

    public Stack(){
        top=-1;
        size = arr.length;
    }

    public void push(int data){
        if(top<size-1)
            arr[++top] = data;
        else{
            System.out.println("Stack Overflow");
        }
    }

    public int pop(){
        if(top>-1){
            return arr[top--];
        }
        else{
            System.out.println("Stack Underflow");
        }
        return 0;
    }

    public int peek(){
        if(top>-1)
            return arr[top];
        else
            System.out.println("Stack is empty");
        return 0;
    }

    public void printStack(){
        if(top==-1)
            System.out.println("Stack is empty");
        else{
            for(int n : arr){
                System.out.print(n + " ");
            }
        }
    }
}
public class Stack_Java {
    public static void main(String a[]){
        Stack stack = new Stack();

        stack.push(4);
        stack.push(7);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(9);
        stack.push(5);
        stack.push(8);
        System.out.println(stack.peek());
        stack.printStack();
    }
}
