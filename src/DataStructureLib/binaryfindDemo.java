package DataStructureLib;

/**
 * @author weitao
 *   二分查找
 */
public class binaryfindDemo
{

        public static void main(String[] args)
        {
                // TODO Auto-generated method stub
                int[] data={1,2,4,6,9,10};
                int key=5;
                int index=find(data,0,5,11);
                System.out.println(Integer.toString(index));

        }
        
        public static int find(int[] data,int left,int right,int key)
        {
                if(key>data[right] || key<data[left])
                        return -1;
                if(left>right)
                {
                        return -1;
                }
                else {
                        if(left==right)
                        {
                                if(data[left]==key)
                                {
                                        return left;
                                }
                                else {
                                        return -1;
                                }
                        }
                        else {
                                int media=(left+right)/2;
                                if(data[media]==key)
                                {
                                        return media;
                                }
                                else {
                                        if(data[media]>key)
                                        {
                                                return find(data, left, media-1, key);
                                        }
                                        else {
                                                return find(data, media+1, right, key);
                                        }
                                }
                        }
                }
        }

}
