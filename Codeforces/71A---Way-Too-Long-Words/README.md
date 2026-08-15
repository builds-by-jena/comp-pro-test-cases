# [71A---Way-Too-Long-Words](https://codeforces.com/problemset/problem/71/A)

> **Platform:** `Codeforces` | **Time Limit:** `1 second` | **Memory Limit:** `256 megabytes`  
> **Direct Link:** [Open Problem Statement](https://codeforces.com/problemset/problem/71/A)

---

### 📖 Problem Statement
Sometimes some words like " `localization` " or " `internationalization` " are so long that writing them many times in one text is quite tiresome.

Let's consider a word too long, if its length is strictly more than  *10*  characters. All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, " `localization` " will be spelt as " `l10n` ", and " `internationalization` » will be spelt as " `i18n` ".

You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

---

### 📥 Input Specification
The first line contains an integer  *n*  ( *1 ≤ n ≤ 100* ). Each of the following  *n*  lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from  *1*  to  *100*  characters.

---

### 📤 Output Specification
Print  *n*  lines. The  *i* -th line should contain the result of replacing of the  *i* -th word from the input data.

---

### 🧪 Sample Tests

#### Example 1
**Input:**
```text
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis
```

**Output:**
```text
word
l10n
i18n
p43s
```


---

### 📊 Submission History
| Attempt | Submission ID | Date & Time | Verdict | Runtime | Memory | Language | Solution File |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 1 | 385216621 | Aug/02/2026 06:40UTC+5.5 | ❌ Wrong answer on test 1 | 46 ms | 0 KB | C++20 (GCC 13-64) | [`385216621_Attempt_1_WA.cpp`](./385216621_Attempt_1_WA.cpp) |
| 2 | 385216932 | Aug/02/2026 06:52UTC+5.5 | ❌ Wrong answer on test 2 | 15 ms | 0 KB | C++20 (GCC 13-64) | [`385216932_Attempt_2_WA.cpp`](./385216932_Attempt_2_WA.cpp) |
| 3 | 385216950 | Aug/02/2026 06:52UTC+5.5 | ❌ Wrong answer on test 1 | 46 ms | 0 KB | C++20 (GCC 13-64) | [`385216950_Attempt_3_WA.cpp`](./385216950_Attempt_3_WA.cpp) |
| 4 | 385216959 | Aug/02/2026 06:52UTC+5.5 | ❌ Wrong answer on test 1 | 15 ms | 0 KB | C++20 (GCC 13-64) | [`385216959_Attempt_4_WA.cpp`](./385216959_Attempt_4_WA.cpp) |
| 5 | 385217038 | Aug/02/2026 06:56UTC+5.5 | ❌ Wrong answer on test 2 | 0 ms | 0 KB | C++20 (GCC 13-64) | [`385217038_Attempt_5_WA.cpp`](./385217038_Attempt_5_WA.cpp) |
| 6 | 385217165 | Aug/02/2026 07:00UTC+5.5 | ❌ Compilation error | 0 ms | 0 KB | C++20 (GCC 13-64) | [`385217165_Attempt_6_CE.cpp`](./385217165_Attempt_6_CE.cpp) |
| 7 | 385217185 | Aug/02/2026 07:01UTC+5.5 | ❌ Runtime error on test 1 | 0 ms | 0 KB | C++20 (GCC 13-64) | [`385217185_Attempt_7_RTE.cpp`](./385217185_Attempt_7_RTE.cpp) |
| 8 | 385217199 | Aug/02/2026 07:01UTC+5.5 | ❌ Time limit exceeded on test 1 | 1000 ms | 0 KB | C++20 (GCC 13-64) | [`385217199_Attempt_8_TLE.cpp`](./385217199_Attempt_8_TLE.cpp) |
| 9 | 385217212 | Aug/02/2026 07:01UTC+5.5 | ✅ Accepted | 46 ms | 100 KB | C++20 (GCC 13-64) | [`385217212_Attempt_9_AC.cpp`](./385217212_Attempt_9_AC.cpp) |
| 10 | 385217223 | Aug/02/2026 07:02UTC+5.5 | ✅ Accepted | 31 ms | 0 KB | C++20 (GCC 13-64) | [`385217223_Attempt_10_AC.cpp`](./385217223_Attempt_10_AC.cpp) |
| 11 | 385217230 | Aug/02/2026 07:02UTC+5.5 | ✅ Accepted | 31 ms | 0 KB | C++20 (GCC 13-64) | [`385217230_Attempt_11_AC.cpp`](./385217230_Attempt_11_AC.cpp) |
| 12 | 385217513 | Aug/02/2026 07:11UTC+5.5 | ❌ Compilation error | 0 ms | 0 KB | C++20 (GCC 13-64) | [`385217513_Attempt_12_CE.cpp`](./385217513_Attempt_12_CE.cpp) |
| 13 | 385217524 | Aug/02/2026 07:12UTC+5.5 | ❌ Runtime error on test 1 | 31 ms | 0 KB | C++20 (GCC 13-64) | [`385217524_Attempt_13_RTE.cpp`](./385217524_Attempt_13_RTE.cpp) |
| 14 | 385217533 | Aug/02/2026 07:12UTC+5.5 | ❌ Time limit exceeded on test 1 | 1000 ms | 0 KB | C++20 (GCC 13-64) | [`385217533_Attempt_14_TLE.cpp`](./385217533_Attempt_14_TLE.cpp) |
| 15 | 385217702 | Aug/02/2026 07:17UTC+5.5 | ❌ Compilation error | 0 ms | 0 KB | C++20 (GCC 13-64) | [`385217702_Attempt_15_CE.cpp`](./385217702_Attempt_15_CE.cpp) |
| 16 | 385217800 | Aug/02/2026 07:20UTC+5.5 | ❌ Runtime error on test 1 | 15 ms | 0 KB | C++20 (GCC 13-64) | [`385217800_Attempt_16_RTE.cpp`](./385217800_Attempt_16_RTE.cpp) |
| 17 | 385217813 | Aug/02/2026 07:20UTC+5.5 | ❌ Time limit exceeded on test 1 | 1000 ms | 0 KB | C++20 (GCC 13-64) | [`385217813_Attempt_17_TLE.cpp`](./385217813_Attempt_17_TLE.cpp) |
| 18 | 385217833 | Aug/02/2026 07:21UTC+5.5 | ❌ Compilation error | 0 ms | 0 KB | C++20 (GCC 13-64) | [`385217833_Attempt_18_CE.cpp`](./385217833_Attempt_18_CE.cpp) |
| 19 | 385217853 | Aug/02/2026 07:21UTC+5.5 | ✅ Accepted | 31 ms | 100 KB | C++20 (GCC 13-64) | [`385217853_Attempt_19_AC.cpp`](./385217853_Attempt_19_AC.cpp) |
| 20 | 385217904 | Aug/02/2026 07:23UTC+5.5 | ✅ Accepted | 46 ms | 0 KB | C++20 (GCC 13-64) | [`385217904_Attempt_20_AC.cpp`](./385217904_Attempt_20_AC.cpp) |
| 21 | 387102600 | Aug/15/2026 09:52UTC+5.5 | ✅ Accepted | 31 ms | 100 KB | C++20 (GCC 13-64) | [`387102600_Attempt_21_AC.cpp`](./387102600_Attempt_21_AC.cpp) |
