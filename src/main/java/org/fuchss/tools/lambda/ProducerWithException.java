package org.fuchss.tools.lambda;

/**
 * Same as {@link Producer} but with {@link Exception}.
 *
 * @author Dominik Fuchss
 *
 */
public interface ProducerWithException<O> {
	O produce() throws Exception;
}
