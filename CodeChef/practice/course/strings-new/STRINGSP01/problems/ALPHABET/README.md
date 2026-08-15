# [Studying-Alphabet](https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/ALPHABET?tab=statement)

> **Platform:** `CodeChef`  
> **Direct Link:** [Open Problem Statement](https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/ALPHABET?tab=statement)

---

### 📖 Problem Statement
Not everyone probably knows that Chef has younger brother Jeff. Currently Jeff learns to read.

He knows some subset of the letter of Latin alphabet. In order to help Jeff to study, Chef gave him a book with the text consisting of **N** words. Jeff can read a word if it consists only of the letters he knows.

Now Chef is curious about which words his brother will be able to read, and which are not. Please help him!


### Constraints


- **1** ≤ **|S|** ≤ **26**
- **1** ≤ **N** ≤ **1000**
- **1** ≤ **|Wi|** ≤ **12**
- Each letter will appear in **S** no more than once.
- **S, Wi** consist only of lowercase Latin letters.


### Subtasks


- **Subtask #1 (31 point)**: **|S|** = **1**, i.e. Jeff knows only one letter.
- **Subtask #2 (69 point)**	: no additional constraints


### Explanation:


The first word can be read.
The second word contains the letters d, o and g that aren't known by Jeff.

---

### 📥 Input Specification
The first line of the input contains a lowercase Latin letter string **S**, consisting of the letters Jeff can read. Every letter will appear in **S** no more than once.

The second line of the input contains an integer **N** denoting the number of words in the book.

Each of the following **N** lines contains a single lowercase Latin letter string **Wi**, denoting the **i**^th word in the book.

---

### 📤 Output Specification
For each of the words, output `"Yes"` (without quotes) in case Jeff can read it, and `"No"` (without quotes) otherwise.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```text
act
2
cat
dog
```

**Output:**
```text
Yes
No
```


---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | Solution File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | cc_1786770858128 | 8/15/2026, 10:44:23 AM | ✅ Accepted | 0 ms | 0 KB | Python3 | [`cc_1786770858128_Attempt_1_AC.py`](./cc_1786770858128_Attempt_1_AC.py) |
| 2 | cc_1786771143270 | 8/15/2026, 10:49:08 AM | ✅ Accepted | 0 ms | 0 KB | Python3 | [`cc_1786771143270_Attempt_2_AC.py`](./cc_1786771143270_Attempt_2_AC.py) |
| 3 | cc_1786771157015 | 8/15/2026, 10:49:21 AM | ❌ Wrong Answer | 0 ms | 0 KB | C++ | [`cc_1786771157015_Attempt_3_WA.cpp`](./cc_1786771157015_Attempt_3_WA.cpp) |
