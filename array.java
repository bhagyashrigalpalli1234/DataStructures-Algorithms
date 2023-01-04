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


//rotate array --setps-->
arr     1 2 3 4 5 6 7
index   0 1 2 3 4 5 6
    suppose k=3
    1. reverse arr(0,n-1) //7 6 5 4 3 2 1
    2.reverse arr(0,k-1)  //5 6 7 4 3 2 1
    3.reverse arr(k,n-1)  //5 6 7 1 2 3 4




class Solution {
    
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    void reverse(int[] nums,int start,int end)
    {
        
        for(int i=start,j=end;i<j;i++,j--)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}
    
