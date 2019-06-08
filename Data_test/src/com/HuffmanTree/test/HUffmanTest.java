package com.HuffmanTree.test;



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
        byte[] b=huffmanZip(bytes);
    }

    /*
    哈弗曼树压缩编码方法
     */
    private static byte[] huffmanZip(byte[] bytes) {
        //先统计字符出现的次数,放入集合中
        List<NodeTree> nodes=getNodes(bytes);
        //System.out.println(nodes);
        //创建一颗哈夫曼树
        NodeTree node=createHuffManTree(nodes);
        System.out.println(node);
        System.out.println(node.getLeft());
        System.out.println(node.getRight());
        return null;
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
