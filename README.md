# InsightDataScienceCodingProject
Insight Data Science Coding Project

<h1>Functions</h1>

<p>This project implements 3 main functions:</p>

1. Calculate the total number of times each word has been tweeted.
2. Calculate the median number of unique words per tweet, and update this median as tweets come in.
3. Return the word that has been tweeted with highest frequency.
4. Show the hashtag(#xxx) that appeared with the highest frequency.

<h1>Running Environment</h1>
<p>jdk 1.6</p>
<p>operating system: max OS X</p>

<h1>Instructions for the algorithm</h1>
1. I use TreeMap to store the word and the times it has been tweeted, because in JAVA, TreeMap is an ordered map(in alphabet order)
2. I use regular expression to split the tweet to get each word and then count the times it has been tweeted.
