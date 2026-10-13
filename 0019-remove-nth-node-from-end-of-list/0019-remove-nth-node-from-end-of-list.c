/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {

    struct ListNode dummy, *fast, *slow;
    dummy.next = head;

    fast = slow = &dummy;

    for (int i = 0; i <= n; i++) {

        fast = fast->next;

    } // end of for

    while (fast != NULL) {

        fast = fast->next;
        slow = slow->next;

    } // end of while

    slow->next = slow->next->next;

    return dummy.next;
}