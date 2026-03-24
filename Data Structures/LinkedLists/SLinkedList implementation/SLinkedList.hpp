#ifndef SLinkedList_H
#define SLinkedList_H

#include <algorithm>

template <typename Object>
class SLinkedList {
    private: 
        struct Node {
            int data = 0;
            Node* next = nullptr;
            Node() {}
            Node(int inputData, Node* nextNode=nullptr) : 
            data(inputData), next (nextNode) {

            }
        };

        int size_ = 0;
        Node* head_ = nullptr;

    public:
        ForwardList();

        ~ForwardList();

        ForwardList(std::init)
}


#endif