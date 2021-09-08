# PassionProject
A moddable RPG text-adventure, that allows users to edit or add their own game content.

The UI will be built using a 'console', hosted on a webpage. The entire application will take place on a single page, using Angular as a framework. 
The game will be entirely text based, where users will read about the actions and environment in the game, and interact by physically typing into a text box,
either entering commands or numbers associated with a list of menu options. 

The game will save to a database built in MySQL, with a backend built in Spring, and a frontend built with JavaScript/Typescript and Angular. Users will have a
profile associated with their account, which will track the progress of their game and allow them to navigate away from the webpage, and return later to continue
where they left off. 

The primary feature that makes this project unique will be high moddability. Users will be able to create their own assets for the game, including characters, 
equipment, NPCs and even enemies. This will all be done through the same interface they use to play the game itself. Users will not be required to upload or
download any files or software to mod their game, rather the configurations that result from their modding will be saved into the database itself, and loaded
into the game by the database. 

The game itself will contain a premade adventure for users to take part in.

Js/Ts will be used to form the engine of the game, which will include
-Character classes
-Equipment classes and subclasses
-NPC classes
-Location classes (areas like maps)
-Structure (buildings, towns, enterable locations) classes/subclases
-Item classes/subclasses
-Navigation class
-Menu class/subclasses
-Input class
-Output class
-Creation Class (will be used to interface with and assist in the creation of the above mentioned classes, in the case of modding)



