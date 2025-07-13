public class GcdLcm
{
    public static void main(String[] args)
    {
        int gcd = gcd(10, 30);
        System.out.println(gcd);
        int lcm = lcm(10,30,gcd);
        System.out.println(lcm);
    }

    private static int gcd(int n1,int n2)      //运算条件是n1>n2
    {
        return n2 == 0 ? n1 : gcd(n2,n1%n2);
    }

    private static int lcm(int n1, int n2, int gcd)
    {
        return (n1 * n2) / gcd;
    }


}
