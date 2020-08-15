package _2020._08._14._0021;

/**
 * 21. 合并两个有序链表
 * ----------------------------
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * ----------------------------
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {


    // Definition for singly-linked list.
    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

//    //双指针
//    static public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode preNode1 = new ListNode();//链表1的前驱节点
//        ListNode preNode2 = new ListNode();//链表2的前驱节点
//        ListNode resultNodeList = new ListNode();
//        ListNode preResultNode = resultNodeList;//结果链表的前驱节点
//        preNode1.next = l1;
//        preNode2.next = l2;
//        //有一个链表遍历完成，则结束遍历。
//        while(null != preNode1.next && null != preNode2.next){
//            if(preNode1.next.val <= preNode2.next.val){
//                preResultNode.next = preNode1.next;
//                preNode1.next = preNode1.next.next;
//            }else{
//                preResultNode.next = preNode2.next;
//                preNode2.next = preNode2.next.next;
//            }
//            preResultNode = preResultNode.next;
//        }
//        if(null == preNode1.next && null != preNode2.next){
//            preResultNode.next = preNode2.next;
//        }else if(null != preNode1.next && null == preNode2.next){
//            preResultNode.next = preNode1.next;
//        }
//        return resultNodeList.next;
//    }


    //双指针：简化
    static public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preResultListNode = new ListNode();//结果链表的前驱节点
        ListNode preTempNode = preResultListNode;//指针
        //有一个链表遍历完成，则结束遍历。
        while (null != l1 && null != l2) {
            if (l1.val <= l2.val) {
                preTempNode.next = l1;
                l1 = l1.next;
            } else {
                preTempNode.next = l2;
                l2 = l2.next;
            }
            preTempNode = preTempNode.next;
        }
        preTempNode.next = null == l1 ? l2 : l1;
        return preResultListNode.next;
    }

    public static void main(String args[]) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;
        l21.next = l22;
        l22.next = l23;
        mergeTwoLists(l11, l21);
    }
}
