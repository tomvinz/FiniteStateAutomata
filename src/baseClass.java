public class baseClass {
    public static void main(String[] args) {
        System.out.println("Hello World, I am back.");
// The single checks for the example
        String grammar1 = "State\ta\tb\t!\n0\t5\t1\t5\n1\t2\t5\t5\n2\t3\t5\t5\n3\t3\t5\t4\n4:\t5\t5\t5\n5\t5\t5\t5";
        //String grammar1 = "State\ta\tb\t!\n0\t5\t1\t5\n1\t2\t5\t5\n2\t3\t5\t5\n3\t3\t5\t4\n4:\t5\t5\t5\n5\t5\t5\t5";
        //State	a	b	!
        automata automata = new automata(grammar1);
        //automata.acceptsString("baaaaaaa!");
        //checkAutomata(grammar1, "baa!", true);
        //checkAutomata(grammar1, "baaa!", true);
        //checkAutomata(grammar1, "baaa!!!", false);
        //checkAutomata(grammar1, "!aab", false);
        //checkAutomata(grammar1, "xyz", false);

     extendedAutomata ea = new extendedAutomata(grammar1);
     ea.findMatches("baa! He said baaaa! babaa!! baaaa!");
    }
}
