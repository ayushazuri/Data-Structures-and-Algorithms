public class stackArray {
    int a[];
    int top;
    int size;
    stackArray(int size){
        a = new int[size];
        this.size = size;
        top = -1;
    }

    void add(int data){
        if(top == size)
            return;
        a[++top] = data;

    }

    int pop(){
        if(top == -1)
            return -1;
        int x = a[top];
        top--;
        return x;
    }

    int peak(){
        if(top == -1)
            return -1;
        return a[top];
    }


    public static void main(String[] args) {

    }
}
