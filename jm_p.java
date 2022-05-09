package jiemi;

import java.util.Arrays;
import java.util.Locale;

public class jm_p {
    public void p(String mm, String word){
        word = word.toLowerCase();
        word = quchong(word);
        String result = "";
        mm = mm.toLowerCase();
        mm = mm.replace('j','i');
        String[][] str_num = enter_str(word);
        for(int x=0;x<mm.length()/2;x++){
            int[] one_num = excel(str_num,mm.charAt(2*x));
            int[] two_num = excel(str_num,mm.charAt(2*x+1));
            if(one_num[0]==two_num[0]){
                if(one_num[1]-1==-1)
                    one_num[1] = 5;
                if(two_num[1]-1==-1)
                    two_num[1] = 5;
                result = result + str_num[one_num[0]][one_num[1]-1].charAt(0);
                result = result + str_num[two_num[0]][two_num[1]-1].charAt(0);
            }
            else if(one_num[1]==two_num[1]){
                if(one_num[0]-1==-1)
                    one_num[0] = 5;
                if(two_num[0]-1==-1)
                    two_num[0] = 5;
                result = result + str_num[one_num[0]-1][one_num[1]].charAt(0);
                result = result + str_num[two_num[0]-1][two_num[1]].charAt(0);
            }
            else {
                result = result + str_num[one_num[0]][two_num[1]].charAt(0);
                result = result + str_num[two_num[0]][one_num[1]].charAt(0);
            }
        }
        System.out.println("密钥单词为："+word);
        System.out.println(result);
    }
    //属于j || word
    public boolean isword(String word, char ch){
        boolean result=true;
        for(int x=0;x<word.length();x++){
            if(ch==word.charAt(x)||ch=='j'){
                result = false;
                break;
            }
        }
        return result;
    }
    //制表
    public String[][] enter_str(String word){
        String[] temp = word.split("");
        String[][] str_num = new String[5][5];
        int count = 0;
        int ascii_str = 97;
        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                if(count<word.length()){
                    str_num[x][y] = temp[count];
                    count++;
                }
                else {
                    while(isword(word, (char)ascii_str)==false){
                        ascii_str++;
                    }
                    str_num[x][y] = String.valueOf((char)ascii_str);
                    ascii_str++;
                }
            }
        }
        return str_num;
    }
    //在表的位置
    public int[] excel(String[][] str_num,char ch){
        int hl[] = new int[2];
        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                if(str_num[x][y].charAt(0)==ch){
                    hl[0] = x;
                    hl[1] = y;
                    break;
                }
            }
        }
        return hl;
    }
    public String quchong(String word){
        String result = "";
        for(int x=0;x<word.length();x++){
            boolean ls = true;
            for(int y=0;y<result.length();y++){
                if(result.charAt(y)==word.charAt(x)){
                    ls = false;
                    break;
                }
            }
            if(ls==true)
                result = result + word.charAt(x);
        }
        return result;
    }
}
