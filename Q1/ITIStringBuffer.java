
public class ITIStringBuffer {

    private SinglyLinkedList<Character> list;
    //private char[] x;
    private int num=0;
    

    public ITIStringBuffer() {
        //throw new UnsupportedOperationException( "replace with your implementation" );
        list = new SinglyLinkedList<Character>();
    }

    public ITIStringBuffer(String  firstString){
        //throw new UnsupportedOperationException( "replace with your implementation" );
        list = new SinglyLinkedList<Character>();
        char[] c = firstString.toCharArray();
        for (char d : c) {
            list.add(d);
            num++;
            
        }
        
    }

    public void append(String nextString){
        //throw new UnsupportedOperationException( "replace with your implementation" );
        char[] c = nextString.toCharArray();
        for (char d : c) {
            list.add(d);
            num++;
            
        }
        

    }

    public String toString(){
        //throw new UnsupportedOperationException( "replace with your implementation" );
    char [] c = new char[num];
    int i = 0;
    for (char x :list) {
        c[i] = x;
        i++;
        
    }
    return new String(c);
    }

}
