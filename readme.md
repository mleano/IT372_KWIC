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

    With the first design, I would have to change the class by creating a new function that will connect to 
    the database. Then I would call that function in main() instead of the function for reading from file. Or
    I can change (and maybe rename) the function for reading from file.

5. What would have to change in the second design/implementation 
if the file were changed out for a database?

    With the second design, my changes would be similar from version 1. However, I would only have to touch
    the LineIO class by creating a new function for reading from a database ()then use this new function in the 
    KWICVersion2Driver class's main() function). Or, I could just change (and maybe rename) LineIO's current 
    function for reading a file so I don't have to change anything from main. The LineManager class isn't
    affected at all.

6. What would have to change in the first vs second design/implementation 
if we wanted to use a graphical user interface instead of the traditional 
console UI (System.out)?

    With both versions of the design, I would have to using functions imported from a GUI library (like
    JavaFX). But with the first version, since everything is in one class, I may just add those additional
    functions into the same class. With the second version, since it already contains information hiding, I 
    can extend that and use separation of concerns and apply the MVC architecture.

7. Identify another change that may happen in the future, and how does 
design 1 compare to design 2 when it comes to impact of the change?
    
    Another change that may happen in the future is having the user enter a filename and even a file location.
    In both versions, I would have to take into account where the file is located (in a file on the hard drive or 
    in a database). I would also have to use Scanner to get keyboard input.
    
    However, in version 1, I will add these functions to the ever growing god class. Each addition could potentially
    affect other functions. With version 2, I would only change the LineIO class to handle the file location 
    selection. User input can be handled in LineIO as well. But I think I would create a whole new class to handle
    user input.

8. Which design/implementation is easier to understand?

    At it's current state, with only 6 functions being used collectively, both are easy to understand. But as more
    and more functions are added, version 1 will be harder and harder to understand.

9. Which design/implementation is better performing?

    Since I implemented both versions similarly (with one separating out the functionalities into different classes), 
    I think version 1 will perform faster since the computer does not need to find a function in another location on 
    the computer. The functions are right there in the same class. 

10. How does the principle of information hiding relate to all of this?

    The principle of information hiding relates to all this because the difference in the implementation of version 1
    and version 2 explains what information hiding is. With version 1, the details of each function are known by all 
    other functions in the class. In version 2, since functions are split between three classes, changes to a function
    in one class does not affect the rest of the program. Details of the implementation in one class does not concern
    the other classes at all. So changing one class will not affect the other classes. Thus, with information
    hiding, the program as a whole is protected from change.
