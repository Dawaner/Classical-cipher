package jiemi;

import java.lang.reflect.Array;
import java.util.Arrays;

class jm_rfc {
    //所有key
    public void rfc(String mm,int min_num,int max_num) {
        int len = mm.length();
        for(int x=min_num;x<max_num+1;x++){
            int ly = x - len%x;
            int l_num = len/x;
            if(ly==0 == false)
                l_num++;
            String result = "";
            result = enter_str(x,l_num,mm,ly);
            System.out.print("当前行数："+x+" ");
            System.out.println(result);
            ////
            int count = 1;
            for(int y=0;y<result.length();y++,count++){
                if(result.charAt(y)=='.'){
                    break;
                }
            }
            System.out.println("句号位置："+count);
        }
    }
    //指定key
    public void rfc_mykey(String mm,int num) {
        int len = mm.length();
        int ly = num - len%num;
        int l_num = len/num;
        if(ly==0 == false)
            l_num++;
        String result = "";
        result = enter_str(num,l_num,mm,ly);
        System.out.print("当前行数："+num+" ");
        System.out.println(result);
    }
    public String enter_str(int h_len,int l_len,String mm,int ly){
        char[][] result = new char[h_len][l_len];
        int count = 0;
        for(int x=0;x<h_len;x++){
            for(int y=0;y<l_len;y++){
                if(x>=h_len-ly && y==l_len-1)
                    result[x][y] = ' ';
                else {
                    result[x][y] = mm.charAt(count);
                    count++;
                }
            }
        }
        String result_str = "";
        for(int x=0;x<l_len;x++){
            for(int y=0;y<h_len;y++){
                result_str = result_str + result[y][x];
            }
        }
        return result_str;
    }
}
