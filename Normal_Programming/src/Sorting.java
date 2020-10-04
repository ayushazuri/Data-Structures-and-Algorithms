public class Sorting {
    public static void main(String[] args) {
        int a[] = {2, 4, 1 , 3, 7, 8, 6};
        for(int i=1;i<a.length;i++){

            int t=a[i];
            int j=i-1;
            while(j>=0 && a[j] > t) {
                a[j + 1] = a[j];
                j--;
            }
            a[j+1] = t;
        }
        System.out.println("Insertion Sort: ");
        for(int i: a){
            System.out.print(i + " ");
        }
        int b[] = {2, 4, 1 , 3, 7, 8, 6};
        for(int i=0;i<b.length-1;i++){
            boolean check = true;
            for(int j=0;j<b.length-1-i;j++){
                if(b[j+1] < b[j]){
                    int t=b[j+1];
                    b[j+1]=b[j];
                    b[j] = t;

                    check =false;
                }
            }
            if(check)
                break;
        }
        System.out.println();
        System.out.println("Bubble Sort: ");
        for(int i: b){
            System.out.print(i + " ");
        }

        int c[] ={2, 4, 1 , 3, 7, 8, 6};
        for(int i=0;i<c.length;i++){
            int min=i;
            for(int j=i+1;j<c.length;j++){
                if(c[j] < c[min])
                    min = j;
            }
            if(min != i){
                int t=c[i];
                c[i]=c[min];
                c[min]=t;
            }
        }
        System.out.println();
        System.out.println("Selection Sort: ");
        for(int i: c){
            System.out.print(i + " ");
        }

    }
}
