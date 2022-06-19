import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice2 {
    public static void main(String[] args) {

        

        // float [] arr={12.0f,11.0f,30.0f,23.0f,20.0f};
        //   float sum=0;

        // for(float elem:arr)
        // {
        //   sum=sum+elem;
        // }
        // System.out.println();
        // System.out.println(sum);

        // for(float j=0.0f;j<=i;j++)
        // {
        //     n=n+arr[j];
        // }

        // float [] arr={12.0f,11.0f,30.0f,23.0f,20.0f};
        //   float sum=11.0f;
        //   boolean n=false;
        //   for(float e:arr)
        //   {
        //     if(sum==e)
        //     {
        //      n=true;
        //         break;
        //     }

        //   }
        
        //   if(n)
        //   {
        //       System.out.println("yes it's present");
              
        //   }
        //   else
        //   {
        //       System.out.println("it's not present");
              
        //   }

        // int [][] mat1={{1,2,3},
        //                {4,5,6}},
        //          mat2={{2,3,4},
        //                {5,6,7}},
        //           res={{0,0,0},
        //                {0,0,0}};

        //         //   for(int i=0;i<mat1.length;i++)
        //         //   {
        //         //       for(int j=0;j<mat1[i].length;j++)
        //         //       {
        //         //          res[i][j]=mat1[i][j]+mat2[i][j];
        //         //          System.out.format("res%d%d=%d",i,j,res[i][j]);
        //         //          System.out.println();
        //         //       }                      
        //         //   }
        //         //   for(int i=0;i<mat1.length;i++)
        //         //   {
        //         //       for(int j=0;j<mat1[i].length;j++)
        //         //       {
        //         //          res[i][j]=mat1[i][j]+mat2[i][j];
        //         //          System.out.print(res[i][j]+" ");
        //         //       }  
        //         //       System.out.println();                    
        //         //   }

        // int []arr={31,10,3,8,21,6,17};
        // int l=arr.length;
        // int n=Math.floorDiv(l,2);
        //  int temp;

        //  int k=l-1;
        //    Arrays.sort(arr);
        //  for(int i=k;i>=0;i--)
        //  {
        //      System.out.print(arr[i]+" ");
        //  }
        // for(int i=0;i<n;i++)
        // {
        //    temp=arr[i];
        //    arr[i]=arr[l-i-1];
        //    arr[l-i-1]=temp;
        // }
        // for(int e:arr)
        // {
        //     System.out.print(e+" ");
        // }

        // Integer [] arr = {31,10,3,8,21,6,17};
        //  Integer max=Collections.max(Arrays.asList(arr));
        //  Integer min=Collections.min(Arrays.asList(arr));

        // int max=arr[0];        
        //  int min=arr[0];
        // for(int e:arr)
        // {
        //    if(e>max)
        //    {
        //        max=e;
        //    }
        //  else if(e<min)
        // {
        //     min=e;
        // }
        // }
        // System.out.println("maximum value: "+max);
        // System.out.println("maximum value: "+min);
        // System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // int [] arr={1,2,21,4,5,6,7,8};
        // boolean bool=true;
        // // Arrays.sort(arr);
        // for(int i=0;i<arr.length-1;i++)
        // {
            
        //     if(arr[i]>arr[i+1])
        //     {
        //         bool=false;
        //         break;
        //     }
        // }
        // if(bool)
        // {
        //     System.out.println("ist sorted");
        // }
        // else
        // {
        //     System.out.println("its not sorted");
        // }
            ArrayList <ArrayList<String>> arr=new ArrayList<>();
           int i=0;
            while(i<=5){
                arr.add(new ArrayList<String>());
                int j=0;
                while(j<=5){
                arr.get(i).add(String.valueOf(j));
                j++;
                }
                i++;
            }
            System.out.println(arr);
    }
}
