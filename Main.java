import java.util.*;
class Stack {
      int top;
      int maxsize=5;
      int[]stack_arry=new int[maxsize];
    
     Stack()             {  top=-1;        }
    boolean isEmpty()    { return(top<0);  }
      
    boolean push(int val){
           if(top==maxsize-1){
              System.out.println("Stack Underflow !!");
              return false;
              }
           else{
                top++;
                stack_arry[top]=val;
                return true;
                }
            }
     boolean pop(){
            if(top==-1){
                 System.out.println("Stack Underflow !!");
                 return false;
                 }
             else{
                    System.out.println("\nIteam popped: "+stack_arry[top--1]);
                    return false;
                    }
             }
   void display() {
        System.out.println("Printing stack elements.....");
        for(int i =top;i>0;i--) {
                System.out.print(stack_arry[i]+" ");
               } 
   }
 class Main {
       public static void main(String[] args){
               Stack stck=new Stack();
               System.out.println("Initial Stack Empty:"+stck.isEmpty());
               stck.push(10);
               stck.push(20);
               stck.push(30);
               stck.push(40);
               System.out.println("After Push Operation...");
               stck.display();
               stck.pop();
               stck.pop();
               System.out.println("After Pop Operation...");
               stck.display();
}