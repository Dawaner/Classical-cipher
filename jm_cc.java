package jiemi;

public class jm_cc {
    public void cc(String mm) {
        for(int x=1;x<25;x++){
            String result = "";
            int count = 0;
            for(int y=0;y<mm.length();y++){
                if(mm.charAt(y)>=65&&mm.charAt(y)<=90){
                    int ls_num = mm.charAt(count) - x;
                    char str = (char)(ls_num>=65&&ls_num<=90 ? ls_num : ls_num+26);
                    result = result + str;
                    count++;
                }
                else if(mm.charAt(y)>=97&&mm.charAt(y)<=122){
                    int ls_num = mm.charAt(count) - x;
                    char str = (char)(ls_num>=97&&ls_num<=122 ? ls_num : ls_num+26);
                    result = result + str;
                    count++;
                }
                else {
                    result = result + mm.charAt(count);
                    count++;
                }
            }
            System.out.print("当前偏移值为："+x+" ");
            System.out.println(result);
            result = "";
            count = 0;
        }

    }
    public void cc_mykey(String mm,int x) {
        String result = "";
        int count = 0;
        for(int y=0;y<mm.length();y++){
            if(mm.charAt(y)>=65&&mm.charAt(y)<=90){
                int ls_num = mm.charAt(count) - x;
                char str = (char)(ls_num>=65&&ls_num<=90 ? ls_num : ls_num+26);
                result = result + str;
                count++;
            }
            else if(mm.charAt(y)>=97&&mm.charAt(y)<=122){
                int ls_num = mm.charAt(count) - x;
                char str = (char)(ls_num>=97&&ls_num<=122 ? ls_num : ls_num+26);
                result = result + str;
                count++;
            }
            else {
                result = result + mm.charAt(count);
                count++;
            }
        }
        System.out.print("当前偏移值为："+x+" ");
        System.out.println(result);
    }
}
