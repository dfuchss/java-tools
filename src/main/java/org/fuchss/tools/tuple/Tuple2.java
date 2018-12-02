package org.fuchss.tools.tuple;

import java.io.Serializable;

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
public class Tuple2<A, B> implements Serializable {

	private static final long serialVersionUID = 8620745419750320286L;
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
