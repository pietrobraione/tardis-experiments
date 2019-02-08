package symbols.constants;

import java.util.LinkedList;

/**
 * This example demonstrates the ability of TARDIS with
 * handling path condition clauses of the kind <f({R1}, Object[N])>, 
 * where Object[N] refers a constant object (currently only
 * String literals).
 * 
 * @author Pietro Braione
 */
public class SymbolsConstants {
	/**
	 * This is easy.
	 */
	public String entryPoint(String s, double b1) {
		if (b1 >= 0.0) {
			return "foo"; //this is reachable with a b1 greater or equal to zero (easy)
		}
		if (s.equals("yeah")) {
			return "baz"; //this is reachable with s equals to "yeah" (also easy when you are able to reason on constants and equals)
		}
		return null;
	}
	//expected result: four tests, one that returns "foo", one that returns "baz", 
	//one that returns null, and one raising NPE (because s == null). The overall
	//coverage should be 4 branches.

	/**
	 * This is less easy.
	 */
	public String entryPoint(LinkedList<String> l, double b1) {
		if (b1 >= 0.0) {
			return "foo"; //this is reachable with a b1 greater or equal to zero (easy)
		}
		if (l.toString().equals("[yeah]")) {
			return "baz"; //this is reachable with a l containing just one element "yeah" (less easy)
		}
		return null;
	}
	//expected result: four tests, one that returns "foo", one that returns "baz", 
	//one that returns null, and one raising NPE (because l == null). The overall
	//coverage should be 4 branches.
}