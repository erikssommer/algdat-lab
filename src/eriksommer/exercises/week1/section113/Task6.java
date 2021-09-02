package eriksommer.exercises.week1.section113;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(fak(3));
    }

    public static long fak(int a){
        if(a <= 1) {
            return 1;
        }

        return a * fak(a-1);
    }
}
