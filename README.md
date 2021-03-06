# Help!
This README will walk you through the steps of downloading and modifying our code to implement our game!
Skip to the "Pokemon Game" section if you already have your code pulled up on IntelliJ

#### Vocabulary (I know, this is starting to feel like school, ugh)
* Directory: This is a place in your computer where files can be stored, lots of people call this a "folder".
* Repository: A place where we can store code for a project on Github.
* Initialize: To give something a starting value


## Set up

#### _Read this section to get the project code onto IntelliJ for the first time!_

You should be on the main page for this project now, which you can find at this link: [https://github.com/reid-sutherland/Pokemon](https://github.com/reid-sutherland/Pokemon)

### Download Project
First, we need to "clone" our code from the "repository" where our starting code can be found
  1. Click the green **Clone or download** button on the right side of the screen
  2. Click **Download Zip**
The Project will be downloaded as a "zip" file, and it will be placed in your local "Downloads" directory
  1. Open a Finder window
  2. Click the "Downloads" directory on the left side of the window
  3. Click and drag the **Pokemon-master.zip** file to your "Documents" directory, which is also on the left side
To _un-zip_ the zip file... 
  1. Navigate to your Documents directory in Finder
  2. Double-click the **Pokemon-master.zip** file
  3. A folder should pop up with the name **Pokemon-master**
  4. If so, then you can delete the zip file, or leave it there

### Import Project to IntelliJ
Now, we need to import our project code to IntelliJ so we can make changes, and test our work
   1. First, open IntelliJ by double-clicking the "IJ" icon in the toolbar (Mac computers call this a Dock) at the bottom of your desktop
   2. From the pop-up menu, select **Import Project**
   3. Find your Documents directory. If you can't find it in the menu that pops up, ask me for help, I don't know exactly what your computer's filesystem looks like
   4. Click on the Pokemon-master directory, then click the blue **OK** button. This should cause a new window to pop up.
From here, IntelliJ gives you a lot of options to choose from when building your project.
For this class, we just need the basic options:
   1. Click the blue **Next** button at the bottom of the window
   2. Keep clicking the **Next** button, we just need the default settings
   3. Eventually the **Next** button will change to **Finish**. Click **Finish** and your project should open up in the editor window
   
##### Now we have our project open in our editor window!

### Make your code runnable
To make our code runnable, we need to add a build configuration (you don't have to know what this means) :)
   1. First, click the **Add Configuration** box in the top right corner. There should be no configurations yet
   2. Click the plus icon (+) in the top left corner
   3. From the drop down menu, select _Application_. A lot of options should pop up.
   4. Change the _Name:_ field, at the top of the window, to "Pokemon". This can technically be whatever you want to name it.
   5. In the _Main Class:_ field, write "Main", exactly as I have written it. This tells IntelliJ where to look to start running your code
      * Don't select any of the options for "Main" that popup in the drop-down menu, just write Main and stop.
   6. Click the blue **OK** button at the bottom
   
   
## Build and run your code
### Build
Now, you should be able to click the **Build** button (the green hammer in the top right) to build your code. Every time you make a change to your program, you will have to re-build it so that it can make sure your changes don't cause errors. If there are errors,  you will have to fix them and re-build again until you get a successful build.
### Run
After your program has been successfully built, you should be able to run the code by clicking the **Run** button (the green arrow in the top right)



# Pokemon Game

### Get started
Now we can take a look at the code. 
* On the left side of your IntelliJ window, there should be a "directory-tree" that shows your project directory. 
* Click on the arrow next to a directory to open it.
* To get to our main code, open Pokemon-master -> src -> Game. 
* Double click on "Game" to open up our game's code. 
* This file is called a **_Class_**. Java is entirely focused on using classes to make things happen. Most of this project will just involve editing and adding things to the _Game_ class.


### To Do!
Let's talk about how we can make our game better. 
* Right now, we can look for Pokemon, check our bag to see how many Pokeballs we have, and quit. 
* If the player enters 'A' as their choice, then the code takes them to the section where they look for Pokemon. 

Take a look at this screenshot showing the "Look for Pokemon" code

![alt text](https://github.com/reid-sutherland/Pokemon/blob/master/code_snippet_1.png "Look For Pokemon code")

1. At 1, the JOptionPane._showMessageDialog()_ function is used to display a message to the user, that a Pokemon has appeared.
2. At 2, the **random**.nextInt() function is used to get a random integer. We put "2" inside the parentheses so that a value between 0 and 2 will be picked randomly. We store that random number in the integer variable _whichPokemon_.
3. At 3, we use **if - else** statements to determine which Pokemon was found, based on the variable _whichPokemon_. The message gets changed according to which Pokemon was found.
4. At 4, we ask the user if they want to try to catch the Pokemon. If they select yes, then the **if** statement at 5 will be true, which means we will execute that code. Otherwise, the **if** statement will be false, which means we will execute the **else** statement at 6.
5. This is where we will make some changes! This is where the player is trying to catch the Pokemon.

Copy and paste these two lines of code into the **if** statement at 5, and then try building and running your game again to see what happens:

```java
boolean pokemonFound = false;

while (pokemonFound == false) {

    int chance = random.nextInt(100);

    JOptionPane.showMessageDialog(null, Integer.toString(chance));

}
```
You should notice that this will just print a new random number over an over again. We can use this code to evaluate the player's "chance" of catching the Pokemon.
Now, let's try giving the player a chance to catch the Pokemon.
Look at the if statements at the "3" section in the screenshot from before. We are going to want to use another **if** statement here to see if the player caught the Pokemon.
For example, if the "chance" variable is above, say, 50, then we can pretend the player successfully caught the Pokemon.
```java
if (chance > 50) {
  // They caught the Pokemon!
}
else {
  // They didn't catch the Pokemon, they need to try again!
}
```
Replace the JOptionPane function call that we just added with these if statements above.

Also, we should reduce the player's Pokeball count by 1 each time they try to catch a Pokemon. See if you can figure out where to put this statement in code.
```java
numPokeballs--;
```

If they catch the Pokemon, we should change the "looping condition" to true so that we know they are done throwing Pokeballs
```java
pokemonFound = true;
```

After the loop, you should tell the player which Pokemon they caught! If you are stuck, try using the **if** statements from section 3 in the screenshot above as a starting point.

After all this, if your code is working, try catching a Pokemon, and then checking your bag afterwards to see how many Pokeballs you have left!

##### Have fun! :)





## TO-DO list
* Use if statements to determine if the player successfully caught the Pokemon. You can make it hard to catch the Pokemon making the **if** number higher, or make it easier to catch by making the number lower
* Tell the player which Pokemon they caught
* Reduce the player's number of Pokeballs by 1 each time they fail or succeed on a throw.

