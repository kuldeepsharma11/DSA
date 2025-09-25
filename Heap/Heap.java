public class Heap
{
    static int[] heap;
    static int size;
    Heap()
    {
        heap = new int[1000];
        size = 0;
    }
    
    int left(int i)
    {
        return 2*i + 1;
    }
    int right(int i)
    {
        return 2*i + 2;
    }
    int par(int i)
    {
        return (i-1)/2;
    }
    void add(int x)
    {
        heap[size] = x;
        size++;
        heapyfi(size-1);
    }
    void heapyfi(int n)
    {
        if(n==0) return;
        int par1 = par(n);
        if(heap[n] < heap[par1])
        {
            int temp = heap[n];
            heap[n] = heap[par1];
            heap[par1] = temp;
        }
        heapyfi(par1);
    }

    static void visualise()
    {
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print(heap[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Heap heap = new Heap();
        heap.add(1);
        heap.add(4);
        heap.add(7);
        heap.add(3);
        heap.add(100);
        heap.add(9);
        heap.add(5);
        heap.add(22);
        heap.add(11);
        heap.add(6);
        heap.add(8);
        visualise();

    }
} 
