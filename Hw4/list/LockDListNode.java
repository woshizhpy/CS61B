// definition of LockDListNode
package list;
public class LockDListNode extends DListNode {
	public boolean Lstatus;


	public LockDListNode(Object i, DListNode p, DListNode n)
	{
		super(i,p,n);
	}
	public void SetLock()
	{
		Lstatus=true;
	}
	public boolean isLocked()
	{
		if(Lstatus==true)
		{
			return true;
		}
		return false;
	}
}