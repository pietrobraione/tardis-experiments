package symbols.stringprefix;

/**
 * This example demonstrate the ability of TARDIS with
 * reasoning on path conditions with clauses on String
 * methods, specifically on {@link String#startsWith(String)}.
 * 
 * @author Pietro Braione
 *
 */
public class SymbolsStringPrefix {

    public int entryPoint(String s) {
        final StringBuilder b = new StringBuilder("abcdefgh");
        if (s.length() > 2) {
            //let's rule out trivial prefixes
            if (b.reverse().toString().startsWith(s)) { //reversed to garble EvoSuite's constant analysis
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }
    //this should generate three tests, one that returns 1, one that returns 0
    //and one that returns -1. The overall coverage should be 5 (the four branches 
    //plus the entry point of the method). It should also generate (but not emit 
    //in the output) one test that raises NPE for s == null. 
}