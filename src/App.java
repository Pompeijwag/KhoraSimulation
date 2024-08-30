import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int total = 0;
        for(int q = 0; q < 1000; q++)
        {
            int blueprint = 0;
            int chassis = 0;
            int neuro = 0;
            int system = 0;
            int attempts = 0;
            Random rand = new Random();
            while(blueprint == 0 || chassis == 0 || neuro == 0 || system == 0)
            {
                System.out.println("New run");
                for(int i = 0; i < 1; i++)
                {
                    if(rand.nextInt(10000) < 833)
                    {
                        chassis++;
                        System.out.println("Recieved chassis.");
                    }
                }
                if(rand.nextInt(10000) < 909)
                {
                    neuro++;
                    System.out.println("Recieved neuro.");
                }
                int cRotation = rand.nextInt(10000);
                if(cRotation < 1128)
                {
                    system++;
                    System.out.println("Recieved system.");
                }
                else if(cRotation < 1128 * 2)
                {
                    blueprint++;
                    System.out.println("Recieved blueprint.");
                }
                attempts++;
            }
            System.out.println("A full set has been collected");
            System.out.println("It took " + attempts  + " attempts in total, a minimum of " + attempts * 12 + " minutes." );
            System.out.println("Collected neuros: " + neuro);
            System.out.println("Collected chassis: " + chassis);
            System.out.println("Collected system: " + system);
            System.out.println("Collected blueprint: " + blueprint);
            total = total + attempts;
        }
        System.out.println("it takes on average " + total / 1000.0 + " attempts to get khora. Which is around " + (total / 1000.0 * 12 ) / 60 + " hours atleast.");
    }
}
