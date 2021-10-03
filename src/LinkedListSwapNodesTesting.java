import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListSwapNodesTesting {

	@Test
	public void testSize() {
		
		LinkedList list = new LinkedList();
		list.head=null;
		LinkedList.Node N = null;
		list.size=0;
		assertEquals(0,list.size);
	}
	
	@Test
	public void testpushFront1() {
		
		LinkedList list = new LinkedList();
		LinkedList.Node N;
		list.size=0;
		if(list.head!=null)
			list.pushFront(1);
		
		assertEquals(0,list.size);
		
	}
	
	
	@Test
	public void testpushFront2() {
		
		LinkedList list = new LinkedList();
		
		list.size=0;
		list.pushFront(2);
		list.pushFront(3);
	
		assertEquals(2,list.size);
		
	}
	
	@Test
	public void testpushFront3() {
		
		LinkedList list = new LinkedList();
		list.size=0;
		
		for(int i=0;i<4;i++) {
			list.pushFront(i);
		}
		
		assertEquals(4,list.size);
		
	}
	
	@Test
	public void testpushBack1() {
		
		LinkedList list = new LinkedList();
		assertEquals(0,list.size);
		
	}
	
	
	@Test
	public void testpushBack2() {
		
		LinkedList list = new LinkedList();
		list.size=0;
		list.pushBack(1);
		assertEquals(1,list.size);
		
	}
	
	
	@Test
	public void testpushBack3() {
		
		LinkedList list = new LinkedList();
		list.size=0;
		
		for(int i=0;i<=40;i++) {
			list.pushBack(i);
		}
		
		assertEquals(41,list.size);
		
	}
	

	@Test
	public void testpushBack4() {
		
		LinkedList list = new LinkedList();
		list.size=0;
		list.pushBack(41);
		list.pushBack(42);
		assertEquals(2,list.size);
		
	}
	
	@Test
	public void testSwap1() {
		
		LinkedList list= new LinkedList();
		list.head=null;
		list.size=0;
		list.pushFront(1);
		list.head.key=5;
		list.pushBack(2);
		list.head.next.key=7;
		list.swap();
		int res=list.head.next.key;
		assertEquals(5, res);
	
	}
	
	@Test
	public void testSwap2() {
		
		LinkedList list= new LinkedList();
		list.head=null;
		list.size=0;
		list.pushFront(1);
		list.head.key=5;
		list.pushBack(2);
		list.head.next.key=6;
		list.pushBack(3);
		list.head.next.next.key=7;
		list.swap();
		int res=list.head.next.next.key;
		assertEquals(5, res);
	
	}
	
	@Test
	public void testSwap3() {
		
		LinkedList list= new LinkedList();
		list.head=null;
		list.size=0;
		list.pushFront(1);
		list.head.key=5;
		list.pushBack(2);
		list.head.next.key=6;
		list.pushBack(3);
		list.head.next.next.key=7;
		list.pushBack(4);
		list.head.next.next.next.key=10;
		list.swap();
		int res=list.head.next.next.next.key;
		assertEquals(5, res);
	
	}
	
}
