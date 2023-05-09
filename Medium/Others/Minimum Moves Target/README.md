<h1 align="center">Minimum moves to reach target score</h1>

### You are playing a game with integers. You start with the integer 1 and you want to reach the integer target. In one move, you can either:

### <b> Increment </b> the current integer by one (i.e., x = x + 1).
### <b> Double </b> the current integer (i.e., x = 2 * x).

### You can use the <b>increment</b> operation <b>any</b> number of times, however, you can only use the <b>double</b> operation <b>at most</b> maxDoubles times.
### Given the two integers target and maxDoubles, return the minimum number of moves needed to reach target starting with 1.

### Example 1:

&nbsp; _Input: target = 5, maxDoubles = 0_

&nbsp; _Output: 4_

&nbsp; **Explanation:** 

&nbsp;&nbsp; _Keep incrementing by 1 until you reach target._

### Example 2:

&nbsp; _Input: target = 19, maxDoubles = 2_

&nbsp; _Output: 7_

&nbsp; **Explanation:** <ul>
&nbsp; <li><em>Initially, x = 1</em></li>
&nbsp; <li><em>Increment 3 times so x = 4</em></li>
&nbsp; <li><em>Double once so x = 8</em></li>
&nbsp; <li><em>Increment once so x = 9</em></li>
&nbsp; <li><em>Double again so x = 18</em></li>
&nbsp; <li><em>Increment once so x = 19</em></li>
</ul>

### Example 3:
&nbsp; _Input: target = 10, maxDoubles = 4_

&nbsp; _Output: 4_

&nbsp; **Explanation:** <ul>
&nbsp; <li><em>Initially, x = 1</em></li>
&nbsp; <li><em>Increment once so x = 2</em></li>
&nbsp; <li><em>Double once so x = 4</em></li>
&nbsp; <li><em>Increment once so x = 5</em></li>
&nbsp; <li><em>Double again so x = 10</em></li>
</ul>

