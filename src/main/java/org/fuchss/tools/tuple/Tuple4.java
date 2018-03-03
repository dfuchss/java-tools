package org.fuchss.tools.tuple;

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
 * @param <D>
 *            the fourth type
 */
@Value(staticConstructor = "of")
public class Tuple4<A, B, C, D> {
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
	 * The fourth value.
	 *
	 * @return the fourth value
	 */
	D fourth;

	/**
	 * Create a {@link Tuple4} by {@link Tuple3}
	 *
	 * @param <W>
	 *            the first type
	 * @param <X>
	 *            the second type
	 * @param <Y>
	 *            the third type
	 * @param <Z>
	 *            the fourth type
	 *
	 * @param wxy
	 *            the first three values
	 * @param z
	 *            the fourth value
	 * @return the tuple
	 */
	public static <W, X, Y, Z> Tuple4<W, X, Y, Z> of(Tuple3<W, X, Y> wxy, Z z) {
		return Tuple4.of(wxy.getFirst(), wxy.getSecond(), wxy.getThird(), z);
	}
}
