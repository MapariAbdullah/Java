public class fact
{
    public static void main(String[] args)
    {
        int mul = 1;
        int n = Integer.parseInt(args[0]);
        for(int i = 1; i <= n; i++)
        {
            mul = mul * i;
        }
        System.out.println("Factorial of "+n+" :"+mul);
    }
}