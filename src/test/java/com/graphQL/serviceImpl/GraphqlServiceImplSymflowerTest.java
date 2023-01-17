package com.graphQL.serviceImpl;

import com.graphQL.DTO.BookDTO;
import com.graphQL.entity.Book;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GraphqlServiceImplSymflowerTest {
	@Test
	public void create1() {
		GraphqlServiceImpl g = null; // TODO This is a fallback value due to incomplete analysis.
		Book book = null; // TODO This is a fallback value due to incomplete analysis.
		BookDTO expected = null; // TODO This is a fallback value due to incomplete analysis.
		BookDTO actual = g.create(book);

		assertEquals(expected, actual);
	}
}
