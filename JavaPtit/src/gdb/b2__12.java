
package gdb;

interface Sortable{
    void sort(int []a);
}
class BubbleSort implements Sortable{
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = a.length-1; j > i; j--) {
                if(a[j]<a[j-1]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
    }
}
class SelectionSort implements Sortable{
    @Override
    public void sort(int[] a) {
        int min;
        for (int i = 0; i < a.length-1; i++) {
            min=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<min){
                    min=j;
                }
            }
            int tmp=a[min];
            a[min]=a[i];
            a[i]=tmp;
        }
    }
}

