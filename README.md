# SMS4_Decrypt

### 0x01 简介

SMS4算法是在国内广泛使用的WAPI无线网络标准中使用的加密算法，是一种32轮的迭代非平衡Feistel结构的分组加密算法，其密钥长度和分组长度均为128。

SMS4算法的加解密过程中使用的算法是完全相同的，唯一不同点在于该算法的解密密钥是由它的加密密钥进行逆序变换后得到的。

https://baike.baidu.com/item/SMS4%E7%AE%97%E6%B3%95/16858974

### Usage:

`change Main.java set SMS4_KEY`

`len(SMS4_KEY) = 16`

e.g.

`java -jar SMS4_Decrypt-1.0-SNAPSHOT-jar-with-dependencies.jar `

```


[+] SMS4 Decrypt
[+] Example: 1D7114B6968BF8208DD94A4DECE634CD

[+] Input SMS4 Password= 1D7114B6968BF8208DD94A4DECE634CD
[+] Passwd Length=32
[+] 明文密码= Jas502n

[+] Input SMS4 Password= 

```
