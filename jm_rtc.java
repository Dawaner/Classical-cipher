package jiemi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jm_rtc {
    private List<List<Integer>> all_key = new ArrayList<>();
    //所有key
    public void rtc(String mm,int l_len) {
        all_key = new ArrayList<>();
        int len = mm.length();
        int h_len = len/l_len;
        if(len%l_len!=0)
            h_len++;
        int ly = h_len*l_len - len;
        System.out.println("行数："+h_len+"\n列数/密钥长度："+l_len+"\n字符总长："+len+"\n空余："+ly);
        int[] nums;
        nums = num_int_(l_len);
        dfs_all_key(new ArrayList<>(),nums,new boolean[nums.length]);
        for(int x=0;x<all_key.size();x++){
            int[] arr = all_key.get(x).stream().mapToInt(Integer::valueOf).toArray();
            String result = enter_str(arr,mm,h_len,l_len,ly);
            System.out.print("当前密钥："+Arrays.toString(arr)+" ");
            System.out.println(result);
        }
    }
    //指定key
    public void rtc_mykey(String mm,int[] nums){
        int len = mm.length();
        int h_len = len/nums.length;
        if(len% nums.length!=0)
            h_len++;
        int ly = h_len* nums.length - len;
        String result = enter_str(nums,mm,h_len,nums.length,ly);
        System.out.print("当前密钥："+Arrays.toString(nums)+" ");
        System.out.println(result);
    }
    public int[] num_int_(int num){
        int[] result = new int[num];
        for(int x=0;x<num;x++){
            result[x] = x+1;
        }
        return result;
    }
    //这里的三个参数分别为，一条路径，题目给的数组，是否走过某个参数
    public void dfs_all_key(List<Integer> key, int[] nums, boolean[] isVisited){
        //是否走到底
        if(key.size() == nums.length){
            //走到底了，我们就把这一条路径加入到结果路径中
            all_key.add(new ArrayList<>(key));
            return;
        }
        //走到这里，说明没有走到终点，我们还要接着遍历
        for(int x=0;x<nums.length;x++){
            //我们需要判断当前走的这个值是不是已经走过了
            if(!isVisited[x]){
                //没有被走过,将当前值加入路径，并据继续往里面走
                key.add(nums[x]);
                isVisited[x] = true;
                dfs_all_key(key,nums,isVisited);
                //回溯,一条路径上的点和另一条的不冲突，所以我们需要把上一条路径走过的值重置为没走过
                isVisited[x] = false;
                key.remove(key.size() - 1);//重置key
            }
        }
    }
    public String enter_str(int[] nums, String s, int h_len, int l_len, int ly){
        char[][] all_str = new char[h_len][l_len];
        int mix_h = ly/l_len;
        if(ly%l_len!=0)
            mix_h++;
        int ls = l_len - ly%l_len;
        if(ly!=0){
            //最上一行
            for(int x=ls;x<l_len;x++){
                all_str[h_len-mix_h][x] = '$';
            }
            //其余行
            if(mix_h>1) {
                for (int x = h_len - mix_h + 1; x < h_len; x++) {
                    for (int y = 0; y < l_len; y++) {
                        all_str[x][y] = '$';
                    }
                }
            }
        }
        int count = 0;
        for(int x=0;x<nums.length;x++){
            for(int y=0;y<h_len;y++){
                if(all_str[y][nums[x]-1]!='$'&&count<s.length()){
                    all_str[y][nums[x]-1] = s.charAt(count);
                    count++;
                }
            }
        }
        if(ly!=0){
            //最上一行
            for(int x=ls;x<l_len;x++){
                all_str[h_len-mix_h][x] = ' ';
            }
            //其余行
            if(mix_h>1) {
                for (int x = h_len - mix_h + 1; x < h_len; x++) {
                    for (int y = 0; y < l_len; y++) {
                        all_str[x][y] = ' ';
                    }
                }
            }
        }
        String result = "";
        for(int x=0;x<h_len;x++){
            for(int y=0;y<l_len;y++){
                result = result + all_str[x][y];
            }
        }
        return result;
    }
}
