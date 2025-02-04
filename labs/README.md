### **Lab: Array Manipulation and In-place Sorting (Java)**

#### **Objective:**
The goal of this lab is to practice working with arrays and applying in-place algorithms. You will solve three problems involving array manipulation: reversing an array in place, removing a specific element from an array, and sorting an array with specific constraints.

---

### **Problem 1: Reverse the Word in Place**

**Description:**

Given an array of characters representing a word, reverse the word in place **without creating a new array**. You can create new variables, but the array itself must be rearranged in place.

For example:

- Input: `['h', 'e', 'l', 'l', 'o']`
- Output: `['o', 'l', 'l', 'e', 'h']`

**Requirements:**
- The array must be reversed in place.
- No new array can be created.
- You are allowed to create new variables for tracking indices or performing swaps.

**Hint:**
Use a two-pointer technique to swap elements from both ends of the array towards the middle.

---

### **Problem 2: Remove All Occurrences of a Value**

**Description:**

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in the array in place. The order of the remaining elements may be changed. Then, return the number of elements in the array that are not equal to `val`.

For example:

- Input: `nums = [3, 2, 2, 3, 4, 5, 3]`, `val = 3`
- Output: `4` (The first 4 elements are now `[2, 2, 4, 5]`).

**Requirements:**
- Modify the array in place.
- The remaining elements should not be in any specific order.
- Return the number of elements that are not equal to `val`.

**Hint:**
Use a two-pointer technique where one pointer tracks the current index and the other tracks where the next valid element should go.

---

## **Problem 3: Reverse Vowels of a String**

### **Problem Statement**
Given a string `s`, reverse **only** all the vowels in the string and return it.

The vowels are `'a', 'e', 'i', 'o', 'u'` (both **lowercase** and **uppercase**).

### **Examples**

#### **Example 1**
**Input:**
```plaintext
s = "IceCreAm"
```
---

### **Lab Instructions:**

1. **For Problem 1 (Reverse the Word):**
   - Implement an in-place solution to reverse the array of characters.
   - Use a two-pointer technique to swap elements from both ends of the array towards the center.
   - Ensure the array is modified in place.

2. **For Problem 2 (Remove All Occurrences of a Value):**
   - Implement an in-place solution to remove all occurrences of the given value.
   - Use a two-pointer approach to shift elements and remove the unwanted value.
   - Return the count of elements that are not equal to the given value.