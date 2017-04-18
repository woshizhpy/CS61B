// List Double-linked RNode

public class RNode
{
	protected int[] item; //0 for red; 1 for green;2 for blue
	protected int[] times;
	protected RNode prev;
	protected RNode next;
	
	public RNode()
	{
		int[] it=new int[]{0,0,0};
		int[] ti={0,0,0};
		item=it;
		times=ti;
		prev=null;
		next=null;
	}
	
	public RNode(int red, int green, int blue,int rtimes,int gtimes,int btimes)
	{
		int[] it={red, green,blue};
		int[] ti={rtimes,gtimes,btimes};
		item=it;
		times=ti;
	}
	
	public RNode(int[] it,int[] rt)
	{
		this(it[0],it[1],it[2],rt[0],rt[1],rt[2]);
	}
	
	public String toString()
	{
		if(this==null)
		{
			return "null";
		}
		String s=new String("|");
		/* for(int i=0;i<3;i++)
		{
			s+=item[i]+","+times[i]+"|";
		} */
		s+=item[0]+","+times[0]+"|";
		//s+=item[i]+","+times[i]+"|";
		//return this.prev.toString()+"<=="+s+"==>"+this.next.toString();
		//return this.prev+"<=="+s+"==>"+this.next;
		//return "<=="+s+"==>";
		return s;
	}
	/* public static void main(String arg[]) throws Exception
	{
		RNode node1=new RNode();
		RNode node2=new RNode((short)1,(short)2,(short)3,0,1,2);
		System.out.println(node1);
		System.out.println(node2);
		System.out.println(node2.prev);
		
		 
	} */
}