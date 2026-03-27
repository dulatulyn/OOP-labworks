package lab2.problem3;

public class Problem3 {
    public static void main(String args[]){
        Time time1 = new Time(8, 20, 15);
        Time time2 = new Time(17, 20, 50);

        System.out.println(time1.toUniversal());

        time1.add(time2);

        System.out.println(time1.toUniversal());
        System.out.println(time2.toStandard());
    }
}
