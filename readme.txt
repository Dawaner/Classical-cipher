带return包含返回数值类
栅栏加密法(Rail Fence Cipher-N型)：
jm_rfc
jm_rfc_return

列置加密法(Row Transposition Cipher)：
jm_rtc
jm_rtc_return

凯撒密码(Caesar Cipher)：
jm_cc
jm_cc_return

维吉尼亚加密法(Vigenère)：
jm_v
jm_v_return

普莱费尔加密法(Playfair)：
jm_p
jm_p_return

------------------------------------------------------------------------------------------

加密法简介：
1.栅栏加密法(N型)
横向转换为竖向，根据key的大小决定行的列数。
例子：helloworld，key=2，->hloolelwrd

2.列置加密法
加强版栅栏加密法，根据key的不同，将key的当前列转换为行。
注意：密码/key=整数
例子：helloworl，key=231，->eorlwlhlo

3.凯撒密码
字母偏移，例如a=1,d=4,偏移3后,a转换为d。
例子：meet me after the toga party，key=3，->phhw ph diwhu wkh wrjd sduwb

4.维吉尼亚加密法
改良的凯撒加密法，偏移值会变，即key为多位字母，每个字母代表一个偏移值。例如：code = {3,15,4,5}
例子：we are discovered save yourself，key=deceptive，->zi cvt wqngrzgvtw avzh cqyglmgj

5.普莱费尔加密法
加强版多图加密法，key为一个单词，将字母表26个字母存于5*5的表中(i,j位于同一格)。
key中的字母优先排列于表的开头，其余排在末尾(相同的字母不出现多次)。
例子：killersarerunningaway，key=monarchy，->eksuulatrmkmwmagyqnxnb

------------------------------------------------------------------------------------------

密码特点：
1.栅栏加密法(N型)
不改变第一个字母(有序)，改变符号位置

2.列置加密法
改变所有字母(有概率不改变部分字母)，改变符号位置

3.凯撒密码
改变所有字母(有序)，不改变符号位置

4.维吉尼亚加密法
改变所有字母(乱序)，不改变符号位置

5.普莱费尔加密法
改变所有字母(乱序)，不改变符号位置

------------------------------------------------------------------------------------------

算法简介：
1.栅栏加密法(N型)
横向转换为竖向，根据key的大小决定行的列数。
例子：helloworld，key=2，->hloolelwrd
算法：输入存进二维数组，二维数组倒置。

2.列置加密法

3.凯撒密码
4.维吉尼亚加密法
5.普莱费尔加密法

------------------------------------------------------------------------------------------
