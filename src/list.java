
import java.util.*;
import java.lang.*;
import java.io.*;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node head;
    void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
}


public class list {
    public static void main(String[] args) {

    }
}
