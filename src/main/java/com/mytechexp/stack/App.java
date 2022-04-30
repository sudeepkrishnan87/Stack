package com.mytechexp.stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayStack arStack=new ArrayStack();
        arStack.initialize(5);
        arStack.push(1);
        arStack.push(2); arStack.push(3); arStack.push(4); arStack.push(5);
        arStack.list();

        arStack.push(6);
        arStack.pop();
        arStack.list();
        System.out.println(arStack.peek());
        System.out.println(arStack.top());
        

        System.out.println("Linked List implementation");
        System.out.println("###########################");

        LinkedListStack lStack=new LinkedListStack();
        lStack.push(100);
        lStack.list();
        System.out.println( lStack.pop());
        lStack.push(200);
        lStack.push(300);
        lStack.push(400);
        lStack.push(500);
        lStack.list();
        System.out.println(lStack.pop());
        System.out.println(lStack.peek());

    }
}
