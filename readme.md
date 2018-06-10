## A "KWIC" Program
### An IT372 assignment

#### _Part 4: The Write-Up_

1. What criteria did you use to decompose the first design?
   
    The criteria I used to decompose the first design is to split up each major
    function. All these functions, including main(), are in one class. The functions
    are called sequentially. All functions are static since main() is static. Every 
    function that are not main() are private.The functions of my class (KWICVersion1.java) are as follows:
    * main(String[] args) : void
    * getLinesFromFile(String filePath) : ArrayList<String> 
    * splitLinesToArrayOfWords(ArrayList<String> arrayListOfLines) : ArrayList<String[]> 
    * circularShiftTheLines(ArrayList<String[]> arrayListOfSplitLines) : ArrayList<String> 
    * alphabetizedTheCircularShiftedLines(ArrayList<String> circularShiftedLines) : ArrayList<String> 
    * printArrayListToConsole(ArrayList<String> arrayListOfAlphabetizedCircularShiftedLines) : void 
    

2. What criteria did you use to decompose the second design?

    The criteria I used to decompose the second design is to split up the major functionalities 
    into their own classes. This approach allows me to use "information hiding" since each class does
    not know how and does not care how a function from another class works.
    All functions that deal with String manipulation have been moved to the
    LineManager class. The function that deals with file reading has been moved into the LineIO class.
    The driver class, KWICVersion2Driver contains the main() function. Every function that are not
    main() are public and not static. See the classes broken down below:
    * LineManager.java
        * splitLinesToArrayOfWords(ArrayList<String> arrayListOfLines) : ArrayList<String[]> 
        * circularShiftTheLines(ArrayList<String[]> arrayListOfSplitLines) : ArrayList<String> 
        * alphabetizedTheCircularShiftedLines(ArrayList<String> circularShiftedLines) : ArrayList<String> 
        * printArrayListToConsole(ArrayList<String> arrayListOfAlphabetizedCircularShiftedLines) : void 
    * LineIO.java
        * getLinesFromFile(String filePath) : ArrayList<String> 
    * KWICVersion2Driver.java
        * main(String[] args) : void  (a static method)
            

3. Which design is more resilient to change? And why?

    The second version is more resilient to change because related functions are placed into separate
    classes. Updating one class will not affect the rest of the program. For example, if I change my
    LineIO class to read from a database instead of a file, this does not affect the rest of the program.
    Or if I changed the LineManager class to use another data structure other than the array list that 
    it currently uses, it will not affect the rest of the program.
    

4. What would have to change in the first design/implementation 
if the file were changed out for a database?

5. What would have to change in the second design/implementation 
if the file were changed out for a database?

6. What would have to change in the first vs second design/implementation 
if we wanted to use a graphical user interface instead of the traditional 
console UI (System.out)?

7. Identify another change that may happen in the future, and how does 
design 1 compare to design 2 when it comes to impact of the change?

8. Which design/implementation is easier to understand?

9. Which design/implementation is better performing?

10. How does the principle of information hiding relate to all of this?
