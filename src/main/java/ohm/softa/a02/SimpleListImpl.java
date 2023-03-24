package ohm.softa.a02;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList, Iterable  {


	@Override
	public void add(Object o) {
		Element current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = new Element();
		current.next.item = o;
	}

	@Override
	public int size() {
		int size = 0;
		Element current = head;
		while(current.next != null){
			current = current.next;
			size++;
		}
		return size;
	}

	@Override
	public SimpleList filter(SimpleFilter filter) {
		
	}

	class Iterator implements java.util.Iterator{

		@Override
		public boolean hasNext() {
			Object current = next();
			if(current != null){
				return true;
			}
			else {
				return false;
			}
		}

		@Override
		public Object next() {
			if(head.next == null){
				return null;
			}
			else{
				return head.next;
			}
		}
		
	}

	private static class Element{
		Object item;
		Element next;
	}

	Element head;

	@Override
	public java.util.Iterator iterator() {
		return new java.util.Iterator<T>() {
			
		};
	}
}
