# 学习记录
## 第1课 数据结构与算法总览

待更新：绘制自己的数据结构和算法脑图

## 第2课 训练准备和复杂度分析
### 2.1 训练环境设置、编码技巧和Code Style
参考链接：
* [Windows Microsoft New Terminal][1] 
* [ VS Code Themes ][2]
* [教你打造一款颜值逆天的 VS Code ][3]
* [炫酷的 VS Code 毛玻璃效果][4]
* [自顶向下的编程方式][5]： 该思想很受用，需要刻意练习养成习惯。
* [自顶向下编程的 LeetCode 例题][6]

[1]: http://github.com/microsoft/terminal "microsoft terminal"
[2]: http://vscodethemes.com "VS Code"
[3]: http://toutiao.io/posts/7w5ixl/preview 
[4]: http://juejin.im/post/5ce1365151882525ff28ed47
[5]: http://markhneedham.com/blog/2008/09/15/clean-code-book-review/
[6]: http://leetcode-cn.com/problems/valid-palindrome/

### 2.2 时间复杂度和空间复杂度分析
参考链接：
* [如何理解算法时间复杂度的表示法][7] 
* [ wiki：Master theorem ][8]
* [ wiki：主定理][9]

[7]: http://www.zhihu.com/question/21387264
[8]: http://en.wikipedia.org/wiki/Master_theorem_(analysis_of_algorithms)
[9]: http://zh.wikipedia.org/wiki/%E4%B8%BB%E5%AE%9A%E7%90%86
        
## 第3课 数组、链表、跳表
### 3.1 数组、链表、跳表的基本实现和特性
参考链接：
* [ Java 源码分析（ArrayList）][10] 
* [ Linked List 的标准实现代码][11]
* [ Linked List 示例代码][12]
* [ Java 源码分析（LinkedList）][13]
* [LRU Cache - Linked list： LRU 缓存机制][14]
* [Redis - Skip List：跳跃表、为啥 Redis 使用跳表（Skip List）而不是使用 Red-Black？][15]

[10]: http://developer.classpath.org/doc/java/util/ArrayList-source.html
[11]: http://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
[12]: http://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/code/LinkedList.java
[13]: http://developer.classpath.org/doc/java/util/LinkedList-source.html
[14]: http://leetcode-cn.com/problems/lru-cache
[15]: http://redisbook.readthedocs.io/en/latest/internal-datastruct/skiplist.html

### 3.2 实战解析
（1）参考链接：Array 实战题目
* [ 盛最多水的容器 ][16] （腾讯、百度、字节跳动在近半年内面试常考）
* [ 移动零 ][17]（华为、字节跳动在近半年内面试常考）
* [ 爬楼梯 ][18]（阿里巴巴、腾讯、字节跳动在半年内面试常考）
* [ 三数之和 ][19]（国内、国际大厂历年面试高频老题）
* [ 两数之和 ][20]（近半年内，字节跳动在面试中考查此题达到 152 次）

[16]: https://leetcode-cn.com/problems/container-with-most-water/
[17]: https://leetcode-cn.com/problems/move-zeroes/
[18]: https://leetcode.com/problems/climbing-stairs/
[19]: https://leetcode-cn.com/problems/3sum/
[20]: https://leetcode-cn.com/problems/two-sum/

（2）参考链接：Linked List 实战题目
* [ 反转链表 ][21] （字节跳动、亚马逊在半年内面试常考）
* [ 两两交换链表中的节点 ][22]（阿里巴巴、字节跳动在半年内面试常考）
* [ 环形链表 ][23]（阿里巴巴、字节跳动、腾讯在半年内面试常考）
* [ 环形链表 II  ][24]
* [  K 个一组翻转链表 ][25]（字节跳动、猿辅导在半年内面试常考）

[21]: https://leetcode.com/problems/reverse-linked-list/
[22]: https://leetcode.com/problems/swap-nodes-in-pairs
[23]: https://leetcode.com/problems/linked-list-cycle
[24]: https://leetcode.com/problems/linked-list-cycle-ii 
[25]: https://leetcode.com/problems/reverse-nodes-in-k-group/

