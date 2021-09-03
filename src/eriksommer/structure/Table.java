package eriksommer.structure;

public class Table {
    private Table(){}

    public static long fak(int a){
        if(a <= 1) {
            return 1;
        }

        return a * fak(a-1);
    }
}
