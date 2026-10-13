/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {

    struct ListNode *fast, *slow;

    fast = slow = head;

    while (fast != NULL && fast->next != NULL) {

        fast = fast->next->next;
        slow = slow->next;

    } // end of while

    return slow;
}