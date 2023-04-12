<h2><a href="https://leetcode.com/problems/count-total-number-of-colored-cells/">2579. Count Total Number of Colored Cells</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There exists an infinitely large two-dimensional grid of uncolored unit cells. You are given a positive integer <code style="user-select: auto;">n</code>, indicating that you must do the following routine for <code style="user-select: auto;">n</code> minutes:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">At the first minute, color <strong style="user-select: auto;">any</strong> arbitrary unit cell blue.</li>
	<li style="user-select: auto;">Every minute thereafter, color blue <strong style="user-select: auto;">every</strong> uncolored cell that touches a blue cell.</li>
</ul>

<p style="user-select: auto;">Below is a pictorial representation of the state of the grid after minutes 1, 2, and 3.</p>
<img alt="" src="https://assets.leetcode.com/uploads/2023/01/10/example-copy-2.png" style="width: 500px; height: 279px; user-select: auto;">
<p style="user-select: auto;">Return <em style="user-select: auto;">the number of <strong style="user-select: auto;">colored cells</strong> at the end of </em><code style="user-select: auto;">n</code> <em style="user-select: auto;">minutes</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 1
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> After 1 minute, there is only 1 blue cell, so we return 1.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 2
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> After 2 minutes, there are 4 colored cells on the boundary and 1 in the center, so we return 5. 
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>