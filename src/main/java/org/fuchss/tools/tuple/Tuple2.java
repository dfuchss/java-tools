package org.fuchss.tools.tuple;

import java.io.Serializable;

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
public final class Tuple2<A, B> implements Serializable {
	private static final long serialVersionUID = 8620745419750320286L;
	/**
	 * The first value.
	 */
	private final A first;
	/**
	 * The second value.
	 */
	private final B second;

	private Tuple2(final A first, final B second) {
		this.first = first;
		this.second = second;
	}

	public static <A, B> Tuple2<A, B> of(final A first, final B second) {
		return new Tuple2<>(first, second);
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

	@Override
	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Tuple2)) {
			return false;
		}
		final Tuple2<?, ?> other = (Tuple2<?, ?>) o;
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
		return result;
	}

	@Override
	public String toString() {
		return "Tuple2(first=" + this.getFirst() + ", second=" + this.getSecond() + ")";
	}
}
