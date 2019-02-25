# Introduction 
This was a result of a fairly silly situation that developed at an older comapny of mine. We were using direct string comparissons for older URLs from one of our older sites that was powered by .NET but moved to a Java based CMS system. The biggest problem was how the older system handled query strings. If I had an older URL like this;

```
http://www.example.com?q1=1&q2=1
```

It couldn't actually recognize the url if it was entered like this;

```
http://www.example.com?q2=1&q1=1
```

Most websites should be able to handle the order of query strings despite the ordering they are entered, but in this system's case, it couldn't. Needless to say, this Java system was designed to handle this by creating all possible query string combinations (tested with up to 5 different parameters) and then make the needed comparissons to tell the system the new URL to redirect to.

In the spirit of software engineering, this was created as a purely separate module that can be imported to other systems by itself. Essentially, resuable code.

## Disclaimer
This was originally written using Eclipse and now has been debuged and compiled using Visual Studio Code.

## InitializeSet.java
Base init class with a test case to determine if the code compiles and runs as expected.

## SetOrganizer.java
The classm where all of the magic happens. We take an array of all parameters and create the required number of elements that represent all possible combinations.