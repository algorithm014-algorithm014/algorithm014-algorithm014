package _2020._08._13._0024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 24. 两两交换链表中的节点
 * ----------------------------
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * ----------------------------
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class SwapNodesInPairs {


    // Definition for singly-linked list.
   static public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    //暴力法
//    static public ListNode swapPairs(ListNode head) {
//        if(null == head || null== head.next){//只有0或1个节点的链表，不需要交互.
//            return head;
//        }
//        ListNode resultHeadNode = null;
//        if(null == head.next.next){//只有2个节点的链表，彼此交互.
//            head.next.next = head;
//            resultHeadNode = head.next;
//            head.next = null;
//            return resultHeadNode;
//        }
//        //大于3个节点的链表
//        resultHeadNode = head.next;
//        ListNode precursorNode = new ListNode(-1);//前驱节点
//        precursorNode.next = head;
//        while ((head != null) && (head.next != null)) {
//            // Nodes to be swapped
//            ListNode firstNode = head;
//            ListNode secondNode = head.next;
//            // Swapping
//            precursorNode.next = secondNode;
//            firstNode.next = secondNode.next;
//            secondNode.next = firstNode;
//            // Reinitializing the head and prevNode for next swap
//            precursorNode = firstNode;
//            head = firstNode.next; // jump
//        }
//        return resultHeadNode;
//    }

    //循环：简化
    static public ListNode swapPairs(ListNode head) {
        if(null == head || null== head.next){//只有0或1个节点的链表，不需要交互.
            return head;
        }
        ListNode resultHeadNode = null;
        if(null == head.next.next){//只有2个节点的链表，彼此交互.
            head.next.next = head;
            resultHeadNode = head.next;
            head.next = null;
            return resultHeadNode;
        }
        //大于3个节点的链表
        resultHeadNode = head.next;
        ListNode precursorNode = new ListNode(-1);//前驱节点
        precursorNode.next = head;
        while ((head != null) && (head.next != null)) {
            // Nodes to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;
            // Swapping
            precursorNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            // Reinitializing the head and prevNode for next swap
            precursorNode = firstNode;
            head = firstNode.next; // jump
        }
        return resultHeadNode;
    }

    public static void main(String args[]) {
//        int[] nums = {2, 7, 11, 15};
//        int target = 26;
//        System.out.println(Arrays.toString(swapPairs(nums, target)));
    }
}
