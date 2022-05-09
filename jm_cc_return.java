package jiemi;

public class jm_cc_return {
    public String[] cc_rreturn(String mm) {
        String[] result_return = new String[25];
        int count = 0;
        int count_re = 0;
        for(int x=1;x<26;x++){
            String result = "";
            for(int y=0;y<mm.length();y++){
                if(mm.charAt(y)>=65&&mm.charAt(y)<=90){
                    int ls_num = mm.charAt(count) + x;
                    char str = (char)(ls_num>=65&&ls_num<=90 ? ls_num : ls_num-26);
                    result = result + str;
                    count++;
                }
                else if(mm.charAt(y)>=97&&mm.charAt(y)<=122){
                    int ls_num = mm.charAt(count) + x;
                    char str = (char)(ls_num>=97&&ls_num<=122 ? ls_num : ls_num-26);
                    result = result + str;
                    count++;
                }
                else {
                    result = result + mm.charAt(count);
                    count++;
                }
            }
            result_return[count_re] = result.trim();
            result = "";
            count = 0;
            count_re++;
        }
        return result_return;

    }
    public String cc_mykey_return(String mm,int x) {
        String result = "";
        int count = 0;
        for(int y=0;y<mm.length();y++){
            if(mm.charAt(y)>=65&&mm.charAt(y)<=90){
                int ls_num = mm.charAt(count) + x;
                char str = (char)(ls_num>=65&&ls_num<=90 ? ls_num : ls_num-26);
                result = result + str;
                count++;
            }
            else if(mm.charAt(y)>=97&&mm.charAt(y)<=122){
                int ls_num = mm.charAt(count) + x;
                char str = (char)(ls_num>=97&&ls_num<=122 ? ls_num : ls_num-26);
                result = result + str;
                count++;
            }
            else {
                result = result + mm.charAt(count);
                result = result.trim();
                count++;
            }
        }
        return result;
    }
}
