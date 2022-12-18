//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

---approach1---
    1.sort array   Tc-O(N log(N))  Sc-O(1)
    2.count 0,1,2  Tc-O(2N)
    3.Dutch national flag algorithm  Tc-O(N) Sc-O(1)


class Solution
{
    static void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
    public static void sort012(int a[], int n)
    {
        int low=0,mid=0,high=n-1;
        while(mid<=high)
        {
            int temp;
            if(a[mid]==0)
            {
                temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                mid++;
                low++;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
            else
            {
                temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
        
    }
}
