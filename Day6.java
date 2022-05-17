import java.util.ArrayList;
import java.util.List;

class segmentedSeive
{
    static boolean[] arr1;
    static boolean[] arr;
    static List<Integer> l1 = new ArrayList<>();
    int l,h;
    static void Ss(int l,int h)
    {
        arr1 = new boolean[h-l+1];
        arr = new boolean[h-l+1];
        for (int i = 0; i < h-l+1; i++) {
            arr[i] = true;
            arr1[i] = true;
        }
        for (int i = 2; i*i<=h; i++) {
            if(arr[i])
            {
                l1.add(i);
                for (int j = i*i; j*j <= h; j+= i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 0; i*i<= h ; i++) {
            for (int j : l1) {
                if((l+i)%j==0)
                {
                    arr1[i] = false;
                    break;
                }
            }
        }
        for (int i = 0; i*i <=h ; i++) {
            if(arr1[i])
            {
                System.out.println(l+i);
            }
        }
    }
}
public class trys {
    public static void main(String[] args)
    {
        segmentedSeive.Ss(90,100);
    }
}
