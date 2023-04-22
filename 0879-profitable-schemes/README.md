<h2><a href="https://leetcode.com/problems/profitable-schemes/">879. Profitable Schemes</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There is a group of <code style="user-select: auto;">n</code> members, and a list of various crimes they could commit. The <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> crime generates a <code style="user-select: auto;">profit[i]</code> and requires <code style="user-select: auto;">group[i]</code> members to participate in it. If a member participates in one crime, that member can't participate in another crime.</p>

<p style="user-select: auto;">Let's call a <strong style="user-select: auto;">profitable scheme</strong> any subset of these crimes that generates at least <code style="user-select: auto;">minProfit</code> profit, and the total number of members participating in that subset of crimes is at most <code style="user-select: auto;">n</code>.</p>

<p style="user-select: auto;">Return the number of schemes that can be chosen. Since the answer may be very large, <strong style="user-select: auto;">return it modulo</strong> <code style="user-select: auto;">10<sup style="user-select: auto;">9</sup> + 7</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 5, minProfit = 3, group = [2,2], profit = [2,3]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> To make a profit of at least 3, the group could either commit crimes 0 and 1, or just crime 1.
In total, there are 2 schemes.</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 10, minProfit = 5, group = [2,3,5], profit = [6,7,8]
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> To make a profit of at least 5, the group could commit any crimes, as long as they commit one.
There are 7 possible schemes: (0), (1), (2), (0,1), (0,2), (1,2), and (0,1,2).</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= minProfit &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= group.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= group[i] &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">profit.length == group.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= profit[i] &lt;= 100</code></li>
</ul>
</div>