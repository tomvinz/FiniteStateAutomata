import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class extendedAutomata extends automata {

    // YOUR CODE HERE

    public extendedAutomata(String grammarDef) {
        super(grammarDef);
    }

    /**
     * Searches for all matchings of the grammar from the given text.
     */



    public String[] findMatches(String text) {
        //declaration and initialization of variables
        int count = 0;
        List<String> matchlist = new ArrayList<String>();
       // List<String>words = new ArrayList<String>();
        int index1 = 0;

        //split the string with " "-blank space as delimiter(logically it does make any sense to consider
        //blank space as input).
        String[] newrow = text.split(" ");
        System.out.println(newrow[1]);
        while (index1 <newrow.length) {

            int front=0;
            int back=newrow[index1].length();
            //to check if text is a match
            while(front<back) {
                if (acceptsString(newrow[index1].substring(front, back))) {

                    matchlist.add(newrow[index1].substring(front, back));
                    count++;
                    front=front+newrow[index1].substring(front,back).length();
                    back=newrow[index1].length();

                } else {
                    //to chop off the last element and check if the string would be accepted
                    //System.out.println(newrow[index1].substring(front, back));
                    back--;
                    //increment front value when the entire text has been checked from back.
                    if(front==back){
                        front++;
                        back=newrow[index1].length();
                    }
                }

            }
            index1++;
        }
        //add matching string to string matches and return it.
        String[] matches = new String[matchlist.size()];
        matchlist.toArray(matches);
        for(int i=0;i<matches.length;i++){
            System.out.println(matches[i]);
        }
        return matches;
    }
}


