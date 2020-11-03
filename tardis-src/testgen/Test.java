package testgen;

public class Test{
	public void test0(){
		Testgen t = new Testgen();
		int i = -1;
		Testgen.Node n = new Testgen.Node();
		t.setAnotherNode(new Testgen.Node());
		t.anotherNode.setInfo(0);
		n.setInfo(0);
		t.getNode(n, i);	
	}
        public void test1(){
                Testgen t = new Testgen();
                int i = -1;
                Testgen.Node n = new Testgen.Node();
                t.setAnotherNode(new Testgen.Node());
                t.anotherNode.setInfo(1);
                n.setInfo(0);
                n.setNext(null);
                t.anotherNode.setNext(new Testgen.Node());
                t.getNode(n, i);        
        }
	public void test2(){
		Testgen t = new Testgen();
		int i = -1;
		t.setAnotherNode(null);
		t.getNode(null, i);	
	}

}