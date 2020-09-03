package com.hillel.task13.list;

public class List {
    private SingleLinkedList head;

    public List() {
        head = null;
    }

    public List(Object[] ob) {
        head = null;
        for (int i = 0; i < ob.length; i++){
            add(ob[i]);
        }
    }

    // Check whether the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Add to the head of the list
    public void add(Object ob) {
        SingleLinkedList temp = new SingleLinkedList(ob);
        temp.next = head;
        head = temp;
    }

    // Remove from the head of the list
    public void removeFromHead() {
        head = head.next;
    }

    // Remove from the tail of the list
    public void removeFromTail() {
        byte i = 0;
        SingleLinkedList tail = null;
        while (i < 1){
            if (head.next == null){
                tail = head;
                i++;
            }
            head = head.next;
        }
        tail.value = null;
    }

    // Removing node by its value
    public void removeByValue(Object ob) {
        SingleLinkedList current = head;
        SingleLinkedList previous = head;
        while (current.value != ob){
            if (isEmpty()){
                System.out.println("The list is empty");
                return;
            }else {
                previous = current;
                current = current.next;
            }
            if (current == head){
                head = head.next;
            }else {
                previous.next = current.next;
            }
        }
    }

    // Printing the list out
    public void print() {
        SingleLinkedList temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // Exchanging of two list nodes
    public void exchange(Object firstEl, Object secondEl) {
        SingleLinkedList temp = head;
        int count = 0;
        if (isEmpty()) return;

        while (temp != null) {
            if (temp.value == firstEl || temp.value == secondEl) {
                count++;
            }
            temp = temp.next;
        }
        if (count != 2) {
            System.out.println("Element(s) not found");
        } else {
            temp = head;
            while (temp != null) {
                if (temp.value == firstEl) {
                    temp.value = secondEl;
                } else if (temp.value == secondEl) {
                    temp.value = firstEl;
                }
                temp = temp.next;
            }
        }
    }

    // List elements counting
    public int noOfListElements(){
        int count = 0;
        SingleLinkedList temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
