//definition of LockDList
package list;
public class LockDList extends DList{
	
 protected DListNode newNode(Object item, DListNode prev, DListNode next) {
	 //System.out.println("In LockedDList!");
    return new LockDListNode(item, prev, next);
  }
 protected DListNode newNode(DListNode node) {
	 
    return new LockDListNode(node.item,node.prev,node.next);
	
  }
  public void lockNode(DListNode node) {
	  ((LockDListNode)node).SetLock();
	  
  }

  /**
   *  DList() constructor for an empty DList.
   */
  public LockDList() {
    //  Your solution here.
	head=newNode(new Integer(0),null,null);
	head.next=head;
	head.prev=head;
	size=0;
  }

  /**
   *  isEmpty() returns true if this DList is empty, false otherwise.
   *  @return true if this DList is empty, false otherwise. 
   *  Performance:  runs in O(1) time.
   */
 

  /** 
   *  length() returns the length of this DList. 
   *  @return the length of this DList.
   *  Performance:  runs in O(1) time.
   */
  
  /**
   *  insertFront() inserts an item at the front of this DList.
   *  @param item is the item to be inserted.
   *  Performance:  runs in O(1) time.
   */
/*   public void insertFront(Object item) {
    // Your solution here.
	if(size!=0)
	{
		DListNode Nnode=newNode(item,head,head.next);
		head.next.prev=Nnode;
		head.next=Nnode;
		size++;
	}
	else
	{
		DListNode Nnode=newNode(item,head,head);
		head.next=Nnode;
		head.prev=Nnode;
		size++;
	}
  }
 */
  /**
   *  insertBack() inserts an item at the back of this DList.
   *  @param item is the item to be inserted.
   *  Performance:  runs in O(1) time.
   */
  public void insertBack(Object item) {
    // Your solution here.
	if(size!=0)
	{
		DListNode Nnode=newNode(item,head.prev,head);
		head.prev.next=Nnode;
		head.prev=Nnode;
		size++;
	}
	else {
		
		DListNode Nnode=newNode(item,head,head);
		head.prev=Nnode;
		head.next=Nnode;
		size++;
	}
  }

public LockDListNode front() {
    // Your solution here.
	/* if(isEmpty())
	{
		return null;
	}
	else
	{
		return head.next;
	} */
	return (LockDListNode)(super.front());
  }

  /**
   *  back() returns the node at the back of this DList.  If the DList is
   *  empty, return null.
   *
   *  Do NOT return the sentinel under any circumstances!
   *
   *  @return the node at the back of this DList.
   *  Performance:  runs in O(1) time.
   */
  public LockDListNode back() {
    // Your solution here.
	/* if(isEmpty())
	{
		return null;
	}
	else{
		return head.prev;
	} */
	return (LockDListNode)(super.back());
  }

  /**
   *  next() returns the node following "node" in this DList.  If "node" is
   *  null, or "node" is the last node in this DList, return null.
   *
   *  Do NOT return the sentinel under any circumstances!
   *
   *  @param node the node whose successor is sought.
   *  @return the node following "node".
   *  Performance:  runs in O(1) time.
   */
  public LockDListNode next(DListNode node) {
    // Your solution here.
/* 	DListNode cnode=newNode(new Integer(0),null,null);
	cnode=head;
	if(size<=1)
	{
		return null;
	}
	while((node!=null)&&(cnode.next!=head))
	{
		if(cnode==node)
		{
			return cnode.next;
		}
		cnode=cnode.next;
	}
	return null; */
	
	return (LockDListNode)(super.next(node));
  }

  /**
   *  prev() returns the node prior to "node" in this DList.  If "node" is
   *  null, or "node" is the first node in this DList, return null.
   *
   *  Do NOT return the sentinel under any circumstances!
   *
   *  @param node the node whose predecessor is sought.
   *  @return the node prior to "node".
   *  Performance:  runs in O(1) time.
   */
  public LockDListNode prev(DListNode node) {
    // Your solution here.
/* 	DListNode cnode=newNode(new Integer(0),null,null);
	cnode=head;
	if(size<=1)
	{
		return null;
	}
	while((node!=null)&&(cnode.prev!=head))
	{
		if(cnode==node)
		{
			return cnode.prev;
		}
		cnode=cnode.prev;
	}
	return null; */
	return (LockDListNode)(super.prev(node));
  }

  /**
   *  insertAfter() inserts an item in this DList immediately following "node".
   *  If "node" is null, do nothing.
   *  @param item the item to be inserted.
   *  @param node the node to insert the item after.
   *  Performance:  runs in O(1) time.
   */
  public void insertAfter(Object item, DListNode node) {
    // Your solution here.
	if(node==null)
	{
		return;
	}
	else {
		DListNode Nnode=newNode(item,node,node.next);
		node.next.prev=Nnode;
		node.next=Nnode;
		size++;
	}
  }

  /**
   *  insertBefore() inserts an item in this DList immediately before "node".
   *  If "node" is null, do nothing.
   *  @param item the item to be inserted.
   *  @param node the node to insert the item before.
   *  Performance:  runs in O(1) time.
   */
  public void insertBefore(Object item, DListNode node) {
    // Your solution here.
	if(node==null)
	{
		return;
	}
	else{
		DListNode Nnode=newNode(item,node.prev,node);
		node.prev.next=Nnode;
		node.prev=Nnode;
		size++;
	}
  }
  
  
  public void remove(DListNode node) {
    // Your solution here.
	if((((LockDListNode)node).isLocked())||(node==null))
	{
		return;
	}
	else
	{
		node.prev.next=node.next;
		node.next.prev=node.prev;
		size--;
	}
  }

  /**
   *  toString() returns a String representation of this DList.
   *
   *  DO NOT CHANGE THIS METHOD.
   *
   *  @return a String representation of this DList.
   *  Performance:  runs in O(n) time, where n is the length of the list.
   */
  public String toString() {
    String result = "[  ";
    DListNode current = head.next;
    while (current != head) {
      result = result + current.item + "  ";
      current = current.next;
    }
    return result + "]";
  }

	
}