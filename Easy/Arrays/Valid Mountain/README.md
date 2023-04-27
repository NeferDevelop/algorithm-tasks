<h1 align="center"> Valid Mountain </h1>

###Given an array of integers arr, return true if and only if it is a valid mountain array

###Recall that arr is a mountain array if and only if:
  
  
<ul>
<li>arr.length >= 3</li>
<li>There exists some i with 0 < i < arr.length - 1 such that:</li>
<ul>
<li> arr[0] < arr[1] < ... < arr[i - 1] < arr[i] </li>
<li> arr[i] > arr[i + 1] > ... > arr[arr.length - 1] </li>
</ul>
</ul>
Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
