package main

type ListNode struct {
	Val  int
	Next *ListNode
}

func reverseList(head *ListNode) *ListNode {
	if head == nil {
		return head
	}

	var prev *ListNode
	present := head
	next := present.Next

	for present != nil {
		present.Next = prev
		prev = present
		present = next
		if next != nil {
			next = next.Next
		}
	}

	return prev
}
