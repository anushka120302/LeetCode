<h2><a href="https://leetcode.com/problems/merge-strings-alternately/">1768. Merge Strings Alternately</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given two strings <code style="user-select: auto;">word1</code> and <code style="user-select: auto;">word2</code>. Merge the strings by adding letters in alternating order, starting with <code style="user-select: auto;">word1</code>. If a string is longer than the other, append the additional letters onto the end of the merged string.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the merged string.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> word1 = "abc", word2 = "pqr"
<strong style="user-select: auto;">Output:</strong> "apbqcr"
<strong style="user-select: auto;">Explanation:</strong>&nbsp;The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> word1 = "ab", word2 = "pqrs"
<strong style="user-select: auto;">Output:</strong> "apbqrs"
<strong style="user-select: auto;">Explanation:</strong>&nbsp;Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> word1 = "abcd", word2 = "pq"
<strong style="user-select: auto;">Output:</strong> "apbqcd"
<strong style="user-select: auto;">Explanation:</strong>&nbsp;Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= word1.length, word2.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">word1</code> and <code style="user-select: auto;">word2</code> consist of lowercase English letters.</li>
</ul></div>