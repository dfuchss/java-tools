package org.fuchss.tools.misc;

import org.fuchss.tools.lambda.VoidFunction;

/**
 * Represents a void function which can executed once.
 *
 * @author Dominik Fuchss
 *
 */
public final class Once implements VoidFunction {
	private final VoidFunction func;
	private boolean run = false;

	/**
	 * Create the function by {@link VoidFunction}.
	 *
	 * @param func
	 *            the void function
	 */
	public Once(VoidFunction func) {
		this.func = func;
	}

	@Override
	public void execute() {
		if (this.run) {
			return;
		}
		this.run = true;
		this.func.execute();
	}

	/**
	 * Reset. After that execution is possible. Even if the function has been
	 * executed in the past.
	 */
	public void reset() {
		this.run = false;
	}
}