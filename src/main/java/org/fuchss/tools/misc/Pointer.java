package org.fuchss.tools.misc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This class represents a simple pointer to an object.
 *
 * @author Dominik Fuchss
 *
 * @param <P>
 *            the object type
 */
@NoArgsConstructor
@AllArgsConstructor
public final class Pointer<P> {
	/**
	 * Access or Set the pointer's data.
	 *
	 * @param data the new data
	 * @return the current data
	 */
	@Getter
	@Setter
	private P data;

	@Override
	public int hashCode() {
		return this.data == null ? 0 : this.data.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		return this.data == ((Pointer<?>) obj).data;
	}

}
