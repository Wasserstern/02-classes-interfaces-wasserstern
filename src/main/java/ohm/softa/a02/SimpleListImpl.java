package ohm.softa.a02;

import java.util.Iterator;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList, Iterable {


	@Override
	public void add(Object o) {
		if(head == null){
			head.item = 0;
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
			int size = 1;
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
			if(current.next != null){
				return true;
			}
			else{
				return false;
			}
		}

		@Override
		public Object next() {
			return current.next;
		}

	}

	private static class Element{
		Object item;
		Element next;
	}

	Element head;

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
