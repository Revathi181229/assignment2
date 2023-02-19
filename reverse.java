import java.util.*;
class Node
{
  int d;
  Node nt;
  public Node(int d)
  {
    this.d=d;
    nt=null;
  }
}
class RemoveDuplicateElements
{
  public static void displayList(Node head)
  {
     Node temp=head;
     while(temp.nt!=null)
     {
        System.out.print(temp.d+"-->");
        temp=temp.nt;
     }
     System.out.println(temp.d);
  }
  
 public static Node removeDuplicates(Node head)
 {
     HashSet<Integer> hs=new HashSet<>();
     Node temp=head,prev=null;
     if(head==null)
       return null;
     if(head.nt==null)
       return head;
     while(temp!=null)
     {
         int val=temp.d;
         if(!hs.contains(val))
          {
            hs.add(val);
            prev=temp;
            temp=temp.nt;
          }
          else
          {
            prev.nt=temp.nt;
            temp=temp.nt;
          }
     }
    return head;
 }

  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     Node head=null;
     int n=sc.nextInt();
     int e,p,ch;
     while(n-->0)
     {
        e=sc.nextInt();
        Node l=new Node(e);
        if(head==null)
             head=l;
        else
         {
            Node curr=head;
	    while(curr.nt!=null)
	       curr=curr.nt;
	    curr.nt=l;
            
         }
     }
     displayList(head);
     head=removeDuplicates(head);
     displayList(head); 
    
  }
}

