import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class automata {
        List<String> list=new ArrayList<String>();
        String[] matrix=null;
        String[][] finalmatrix=null;
        String[] finalstate=null;
        String currentstate="0";

        // YOUR CODE HERE
        /**
         * Constructor taking the grammar String which defines the behavior of this
         * automata.
         */
        public automata(String grammarDef) {
            parseGrammar(grammarDef);
        }

        /**
         * An internal method that parses the given grammar String.
         */
    /**
     * An internal method that parses the given grammar String.
     */
    protected void parseGrammar(String grammarDef) {
            matrix=grammarDef.split("\n");
            System.out.println(matrix[0]);
            finalmatrix=new String[matrix.length][];
            for(int i=0;i< matrix.length;i++){
                for( int j=0; j<matrix[i].length();j++){
                    finalmatrix[i]=matrix[i].split("\t");

                }
            }

            // int final=1;
           for(int i=1;i< finalmatrix.length;i++){
               if(finalmatrix[i][0].contains(":")){
                   finalstate=finalmatrix[i][0].split(":");
               }
           }
        //System.out.println(finalstate[0]);

    }

    /**
     * This method should return true if the complete given text is accepted by the
     * FSA. If this is not the case, false should be returned.
     */
    public boolean acceptsString(String text) {
        boolean accepted = false;
        int index=0;
        int temp=0;
        int temp2=0;
        currentstate="0";
        System.out.println(text);

        while(index<=text.length()){
          if(index==text.length()) {
              for (int i = 0; i < finalstate.length; i++) {
                  if(currentstate.equals(finalstate[i]))
                      accepted = true;

                  break;
              }
          }
          else{

              for(int i=1;i< finalmatrix[0].length;i++){
                  if(Character.toString(text.charAt(index)).equals(finalmatrix[0][i])){
                      temp=i;
                  }
              }
              for(int i=1;i< finalmatrix.length;i++){
                  int z=0;
                  String[] endmatrix=finalmatrix[i][0].split(":");
                  if(currentstate.equals(endmatrix[z])){

                      temp2=i;
                  }
              }

                  currentstate=finalmatrix[temp2][temp];


              }
            index++;
          }





        return accepted;
    }
}