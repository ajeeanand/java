package blue.discussion;

public class Reverse {

    int n, m;
    int ans, count;

    public Reverse(int n) {
        this.n = n;
        System.out.println(n);
    }

    public void findingReverse() {

        m = n;
        while (m > 0) {
            count++;
            m = m / 10;
        }
        for (int i = 0; i < count; i++) {
            ans = n % 10;
            System.out.print(ans);
            n = n / 10;
        }
    }

    public static void main(String[] args) {
        Reverse p = new Reverse(0000);
        p.findingReverse();

    }
}
