
## 注意事项：  
1.带return文件包含返回数值类  
2.栅栏加密法在wiki中为V型，在百度百科中为N型  

------------------------------------------------------------------------------------------

## 文件：  
### 栅栏加密法(Rail Fence Cipher-N型)：  
jm_rfc  
jm_rfc_return  

### 列置加密法(Row Transposition Cipher)：  
jm_rtc  
jm_rtc_return  

### 凯撒密码(Caesar Cipher)：  
jm_cc  
jm_cc_return  

### 维吉尼亚加密法(Vigenère)：  
jm_v  
jm_v_return  

### 普莱费尔加密法(Playfair)：  
jm_p  
jm_p_return  

------------------------------------------------------------------------------------------

## 加密法简介：  
### 1.栅栏加密法(N型)  
横向转换为竖向，根据key的大小决定行的列数。  
例子：helloworld，key=2，->hloolelwrd  

### 2.列置加密法  
加强版栅栏加密法，根据key的不同，将key的当前列转换为行。  
__注意：密码/key=整数__  
例子：helloworl，key=231，->eorlwlhlo  

### 3.凯撒密码  
字母偏移，例如a=1,d=4,偏移3后,a转换为d。  
例子：meet me after the toga party，key=3，->phhw ph diwhu wkh wrjd sduwb  

### 4.维吉尼亚加密法  
改良的凯撒加密法，偏移值会变，即key为多位字母，每个字母代表一个偏移值。例如：code = {3,15,4,5}  
例子：we are discovered save yourself，key=deceptive，->zi cvt wqngrzgvtw avzh cqyglmgj  

### 5.普莱费尔加密法  
加强版多图加密法，key为一个单词，将字母表26个字母存于5\*5的表中(i,j位于同一格)。  
key中的字母优先排列于表的开头，其余排在末尾(相同的字母不出现多次)。  
每次取两个字母，共有四种情况：  
1.字母相同->在两者间添加X  
2.同一行->在表中取右侧字母代替  
3.同一列->在表中取下方字母代替  
4.其他->以对角字母代替(替换字母为同列)  
例子：killersarerunningaway，key=monarchy，->eksuulatrmkmwmagyqnxnb  

------------------------------------------------------------------------------------------

## 密码特点：  
### 1.栅栏加密法(N型)  
不改变第一个字母(有序)，改变符号位置  

### 2.列置加密法  
改变所有字母(有概率不改变部分字母)，改变符号位置  

### 3.凯撒密码  
改变所有字母(有序)，不改变符号位置  

### 4.维吉尼亚加密法  
改变所有字母(乱序)，不改变符号位置  

### 5.普莱费尔加密法  
改变所有字母(乱序)，不改变符号位置  

------------------------------------------------------------------------------------------

## 解密简介：  
部分解密中有指定key与所有key(暴力破解)  
当一串密码使用了多个加密法时，可以使用return进行数值传递继续进行下一次解密。  
### 1.栅栏加密法(N型)  
根据key和密码的长度创建二维数组(key的数值为行数)，密码按列数切割(key=2，切两份)，依序填入行，按列依序输出。  
所有key为可以指定key的范围。  

### 2.列置加密法  
根据key长度和密码的长度创建二维数组(key的长度为列数)，密码按行数切割，填入指定列(key值顺序)，按行依序输出。  
所有key为当前key位数的所有可能排列，算法使用DFS。  

### 3.凯撒密码  
根据key的值，对每一字母进行转换，偏移值为26-key。  
所有key为偏移值1-25。  

### 4.维吉尼亚加密法  
根据key的值，对每一字母进行转换，偏移值为|26-当前key值|。  

### 5.普莱费尔加密法  
根据key制表，替换密码中j为i，查询当前字母组(每两个一组)在表中位置，其中位置关系共有4种情况  
1.字母相同->不变  
2.同一行->在表中取左侧字母代替  
3.同一列->在表中取上方字母代替  
4.其他->以对角字母代替(替换字母为同列)  

------------------------------------------------------------------------------------------
