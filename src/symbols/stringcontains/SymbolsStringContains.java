package symbols.stringcontains;

/**
 * This example demonstrate the ability of TARDIS with
 * reasoning on path conditions with clauses on String
 * methods, specifically on {@link String#contains(CharSequence)}.
 * 
 * @author Pietro Braione
 *
 */
public class SymbolsStringContains {

    public int entryPoint(String s) {
        final StringBuilder b = new StringBuilder("?yad s'remmus a ot eeht erapmoc I llahS");
        if (s.length() > 2) {
            //let's rule out trivial prefixes
            final String text = b.reverse().toString(); //reversed to garble EvoSuite's constant analysis
            if (s.charAt(0) != 'S' && s.charAt(s.length() - 1) != '?' && text.contains(s)) {
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