import java.util.ArrayList;
public class Searchin2dArray {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
       int M=mat.size();
       int N=mat.get(0).size();
       int flag=0;
       for(int i=0;i<M;i++)
       {
           for(int j=0;j<N;j++)
           {
               if(mat.get(i).get(j)== target)
               {
                  flag=1;
                  break;
               }
           }
       }
       if(flag==1)
       {
           return true;
       }
       else
       return false;
    }
}
