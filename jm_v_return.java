package jiemi;

public class jm_v_return {
    public String v_return(String mm,String word){
        String result = "";
        String[] temp = word.split("");
        int[] nums = new int[temp.length];
        //转为偏移位数
        for(int x=0;x< temp.length;x++){
            if(temp[x].charAt(0)>=65&&temp[x].charAt(0)<=90)
                nums[x] = (int)temp[x].charAt(0)-65;
            else if(temp[x].charAt(0)>=97&&temp[x].charAt(0)<=122)
                nums[x] = (int)temp[x].charAt(0)-97;
        }
        int count_num = 0;
        for(int x=0;x<mm.length();x++,count_num++){
            if(mm.charAt(x)>=65&&mm.charAt(x)<=90){
                int ls_num = mm.charAt(x) - nums[count_num];
                char str = (char)(ls_num>=65&&ls_num<=90 ? ls_num : ls_num+26);
                result = result + str;
            }
            else if(mm.charAt(x)>=97&&mm.charAt(x)<=122){
                int ls_num = mm.charAt(x) - nums[count_num];
                char str = (char)(ls_num>=97&&ls_num<=122 ? ls_num : ls_num+26);
                result = result + str;
            }
            else {
                result = result + mm.charAt(x);
                count_num--;
            }
            if(count_num==nums.length-1)
                count_num = -1;
        }
        return result;
    }
}
