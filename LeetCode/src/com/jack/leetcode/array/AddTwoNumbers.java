package com.jack.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author CrazyJack
 * @date 2020/05/11/21:03
 */
public class AddTwoNumbers {
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			return "ListNode{" +
					"val=" + val +
					", next=" + next +
					'}';
		}
	}

	public static int nodeToNum(ListNode node) {
		if (node == null) {
			return 0;
		}
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(node.val);
		ListNode next = node.next;
		while (next != null) {
			stringBuffer.append(next.val);
			next = next.next;
		}
		return Integer.valueOf(stringBuffer.reverse().toString());
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(2);
		ListNode list2Node = new ListNode(4);
		ListNode list3Node = new ListNode(3);
		listNode.next = list2Node;
		list2Node.next = list3Node;

		ListNode list4Node = new ListNode(5);
		ListNode list5Node = new ListNode(6);
		ListNode list6Node = new ListNode(4);
		list4Node.next = list5Node;
		list5Node.next = list6Node;
		ListNode listNode1 = addTwoNumbers(listNode, list4Node);
		System.out.println(listNode1);

	}

	public static ListNode intToNode(int temp) {
		int ret = temp % 10;
		temp = temp / 10;
		List<ListNode> list = new ArrayList<>();
		list.add(new ListNode(ret));
		while (temp != 0) {
			ret = temp % 10;
			list.add(new ListNode(ret));
			temp = temp / 10;
		}
		for (int i = 0; i < list.size() - 1; i++) {
			list.get(i).next = list.get(i + 1);
		}
		return list.get(0);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int ret = nodeToNum(l1) + nodeToNum(l2);
		return intToNode(ret);
	}
}
