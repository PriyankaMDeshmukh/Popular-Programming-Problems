public class StackUsingLinkedList{
     Node top;
     static class Node{
         Node next;
         int data;
         Node(int data){
             this.data=data;
             this.next=null;
         }
     }
     void push(int data){
         Node n=new Node(data);
         n.next=top;
         top=n;
     }
     void pop(){
         top=top.next;
     }
     void print(){
         Node curr=top;
         while(curr!=null){
             if(curr.next==null)
                System.out.print(curr.data);
             else{
                 System.out.print(curr.data+"-->");
             }
             curr=curr.next;
         }
          System.out.println();
     }
     
     public static void main(String []args){
       StackUsingLinkedList stack =new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        System.out.println("After popping the last element");
        stack.pop();
        stack.print();
     }
}
