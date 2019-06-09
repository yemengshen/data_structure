package com.HuffmanTree.test;



import com.tree.test.HuffmanTree;

import java.util.*;

/**
 * @ProjectName: Data_test
 * @Package: com.HuffmanTree.test
 * @ClassName: HUffmanTest
 * @Author: 叶萌
 * @Description: 哈弗曼树编码
 * @Date: 2019/6/8 10:34
 * @Version: 1.0
 */
public class HUffmanTest {
    public static void main(String[] args) {
        String msg="can you can a can as a can canner can a can.";
        byte[] bytes=msg.getBytes();
        //使用赫夫曼编码压缩
        byte[] b=huffmanZip(bytes);
        //赫夫曼编码进行解码
        byte[] newbytes=decode(huffmanCode,b);
        System.out.println(msg);
        System.out.println(new String(newbytes));
    }

    //使用指定的赫夫曼编码表进行解码
    private static byte[] decode(Map<Byte, String> huffmanCode, byte[] b) {
        StringBuilder sb=new StringBuilder();
        //将byte数组转化为字符串
        for(int i=0;i<b.length;i++){
            byte b1=b[i];
            boolean flag=(i==b.length-1);
            String s=byteBinaryString(b1,!flag);
            sb.append(s);
        }
        System.out.println(sb);
        //把字符根据编码转化成字符串
        //将编码表的键值调换
        Map<String,Byte> map=new HashMap<>();
        for(Map.Entry<Byte,String> entry:huffmanCode.entrySet()){
            map.put(entry.getValue(),entry.getKey());
        }
        //创建一个集合，存储byte
        List<Byte> list=new ArrayList<>();
        //处理字符串
        for(int i=0;i<sb.length();){
            int count=1;
            boolean flag=true;
            Byte b2=null;
            while(flag){
                String key=sb.substring(i,i+count);
                b2=map.get(key);
                if(b2==null){
                    count++;
                }
                else{
                    flag=false;
                }
            }
            list.add(b2);
            i+=count;
        }
        //把集合转换成数组
        byte[] bytes=new byte[list.size()];
        for(int i=0;i<list.size();i++){
            bytes[i]=list.get(i);
        }
        return bytes;
    }
    //将byte数组转化为字符串
    private static String byteBinaryString(byte b, boolean flag){
        int temp=b;
        if(flag) {
            temp |= 256;
        }
        String s=Integer.toBinaryString(temp);
        if(flag){
            return s.substring(s.length()-8);
        }
        else{
            return s;
        }
    }

    /*
    哈弗曼树压缩编码方法
     */
    private static byte[] huffmanZip(byte[] bytes) {
        //先统计字符出现的次数,放入集合中
        List<NodeTree> nodes=getNodes(bytes);
        //创建一颗哈夫曼树
        NodeTree node=createHuffManTree(nodes);
        //创建赫夫曼编码表，遍历赫夫曼树
        Map<Byte,String> huffCodes=gethuffCodes(node);
        //对要发送的字符进行编码
        byte[] stringByte=zip(bytes,huffCodes);
        return stringByte;
    }

    //根据编码表转化编码
    private static byte[] zip(byte[] bytes, Map<Byte, String> huffCodes) {
       StringBuilder sb=new StringBuilder();
       for(byte b:bytes){
           sb.append(huffCodes.get(b));
       }
        System.out.println(sb);
        //定义字符数组的长度
       int length;
       if(sb.length()/8==0){
           length=sb.length()/8;
       }
       else{
           length=sb.length()/8+1;
       }
       byte[] bytes1=new byte[length];
       int index=0;
       for(int i=0;i<sb.length();i+=8){
           String str;
           if(i+8>sb.length()){
               str=sb.substring(i);
           }
           else{
               str=sb.substring(i,i+8);
           }
           byte s=(byte)Integer.parseInt(str,2);
           bytes1[index]=s;
           index++;
       }
        return bytes1;
    }

    private static StringBuilder sb=new StringBuilder();
    private static Map<Byte,String> huffmanCode=new HashMap<>();
    //根据赫夫曼树获取赫夫曼编码表
    private static Map<Byte, String> gethuffCodes(NodeTree tree) {
        if(tree==null){
            return null;
        }
        getCodes(tree.getLeft(),"0",sb);
        getCodes(tree.getRight(),"1",sb);
        return huffmanCode;
    }

    //遍历生成哈夫曼编码表
    private static void getCodes(NodeTree node, String code, StringBuilder sb) {
        StringBuilder sb2=new StringBuilder(sb);
        sb2.append(code);
        if(node.getData()==null){
            getCodes(node.getLeft(),"0",sb2);
            getCodes(node.getRight(),"1",sb2);
        }
        else{
            huffmanCode.put(node.getData(),sb2.toString());
        }
    }

    //生成哈夫曼树
    private static NodeTree createHuffManTree(List<NodeTree> nodes) {
        while(nodes.size()>1){
            //排序：
            Collections.sort(nodes);
            //取出根节点权值的最小的两颗二叉树
            NodeTree left=nodes.get(nodes.size()-1);
            NodeTree right=nodes.get(nodes.size()-2);
            //组成一颗新的二叉树，前面取出来的两颗二叉树是新二叉树的两个子树
            //根节点的权值是前两个取出来的两颗二叉树的根节点的权值之和
            NodeTree parent=new NodeTree(null,left.getWeight()+right.getWeight());
            parent.setLeft(left);
            parent.setRight(right);
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }
        return nodes.get(0);
    }

    //统计字符出现的次数
    private static List<NodeTree> getNodes(byte[] bytes) {
        List<NodeTree> nodes=new ArrayList<NodeTree>();
        //统计出现的次数
        Map<Byte,Integer> counts=new HashMap<>();
        for(byte b:bytes){
            Integer count=counts.get(b);
            if(count==null){
                counts.put(b,1);
            }
            else{
                counts.put(b,count+1);
            }
        }
        //把每一个键值转化为nodeTree对象
        for(Map.Entry<Byte,Integer> map:counts.entrySet()){
            nodes.add(new NodeTree(map.getKey(),map.getValue()));
        }
        return nodes;
    }
}
