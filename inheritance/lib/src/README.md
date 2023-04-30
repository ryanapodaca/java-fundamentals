# Zelp

Welcome to Zelp, an application that allows users to review various establishments
and see the ratings given by others. 
Zelp's architecture includes three establishment classes called Restaurant, Shop, and Theater:
All establishments provide and cache arrayList to collect reviews by customers, which is combined with
a function that also calculates aggregated mean stars upon retrieval.  

The review class allows user to enter their name, rating, and a body for the review. 
A special class extends reviews if a review wishes to specify the movie they saw at the theater. 
If a theater is put into a shop or restaurant, an exception will be thrown.

You can test all the functionality in the LibraryTest.java file. 