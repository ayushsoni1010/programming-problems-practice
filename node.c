#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *insertinbegn(struct node *head, int data)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->next = head;
    ptr->data = data;
    return ptr;
}
struct node *insertatindex(struct node *head, int data, int index)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    struct node *p = head;
    int i = 0;
    while (i != index - 1)
    {
        p = p->next;
        i++;
    }
    ptr->data = data;
    ptr->next = p->next;
    p->next = ptr;
    return head;
}
struct node *insertatend(struct node *head, int data)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = data;
    struct node *p = head;
    while (p->next != NULL)
    {
        p = p->next;
    }
    p->next = ptr;
    ptr->next = NULL;
    return head;
}

void linkedlisttraversal(struct node *ptr)
{
    while (ptr != NULL)
    {
        printf("Element:%d\n", ptr->data);
        ptr = ptr->next;
    }
}
int main()
{

    struct node *head = 0, *newnode, *temp;
    int choice, mem;
    while (choice)
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        printf("Enter data");
        scanf("%d", &newnode->data);
        newnode->next = 0;
        if (head == 0)
        {
            head = newnode;
            temp = head;
        }
        else
        {
            temp->next = newnode;
            temp = newnode;
        }
        printf("If you wanna insert another element press 1 otherwise 0:");
        scanf("%d", &choice);
    }
    linkedlisttraversal(head);

    printf("Linkedlist After insertion at starting position\n");
    head = insertinbegn(head, 44);
    linkedlisttraversal(head);

    printf("Linkedlist After insertion at random position\n");
    head = insertatindex(head, 22, 2);
    linkedlisttraversal(head);

    printf("Linkedlist After insertion at last position\n");
    head = insertatend(head, 99);
    linkedlisttraversal(head);

    return 0;
}