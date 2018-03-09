/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack;

/**
 *
 * @author shalika
 */
public class ImpStack {


    public int maxstack;
    public int[] sarray;

    public int top = -1;

    ImpStack(int s) {
        maxstack = s;
        sarray = new int[maxstack];

    }

    public static void main(String args[]) {

        ImpStack newStack = new ImpStack(10);

        newStack.push(12);
        newStack.push(23);
        newStack.push(34);
        newStack.display();
        newStack.push(45);
        newStack.push(56);
        newStack.display();
        newStack.pop();
        newStack.display();
        newStack.peek();
    }

    public void push(int x) {
        if (top == maxstack - 1) {
            System.out.println("stack is overflow");

        } else {
            top++;
            sarray[top] = x;

        }
//add element to top of the stack
    }

    void display() {
        int k;
        System.out.print("Element of stack : ");
        for (k = 0; k <= top; k++) {

            System.out.print(sarray[k] + ",");
        }
        System.out.println("");

    }

    public void pop() {

        if (top == -1) {
            System.out.println("stack is underflow");

        } else {
            top = top - 1;
        }
  //remove the top element from stack
    }

    public void peek() {
        if(top==-1)
            System.out.println("stack is empty");
        else
        System.out.println("peek value : " + sarray[top]);

    }
}

//pop & push is use to undo redo operations