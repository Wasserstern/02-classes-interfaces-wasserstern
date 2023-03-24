package ohm.softa.a02.tests;

import ohm.softa.a02.SimpleFilter;
import ohm.softa.a02.SimpleListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListTest {

	private SimpleListImpl testList;

	@BeforeEach
	void setup(){
		testList = new SimpleListImpl();
		Object o = new Object();
		Object p = new Object();
		Object q = new Object();
		Object r = new Object();
		Object s = new Object();
		testList.add(o);
		testList.add(p);
		testList.add(q);
		testList.add(r);
		testList.add(s);
	}

	@Test
	void testAddElements(){
		int counter = 0;
		for(Object o : testList){
			counter++;
		}
		assertEquals(5, counter);
	}

	@Test
	void testSize(){
		assertEquals(5, testList.size());
	}

	

	@Test
	void testFilterLambda(){
		SimpleListImpl result = (SimpleListImpl) testList.filter(o -> ((int)o) % 2 == 0);
		for(Object o : result){
			int i = (int)o;
			assertTrue(i % 2 == 0);
		}
	}
}
