package symbols.string;

public class StringDemo {

    public static class C1 {
        private final int n;
        private final char c;
        
        public C1(int n, char c) {
            this.n = n;
            this.c = c;
        }
        
        @Override
        public String toString() {
        	return "C1(" + this.n +", '" + this.c + "')";
            /*String s = "";
            for (int i = 0; i < n; i++) {
                s += c;
            }
            return s;*/
        }
    }

    public static class C2 {
        private final String s;
        private final String c;
        
        public C2(String s, String c) {
            this.s = s;
            this.c = c;
        }
        
        @Override
        public String toString() {
        	return "C2(\"" + this.s +"\", \"" + this.c + "\")";
            //return c + s;
        }
    }

    public int entryPoint(C1 o1, C2 o2) {
        final String s1 = o1.toString();
        final String s2 = o2.toString();
        if (s1.equals(s2)) {
            return 1;
        } else {
            return 0;
        }
    }
}