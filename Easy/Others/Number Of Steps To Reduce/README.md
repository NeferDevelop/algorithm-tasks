<h1 align="center"> Numbe of steps to reduce </h1> 

### Given an integer num, return the number of steps to reduce it to zero.
### In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

 

### **Example 1:**

&nbsp; _Input: num = 14_

&nbsp; _Output: 6_

&nbsp; **Explanation:**

&nbsp;&nbsp; _Step 1) 14 is even; divide by 2 and obtain 7._ 

&nbsp;&nbsp; _Step 2) 7 is odd; subtract 1 and obtain 6._

&nbsp;&nbsp; _Step 3) 6 is even; divide by 2 and obtain 3._

&nbsp;&nbsp; _Step 4) 3 is odd; subtract 1 and obtain 2._ 

&nbsp;&nbsp; _Step 5) 2 is even; divide by 2 and obtain 1._ 

&nbsp;&nbsp; _Step 6) 1 is odd; subtract 1 and obtain 0._

### **Example 2:**

&nbsp; _Input: num = 8_

&nbsp; _Output: 4_

&nbsp; **Explanation:** 

&nbsp;&nbsp; _Step 1) 8 is even; divide by 2 and obtain 4._ 

&nbsp;&nbsp; _Step 2) 4 is even; divide by 2 and obtain 2._ 

&nbsp;&nbsp; _Step 3) 2 is even; divide by 2 and obtain 1._ 

&nbsp;&nbsp; _Step 4) 1 is odd; subtract 1 and obtain 0._

### **Example 3:**

&nbsp; _Input: num = 123_

&nbsp; _Output: 12_

