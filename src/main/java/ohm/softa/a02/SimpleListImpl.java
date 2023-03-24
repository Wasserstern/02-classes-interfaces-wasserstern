package ohm.softa.a02;

import java.util.Iterator;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList, Iterable {

	Element head;
	@Override
	public void add(Object o) {
		if(this.head == null){
			this.head = new Element();
			head.item = o;
		}
		else{
			Element e = this.head;
			while(e.next != null){
				e = e.next;
			}
			Element newElement = new Element();
			newElement.item = o;
			e.next = newElement;
		}
	}

	@Override
	public int size() {
		if(head == null){
			return 0;
		}
		else{
			int size = 0;
			Element e = this.head;
			while(e != null){
				e = e.next;
				size++;
			}
			return size;
		}
	}


	class SimpleIteratorImpl implements Iterator{

		Element current;

		public SimpleIteratorImpl(SimpleListImpl list){
			current = list.head;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Object next() {
			current = current.next;
			return current;
		}

	}

	private static class Element{
		Object item;
		Element next;
	}

	

	@Override
	public Iterator iterator() {
		return new SimpleIteratorImpl(this);
	}

	@Override
	public SimpleList filter(SimpleFilter filter) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'filter'");
	}
}