## 第4课 栈、队列、优先队列、双端队列
### 4.1 栈和队列的实现与特性
参考链接：
* [  Java 的 PriorityQueue 文档 ][26] 
* [  Java 的 Stack 源码 ][27]
* [  Java 的 Queue 源码 ][28]
* [  Python 的 heapq  ][29]
* [ 高性能的 container 库 ][30]

[26]: http://docs.oracle.com/javase/10/docs/api/java/util/PriorityQueue.html
[27]: http://developer.classpath.org/doc/java/util/Stack-source.html
[28]: http://fuseyism.com/classpath/doc/java/util/Queue-source.html
[29]: http://docs.python.org/2/library/heapq.html
[30]: http://docs.python.org/2/library/collections.html

### 4.2 实战题目解析：有效的括号、最小栈等问题
预习题目：
* [有效的括号][31]（亚马逊、JPMorgan 在半年内面试常考）
* [最小栈][32]（亚马逊在半年内面试常考）

[31]: https://leetcode-cn.com/problems/valid-parentheses/
[32]: https://leetcode-cn.com/problems/min-stack/

实战题目：
* [柱状图中最大的矩形][33]（亚马逊、微软、字节跳动在半年内面试中考过）
* [滑动窗口最大值][34]（亚马逊在半年内面试常考）

[33]: https://leetcode-cn.com/problems/largest-rectangle-in-histogram
[34]: https://leetcode-cn.com/problems/sliding-window-maximum

课后作业：
* 用 add first 或 add last 这套新的 API 改写 Deque 的代码
* 分析 Queue 和 Priority Queue 的源码
* [设计循环双端队列][35]（Facebook 在 1 年内面试中考过）
* [接雨水][36]（亚马逊、字节跳动、高盛集团、Facebook 在半年内面试常考）

[35]: https://leetcode.com/problems/design-circular-deque
[36]: https://leetcode.com/problems/trapping-rain-water/

说明：改写代码和分析源码这两项作业，同学们需要在第 1 周的学习总结中完成。如果不熟悉 Java 语言，这两项作业可选做。

## 本周作业及下周预习
### 本周作业
#### 简单：
* 用 add first 或 add last 这套新的 API 改写 Deque 的代码
* 分析 Queue 和 Priority Queue 的源码
* [删除排序数组中的重复项][37]（Facebook、字节跳动、微软在半年内面试中考过）
* [旋转数组][38]（微软、亚马逊、PayPal 在半年内面试中考过）
* [合并两个有序链表][39]（亚马逊、字节跳动在半年内面试常考）
* [合并两个有序数组][40]（Facebook 在半年内面试常考）
* [两数之和][41]（亚马逊、字节跳动、谷歌、Facebook、苹果、微软在半年内面试中高频常考）
* [移动零][42]（Facebook、亚马逊、苹果在半年内面试中考过）
* [加一][43]（谷歌、字节跳动、Facebook 在半年内面试中考过）

[37]: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
[38]: https://leetcode-cn.com/problems/rotate-array/
[39]: href="https://leetcode-cn.com/problems/merge-two-sorted-lists/"
[40]: https://leetcode-cn.com/problems/merge-sorted-array/
[41]: https://leetcode-cn.com/problems/two-sum/
[42]: https://leetcode-cn.com/problems/move-zeroes/
[43]: https://leetcode-cn.com/problems/plus-one/

#### 中等：
* [设计循环双端队列][44]（Facebook 在 1 年内面试中考过）

[44]: https://leetcode.com/problems/design-circular-deque

#### 困难：
* [接雨水][45]（亚马逊、字节跳动、高盛集团、Facebook 在半年内面试常考）

[45]: https://leetcode.com/problems/trapping-rain-water/

### 下周预习
#### 预习题目：
* [有效的字母异位词][46]
* [二叉树的中序遍历][47]
* [最小的 k 个数][48]

[46]: https://leetcode-cn.com/problems/valid-anagram/description/
[47]: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
[48]: https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/



