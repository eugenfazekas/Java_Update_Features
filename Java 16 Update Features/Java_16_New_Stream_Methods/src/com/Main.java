package com;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		// ArrayList:
		Stream.of("foo", "bar", "baz").collect(Collectors.toList());

		// ImmutableCollections$ListN:
		Stream.of("foo", "bar", "baz").collect(Collectors.toUnmodifiableList());

		// LinkedList:
		Stream.of("foo", "bar", "baz").collect(Collectors.toCollection(LinkedList::new));
		
		// ImmutableCollections$ListN:
		Stream.of("foo", "bar", "baz").toList();
		
		Stream<List<Integer>> stream =
			    Stream.of(
			        List.of(1, 2, 3),
			        List.of(4, 5, 6),
			        List.of(7, 8, 9));

			List<Integer> list = stream.flatMap(List::stream).toList();

	}

}
