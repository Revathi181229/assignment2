import java.util.Arrays;
class cumu
{
   public static void main(String args[ ])
   {
     
      int arr[ ]={12,34,23,1,8};
      int[] prefixSum = new int[arr.length];
      prefixSum[0] = arr[0];
      for(int i=1;i<arr.length;i++)
      {
         prefixSum[i] = prefixSum[i - 1] + arr[i];
         
      }
      System.out.println(Arrays.toString(prefixSum));

   }
}