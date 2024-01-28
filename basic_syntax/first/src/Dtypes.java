public class Dtypes {
    byte position;
    short total;
    int school_fees;
    long estimated_net_worth;
    char myRank;
    boolean isClear;
    float average;
    double average_double;

    Dtypes(byte position){
        this.position = position;
        this.total = (short) ((short) position + 127);
        this.school_fees = (int) total + 32767;
        this.myRank = 76;
    }

    public char getMyRank(){
        return this.myRank;
    }

    public static void main(String[] args) {
        Dtypes types = new Dtypes((byte) 123);
        System.out.println(types.getMyRank());
    }
}
