// RList Definition

public class RList {
	
	protected RNode head;
	protected RNode tail;
	int size;
	
	public RList()
	{
		head=null;
		tail=null;
		
		size=0;
	}
	public RList(RNode node)
	{
		head=node;
		tail=node;
		size=1;
	}
	public RList(int[] a, int[] times)
	{
		this(new RNode(a[0],a[1],a[2],times[0],times[1],times[2]));
	}
	public RList(RNode node1,RNode node2)
	{
		head=node1;
		tail=node2;
		head.next=tail;
		tail.prev=head;
		size=2;
	}
	public RList(RList rl)
	{
		head=rl.head;
		tail=rl.tail;
		size=rl.size;
	}
	public void insertfront(RNode node)
	{
		if(size!=0)
		{	
			node.next=head;
			head.prev=node;
			head=node;
			size++;
		}
		else 
		{
			head=node;
			tail=node;
			size++;
			
		}
	}
	public void insertend(RNode node)
	{
		if(size!=0)
		{
			node.prev=tail;
			tail.next=node;
			tail=node;
			size++;
		}
		else
		{
			head=node;
			tail=node;
			size++;
		}
	}
	public void deletefront()
	{
		if((size!=1)&&(size!=0))
		{
			head=head.next;
			head.prev=null;
			size--;
		}
		else
		{
			head=null;
			tail=null;
			size=0;
		}
	}
	public void deleteend()
	{
		if((size!=0)&&(size!=1))
		{
			tail=tail.prev;
			tail.next=null;
			size--;
		}
		else{
			head=null;
			tail=null;
			size--;
		}
	}
	
	public String toString()
	{ 
	    if(size==0)
		{
			return "null";
		}
		else {
			String s=new String("In order:\r\n"+head.prev+"==>");
			RNode node=head;
			
			while(node!=tail.next)
			{
				s+=node+"==>";
				node=node.next;
				
			}
			s+=tail.next+"\r\n"+"Revert Order:\r\n"+tail.next+"<==";
			node=tail;
			while(node!=head.prev)
			{
				s+=node+"<==";
				node=node.prev;
			}
			s+=head.prev+"\r\n";
			return s;
			}
			
	}
		
		

	
	 public static void main(String arg[]) throws Exception {
		RList l1=new RList();
		RList l2=new RList(new RNode());
		RList l3=new RList(new RNode (1,2,3,0,1,2));
		l1.insertend(new RNode(2,4,6,1,3,5));
		l3.insertfront(new RNode(21,2,3,0,1,2));
		l3.insertend(new RNode(31,2,3,0,1,2));
		System.out.print(l3);
		System.out.print(l1);
		System.out.print(l2);
		l3.deleteend();
		System.out.print(l3);
		l3.deletefront();
		System.out.print(l3);
		l3.deletefront();
		System.out.print(l3);
		int width=11;
		int height=12;
		RList l4=new RList(new RNode(new int[]{0,0,0},new int[]{width*height,0,0}));
		System.out.print(l4); 
		l4=new RList(l1);
		System.out.print(l4); 
		
	}
}