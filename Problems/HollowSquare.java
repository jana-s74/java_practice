public class HollowSquare
{
    public static void main(String[] args)
    {
        int n = 5;

        // i = Row
        for(int i = 1; i <= n; i++)
        {
            // j = Column
            for(int j = 1; j <= n; j++)
            {
                // Print star on the border
                if(i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print("* ");
                }
                // Print space inside
                else
                {
                    System.out.print("  ");
                }
            }

            // Move to the next row
            System.out.println();
        }
    }
}