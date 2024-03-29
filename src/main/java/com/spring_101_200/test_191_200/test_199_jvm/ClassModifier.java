package com.spring_101_200.test_191_200.test_199_jvm;

public class ClassModifier {


    // Class 文件中的常量池的起始偏移
    private static final  int CONSTANT_POOL_COUNT_INDEX = 8 ;


    // CONSTANT_Utf8_info 常量的tag标志
    private static final int CONSTANT_Utf8_info = 1;

    // 常量池中的11种常量所占的长度 ，CONSTANT_Utf_8 info 型常量除外，因为它不是定长的。

    private static final int [] CONSTANT_ITEM_LENGTH = {-1,-1,-1,5,5,9,9,3,3,5,5,5,5};

    private static final int u1 = 1;
    private static final int u2 = 2;

    private byte [] classByte ;
    public ClassModifier(byte [] classByte) {
        this.classByte = classByte;
    }

    /***
     * 修改常量池中的CONSTANT_Utf8_info的常量的内容
     * 修改前的字符串
     * 修改后的字符串
     * 修改结果
     */

    public byte [] modifyUTF8Constant(String oldStr,String newStr){
        int cpc = getConstantPoolCount();
        int offset = CONSTANT_POOL_COUNT_INDEX + u2 ;
        for(int i = 0 ;i < cpc; i ++){
            int tag = ByteUtils.byte2Int(classByte,offset,u1);
            if(tag == CONSTANT_Utf8_info){
                int len = ByteUtils.byte2Int(classByte,offset+u1,u2);
                offset += (u1 + u2);
                String str = ByteUtils.byte2String(classByte,offset,len);
                if(str.equalsIgnoreCase(oldStr)){
                    byte [] strBytes = ByteUtils.string2Bytes(newStr);
                    byte[] strLen = ByteUtils.int2Bytes(newStr.length() ,u2);
                    classByte = ByteUtils.bytesReplace(classByte,offset-u2,u2,strLen);
                    classByte = ByteUtils.bytesReplace(classByte,offset,len,strBytes);
                    return classByte;
                }else{
                    offset += len;
                }
            }else {
                offset += CONSTANT_ITEM_LENGTH[tag];
            }
        }
        return classByte;
    }


    /**
     * 获取常量池中的常量数
     * 常量池的数量
     */
    public int getConstantPoolCount(){
        return ByteUtils.byte2Int(classByte,CONSTANT_POOL_COUNT_INDEX,u2);
    }

}
