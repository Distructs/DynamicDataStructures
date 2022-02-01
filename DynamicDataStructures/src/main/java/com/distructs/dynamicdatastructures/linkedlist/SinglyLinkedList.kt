package com.distructs.dynamicdatastructures.linkedlist

class SinglyLinkedList<T>() {
    private data class SinglyLinkedListNode<T>(var data: T, var next: SinglyLinkedListNode<T>? = null)

    private var head: SinglyLinkedListNode<T>? = null
}