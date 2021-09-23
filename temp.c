#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *link;
};
struct node *add_beg(struct node *, int);
int main()
{
    // Write C code here
    int n;
    printf("enter number of node which you want to create in linklist : ");
    scanf("%d", &n);
    struct node *head, *newnode, *temp;
    head = 0;
    while (n != 0)
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        printf("\nenter data for %d node : ", n);
        scanf("%d", &newnode->data);
        newnode->link = 0;
        if (head == 0)
        {
            head = temp = newnode;
        }
        else
        {
            temp->link = newnode;
            temp = newnode;
        }
        n--;
    }
    head = add_beg(head, 90);
    temp = head;
    while (temp != 0)
    {
        printf("\t %d", temp->data);
        temp = temp->link;
    }

    return 0;
}
struct node *add_beg(struct node *head1, int x)
{
    struct node *ptr, *newnode;
    ptr = head1;
    newnode = (struct node *)malloc(sizeof(struct node));
    newnode->data = x;
    newnode->link = 0;

    newnode->link = ptr;
    ptr = newnode;
    return ptr;
}