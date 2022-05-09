package jiemi;

public class the_main {
    public static void main(String[] args) {
        jm_rfc jm_rfc = new jm_rfc();
        jm_rtc jm_rtc = new jm_rtc();
        jm_cc jm_cc = new jm_cc();
        jm_v jm_v = new jm_v();
        jm_p jm_p = new jm_p();
        jm_rfc_return jm_rfc_return = new jm_rfc_return();
        jm_rtc_return jm_rtc_return = new jm_rtc_return();
        jm_cc_return jm_cc_return = new jm_cc_return();
        jm_v_return jm_v_return = new jm_v_return();
        jm_p_return jm_p_return = new jm_p_return();
        /*
        栅栏加密法
        不改变第一个字母(有序)，改变符号位置

        列置加密法
        改变所有字母(有概率不改变部分字母)，改变符号位置

        凯撒密码
        改变所有字母(有序)，不改变符号位置

        维吉尼亚加密法
        改变所有字母(乱序)，不改变符号位置

        普莱费尔加密法
        改变所有字母(乱序)，不改变符号位置
        */

        String mm1 = "Ac,-yyalcno onumehonylihotkhm  ouy occ,rp  a nygewram fagogopnttantatn a rtc gvn n,po anictrcctun ctsdtce id k em herhcu w t  i acraoyua eeoa ulriitrprnrpreo oiiiurds o sduec h  trok srlo etuh,ssarmrbt dona.yeyrr gretaixtaeriennt  n o t";
        String mm2 = "Jyfwavjbyylujf kvlz uva lepza pu wofzpjhs mvyt (sprl whwly tvulf) huk pz afwpjhssf uva pzzblk if h jluayhs hbaovypaf. Jyfwavjbyylujplz afwpjhssf bzl kljluayhspglk jvuayvs hz vwwvzlk av h jluayhs ihur kpnpahs jbyylujf.";
        String mm3 = "A rgjttdrfvrtcnc ih p evaspmpe sxrmtpa lwsti zv dxvtxaa uzvm du xsntn, myiai zr badnocwptr ttrsroadrc twpe snan pbihid snaxyi. Cgnaxorjcvecrtis jhp inrgjttxdy xo pjelecitgait lrd egzxeri evachlgtxdyw, htcni twttv npbp.";
        String mm4 = "CGKOSWADFHJLNPRTVXZBEIMQUY";
        String mm5 = "ttrcrb aplodrit seti pun c,sed sbpdm eeahaoedlyetaee yvSN.fcztco  usoltkhi eaeroryiiwctbrmyenueo o aorndc,nryauspsm";

        String mm6 = "mematrhtgpryetefeteoaat";
        String mm7 = "ttnaaptmtsuoaodwcoixknlypetz";
        String mm8 = "A cryptocurrency, crypto-currency, or crypto is a digital currency designed to work as a medium of exchange through a computer network that is not reliant on any central authority, such as a government or bank, to uphold or maintain it.";
        String mm9 = "fjdsdr mfxephuj eufy bkz s,eup infpc qumxmeqtxoqjmuq ohIZ.vopfsa  keexjwxu umudedouyisfrdckuzkqe a qahzto,ddomkefec";
        String mm10 = "zicvtwqngrzgvtwavzhcqyglmgj";
        String mm11 = "ODTHMUGH";
        String mm12 = "ABPCDERGFITKHMVOJQXSLUZWNY";
        String s3 = "Accu, -wy yta l cin oa cornauomyeuhao neyeloiah outlkrhimi t ropuryn ropcrce,or po i iai unrydgse wor asmd ufeacg ohg o ptnrtotka nstralton  eat urht,cs sgavrnm rnb,tp od oannai.";
        String s4 = "cAuc ,w- yty a lic naoc roanouymueah oeneyolai huoltrkihimt r porunyr porceco, ropi i iau rndysg eow rsadmu efca gho g otprnotkt asnrtlaot ne tau hr,tscs agrvmnr bnt, pdoo naan.";
        String s5 = "Aoc cput,n r-twoyt kyat an slt rcailnt oona   ceoartn auurohmty,ecush asog anveryneml orinabh, topu toldk rohainmnia it. cryotpeurryycnr crrotp curgcner, oerc tptoa sii dixatit cuanerey drgisied ew onrk na stmed  mu f enahc ge oorh gh t";
//        System.out.println(s5.length());

//        //an
//        jm_cc.cc_mykey(mm2,7);
//        jm_v.v(mm3,"apple");

//        //rfc-栅栏加密法
//        //参数:密码，最小行数，最大行数
        jm_rfc.rfc(mm4,2,30);
//        //参数:密码，指定行数
//        jm_rfc.rfc_mykey(mm1,8);

//        //rtc-列置换加密法
//        //参数:密码，指定key长度
//        jm_rtc.rtc(s5,6);
//        //参数:密码，指定key
//        int[] rtc_mykey = {1,2,3,4,5,6,7,8,9};
//        jm_rtc.rtc_mykey(mm1,rtc_mykey);

//        //cc-凯撒密码
//        //参数:密码
//        jm_cc.cc(mm2);
//        //参数:密码，指定偏移的位数
//        jm_cc.cc_mykey(mm1,4);

        //v-维吉尼亚加密法
//        jm_v.v(mm10,"deceptive");

        //p-普莱费尔加密法
//        jm_p.p(mm4,"observation");

        //rfc-p
//        String[] str_rp = jm_rfc_return.rfc_return(mm4,2,10);
//        for(int x=0;x<str_rp.length;x++){
//            jm_p.p(str_rp[x],"apple");
//        }


        //rfc-cc,先rfc，后cc
//        String[] str_rc = jm_rfc_return.rfc_return(mm1,2,10);
//        for(int x=0;x<str_rc.length;x++){
//            jm_cc.cc(str_rc[x]);
//            System.out.println();
//        }
        //cc-rfc,先cc，后rfc
//        String[] str_cr = jm_cc_return.cc_rreturn(mm4);
//        for(int x=0;x<str_cr.length;x++){
//            jm_rfc.rfc(str_cr[x],2,10);
//            System.out.println();
//        }
        //rfc-rtc
//        String[] str_ft = jm_rfc_return.rfc_return(mm1,4,4);
//        for(int x=0;x<str_ft.length;x++){
//            System.out.println("当前栅栏key="+(x+2));
//            jm_rtc.rtc(str_ft[x], 6);
//            System.out.println();
//        }
        //rtc-rfc
//        String[] str_tf = jm_rtc_return.rtc_return(mm1,2);
//        for(int x=0;x<str_tf.length;x++){
//            jm_rfc.rfc(str_tf[x],2,50);
//            System.out.println();
//        }

//        String[] mm12 = jm_rtc_return.rtc_return(mm1,mm1.length()/5);
//        for(int x=0;x<mm12.length;x++){
//            jm_rtc.rtc(mm12[x],mm1.length()/5);
//            System.out.println();
//        }


    }
}
