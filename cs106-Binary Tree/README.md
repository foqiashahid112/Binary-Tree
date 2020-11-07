## CS 106 Lab 5 - Binary Trees

Name:Foqia Shahid

Number of Late Days Using for this lab: 0

---

### Analysis Questions

1. In Lab 3 we used insertion sort with Linked Lists to gradually build up
a sorted list of names. If the total number of names is n, what was the big-O runtime
of this algorithm? Briefly explain your answer.
O(n^2) because the new element needs to be compared with each item in the linked list each time 
so 1+2+...+n = n(n+1)/2 times where n is them number of names

2. In this assignment (Lab 5) we used insertion sort with a Binary Tree, then
used a tree traversal to obtain a sorted list of candidates. If the total
number of candidates is n, what is the big-O runtime of this algorithm? Briefly 
explain your answer.
Insertion sort time complexity is O(nlog(n)) (as discussed in class)
Traversal would have time complexity 0(n) because each candidate is visited once to create a sorted list. 
Adding these 2, we get nlog(n) + n = n(log(n)+1) 
Thus, time complexity for this algorithm is O(nlog(n))
---

### Lab Questionnaire

(None of your answers below will affect your grade; this is to help refine lab
assignments in the future)

1. Approximately, how many hours did you take to complete this lab? (provide
  your answer as a single integer on the line below) 8

2. How difficult did you find this lab? (1-5, with 5 being very difficult and 1
  being very easy) 4

3. Describe the biggest challenge you faced on this lab: working with recursion generally is a bit confusing

4. Was the **VerifyFormat** file useful to you during testing? yes. 
