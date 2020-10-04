import java.util.Scanner;

public class Knapsack {
    private static double getOptimalValue(int n, double capacity, double[] values, double[] weights) {
        double totalValue = 0;
        double ratio[] = new double[n];
        for(int i=0;i<n;i++)
        {
            ratio[i]=(double)(values[i]/weights[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ratio[j]>ratio[i])
                {
                    double temp= ratio[i];
                    ratio[i]=ratio[j];
                    ratio[j]=temp;

                    double temp1=values[i];
                    values[i]=values[j];
                    values[j]=temp1;

                    double temp2=weights[i];
                    weights[i]=weights[j];
                    weights[j]=temp2;
                }
            }
        }

        for(int i=0;i<n;i++)
            if (capacity - weights[i] >= 0) {
                totalValue = totalValue + values[i];
                capacity = capacity - weights[i];
            }
        else {
                double fraction = (double) capacity / (double) weights[i];
                totalValue = totalValue + (double) values[i] * fraction;
                capacity = capacity - weights[i] * fraction;

            }

        return totalValue;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double capacity = scanner.nextInt();
        double[] values = new double[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(n, capacity, values, weights));
    }
}
