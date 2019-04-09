package org.fuchss.tools.tuple;

import java.io.Serializable;

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
public final class Tuple4<A, B, C, D> implements Serializable {
	private static final long serialVersionUID = -5255702882082756985L;
	/**
	 * The first value.
	 */
	private final A first;
	/**
	 * The second value.
	 */
	private final B second;
	/**
	 * The third value.
	 */
	private final C third;
	/**
	 * The fourth value.
	 */
	private final D fourth;

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

	private Tuple4(final A first, final B second, final C third, final D fourth) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
	}

	public static <A, B, C, D> Tuple4<A, B, C, D> of(final A first, final B second, final C third, final D fourth) {
		return new Tuple4<>(first, second, third, fourth);
	}

	/**
	 * The first value.
	 *
	 * @return the first value
	 */

	public A getFirst() {
		return this.first;
	}

	/**
	 * The second value.
	 *
	 * @return the second value
	 */
	public B getSecond() {
		return this.second;
	}

	/**
	 * The third value.
	 *
	 * @return the third value
	 */
	public C getThird() {
		return this.third;
	}

	/**
	 * The fourth value.
	 *
	 * @return the fourth value
	 */
	public D getFourth() {
		return this.fourth;
	}

	@Override
	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Tuple4)) {
			return false;
		}
		final Tuple4<?, ?, ?, ?> other = (Tuple4<?, ?, ?, ?>) o;
		final Object this$first = this.getFirst();
		final Object other$first = other.getFirst();
		if (this$first == null ? other$first != null : !this$first.equals(other$first)) {
			return false;
		}
		final Object this$second = this.getSecond();
		final Object other$second = other.getSecond();
		if (this$second == null ? other$second != null : !this$second.equals(other$second)) {
			return false;
		}
		final Object this$third = this.getThird();
		final Object other$third = other.getThird();
		if (this$third == null ? other$third != null : !this$third.equals(other$third)) {
			return false;
		}
		final Object this$fourth = this.getFourth();
		final Object other$fourth = other.getFourth();
		if (this$fourth == null ? other$fourth != null : !this$fourth.equals(other$fourth)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $first = this.getFirst();
		result = result * PRIME + ($first == null ? 43 : $first.hashCode());
		final Object $second = this.getSecond();
		result = result * PRIME + ($second == null ? 43 : $second.hashCode());
		final Object $third = this.getThird();
		result = result * PRIME + ($third == null ? 43 : $third.hashCode());
		final Object $fourth = this.getFourth();
		result = result * PRIME + ($fourth == null ? 43 : $fourth.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Tuple4(first=" + this.getFirst() + ", second=" + this.getSecond() + ", third=" + this.getThird() + ", fourth=" + this.getFourth()
				+ ")";
	}
}
