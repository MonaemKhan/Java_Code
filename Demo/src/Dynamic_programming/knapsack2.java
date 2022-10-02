package Dynamic_programming;


import java.util.Scanner;


public class knapsack2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Total Item Number : ");
        int n = scan.nextInt();
        
        int weight[] = new int[n];
        int profit[] = new int[n];
        int pis[] = new int[n];
        
        System.out.print("Enter Weights : ");
        for(int i = 0;i<n;i++){
            weight[i]=scan.nextInt();
        }
        
        System.out.print("Enter Profit : ");
        for(int i = 0;i<n;i++){
            profit[i]=scan.nextInt();
        }
        
        System.out.print("Enter Total Pieces : ");
        for(int i = 0;i<n;i++){
            pis[i]=scan.nextInt();
        }
        
        double per[]= new double[n];
        for(int i = 0;i<n;i++){
            per[i] = ((profit[i]*1.0)/weight[i]);
        }
        
        for(int i = 0;i<n;i++){
            for(int j = i ; j<n;j++){
                if(per[i]<per[j]){
                    int temp = weight[i];
                    weight[i] = weight[j];
                    weight[j] = temp;
                    
                    temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;
                    
                    double tem = per[i];
                    per[i] = per[j];
                    per[j] = tem;
                    
                    temp = pis[i];
                    pis[i] = pis[j];
                    pis[j] = temp;
                }
            }
        }
        
        System.out.print("Enter Knap-Sack Capacity : ");
        int capacity = scan.nextInt();
        double sum = 0.0;
        for(int i=  0 ; i<n ; i++){
            if(weight[i]<capacity){
                sum = sum + profit[i];
                capacity = (capacity - weight[i]);
            }else{
              double cap = 0.0;
              while(capacity>(weight[i]*1.0)/pis[i]){
                  cap = cap+(weight[i]*1.0)/pis[i];
                  capacity = capacity - (int) cap;
              }
              sum = sum + (cap*per[i]);
            }
        }
        System.out.println("Optimal Solution Is : "+sum);
    }
    
}
