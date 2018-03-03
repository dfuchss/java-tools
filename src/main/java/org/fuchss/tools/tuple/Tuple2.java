package org.fuchss.tools.tuple;

import lombok.Value;

/**
 * A simple tuple of two values
 *
 * @author Dominik Fuchss
 *
 * @param <A>
 *            the first type
 * @param <B>
 *            the second type
 */
@Value(staticConstructor = "of")
public class Tuple2<A, B> {
	/**
	 * The first value.
	 * 
	 * @return the first value
	 */
	A first;
	/**
	 * The second value.
	 * 
	 * @return the second value
	 */
	B second;
}
