package SwaraliPractice;

public class Code_23_BubbleSort {
    public static void main(String[] args) {
        int n=5;
        int [] arr={5,4,1,2,3};

        // n-1 iterations
        // n-1-i comparisons for each iteration

        int count=0;
        for(int i=0; i<=n-2; i++){   // n-2+1 => n-1 iterations
            for(int j=0; j<n-1-i; j++){   // n-1-i-1 +1 => n-1-i comparisons

                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;

                    count=1;
                }

            }
            if(count==0)  // if the array is already sorted
                break;

        }

        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");

    }
}



