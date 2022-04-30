package com.mytechexp.stack;

public class LinkedListStack {

    private Node head=null;
    private Node tail=null;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    public void push(int data)
    {
    Node node=new Node(data);
    if(head==null)
    {
        head=node;
        tail=node;
        return;
    }
    Node nodealt=tail;
   
    nodealt.next=node;
    tail=node;
    }
    public int pop()
    {
        Node nodeItr=head;
        if(head==null)
        {
            System.out.println("Stack is empty");
        }
        int data;

        if(head==tail)
        {
            data=nodeItr.data;
            head=null;tail=null;
            return data;
        }
      while(nodeItr.next.next!=null)
      {
          nodeItr=nodeItr.next;
      }
      data=nodeItr.next.data;
      nodeItr.next=null;
      tail=nodeItr;
      return data;
    }
    public int peek()
    {
        Node nodeItr=head;
        if(head==tail)
        {
            System.out.println("Stack is empty");
        }
      while(nodeItr.next.next!=null)
      {
          nodeItr=nodeItr.next;
      }
      int data=nodeItr.next.data;
      return data;
    }
    public void list() {
        if(head==null)
        {
            System.out.println("Empty Stack");
        }
        Node nodeItr=head;
        while(nodeItr.next!=null)
        {
        System.out.println(nodeItr.data);
        nodeItr=nodeItr.next;
        }
        System.out.println(nodeItr.data);
    }
}
