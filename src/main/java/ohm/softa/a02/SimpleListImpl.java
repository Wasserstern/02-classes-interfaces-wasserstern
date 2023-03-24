package ohm.softa.a02;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList {


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

	}

	@Override
	public SimpleList filter(SimpleFilter filter) {
		
	}

	class SimpleIteratorImpl implements Iterator{

		@Override
		public boolean hasNext() {
			
		}

		@Override
		public Object next() {
			
		}

	}

	private static class Element{
		Object item;
		Element next;
	}

	Element head;
}
