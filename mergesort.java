class MList{
    static node h1 = null;
    static node h2 = null;
    static class node
    {
    int d;
    node next;
    };
    static void setData(node head)
    {
    node temp;
    temp = head;
    while (temp != null)
    {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    }
    static node getData(node head, int num)
    {
    node temp = new node();
    node tail = head;
    temp.data = num;
    temp.next = null;
    if (head == null)
    {
        head = temp;
        tail = temp;
    }
    else
    {
        while (tail != null)
        {
        if (tail.next == null)
        {
            tail.next = temp;
            tail = tail.next;
        }
        tail = tail.next;
        }
    }
    return head;
    }
    static node mergelists()
    {
    node tail = h1;
    while (tail != null)
    {
        if (tail.next == null &&
            h2 != null)
        {
        tail.next = h2;
        break;
        }
        tail = tail.next;
    }
    return h1;
    }
    
    static void sortlist()
    {
    node curr = h1;
    node temp = h1;
    while (curr.next != null)
    {
        temp = curr.next;
        while (temp != null)
        {
        if (temp.data < curr.data)
        {
            int t = temp.data;
            temp.data = curr.data;
            curr.data = t;
        }
        temp = temp.next;
        }
        curr = curr.next;
    }
    }
    

    public static void main(String[] args)
    {
    
    head1 = getData(h1, 25);
    head1 = getData(h1, 35);
    head1 = getData(h1, 12);
    head1 = getData(h1, 4);
    head1 = getData(h1, 36);
    head1 = getData(h1, 48);
    
    head2 = getData(h2,8 );
    head2 = getData(h2, 32);
    head2 = getData(h2, 22);
    head2 = getData(h2, 45);
    head2 = getData(h2,63 );
    head2 = getData(h2, 49);
    head1 = mergelists();
    sortlist();
    setData(h1);
    }
  }
}