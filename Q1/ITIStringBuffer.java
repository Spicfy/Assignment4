public class ITIStringBuffer {
    private SinglyLinkedList<String> stringy;

    public ITIStringBuffer() {
         stringy = new SinglyLinkedList<String>();
    }

    public ITIStringBuffer(String  firstString){
        stringy = new SinglyLinkedList<>();
        stringy.add(firstString);
    }

    public void append(String nextString){
        stringy.add(nextString);
    }

    public String toString(){
        Iterator <String> it = stringy.iterator();
        String res = "";
        while(it.hasNext()){
            res += it.next();
        }
        return res;
    }
    public static void main(String[] args) {
        ITIStringBuffer sb = new ITIStringBuffer();
        sb.append("marco");
        sb.append(" polo");
        sb.append("!");
        System.out.println(sb.toString());
    }

}
