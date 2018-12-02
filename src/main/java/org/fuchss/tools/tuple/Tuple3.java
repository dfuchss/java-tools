package org.fuchss.tools.tuple;

import java.io.Serializable;

import lombok.Value;

/**
 * A simple tuple of three values
 *
 * @author Dominik Fuchss
 *
 * @param <A>
 *            the first type
 * @param <B>
 *            the second type
 * @param <C>
 *            the third type
 */
@Value(staticConstructor = "of")
public class Tuple3<A, B, C> implements Serializable {

	private static final long serialVersionUID = 3512228977823082170L;
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
	/**
	 * The third value.
	 *
	 * @return the third value
	 */
	C third;

	/**
	 * Create a {@link Tuple3} by {@link Tuple2}
	 *
	 * @param <X>
	 *            the first type
	 * @param <Y>
	 *            the second type
	 * @param <Z>
	 *            the third type
	 *
	 * @param wxy
	 *            the first two values
	 * @param z
	 *            the third value
	 * @return the tuple
	 */
	static <X, Y, Z> Tuple3<X, Y, Z> of(Tuple2<X, Y> xy, Z z) {
		return Tuple3.of(xy.getFirst(), xy.getSecond(), z);
	}
}
