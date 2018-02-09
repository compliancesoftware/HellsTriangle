package br.com.douglasfernandes.control.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.douglasfernandes.control.Tracker;
import br.com.douglasfernandes.control.TriangleBuilder;
import br.com.douglasfernandes.model.Triangle;

public class TrackerImplTest {

	@Test
	public void testSoma() {
		Integer[][] linhas = new Integer[][]{{6},{3,5},{9,7,1},{4,6,8,4}};
		
		TriangleBuilder builder = new TriangleBuilderImpl();
		Triangle triangle = builder.build(linhas);
		
		Tracker tracker = new TrackerImpl();
		
		assertEquals(26, tracker.soma(triangle));
	}

}
