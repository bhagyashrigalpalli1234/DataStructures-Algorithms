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


1.reverse string
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        
        
        String nstr="";
        char ch;
        
     
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      return nstr;
    }
    
}

2.find max and min and return sum of them

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        int min=A[0],max=A[0],sum=0;
        for(int i=0;i<N;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
            if(A[i]<min)
            {
                min=A[i];
            }
            
            
        }
        
        sum=min+max;
        return sum;
    }
}

    
