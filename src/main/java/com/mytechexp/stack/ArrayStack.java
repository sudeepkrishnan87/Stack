package com.mytechexp.stack;


public class ArrayStack {

    Integer[] stackArr=null;
    int top=-1;
    public void initialize(int size)
    {
        stackArr=new Integer[size];
        System.out.println("Stac Initialisedk");
    }
    
    public int top()
    {
      return top;
    }
    public int peek()
    {
        return stackArr[top];
    }
    public int pop()
    {
        int pop=stackArr[top];
        stackArr[top]=null;
        top--;
        return pop;
    }
    public void push(int data)
    {
      if(top==stackArr.length-1)
       {
           System.out.println("Stack is full");
           return;
       }
       top++;
       stackArr[top]=data;
    }

    public void list()
    {
        for(int i=0;i<stackArr.length;i++)
        {
            if(null!=stackArr[i])
         System.out.println(stackArr[i]);

        }
    }
}
