#!/bin/sh

#run.sh input files: ./tweet_input/tweets.txt

#first function
javac words_tweeted.java
java words_tweeted ./tweet_input/tweets.txt ./tweet_output/ft1.txt

#second function
javac median_unique.java
java median_unique ./tweet_input/tweets.txt ./tweet_output/ft2.txt

#third function
javac hottest_word.java
java hottest_word ./tweet_input/tweets.txt ./tweet_output/ft3.txt

#fourth function
javac hottest_hashtag.java
java hottest_hashtag ./tweet_input/tweets.txt ./tweet_output/ft4.txt
