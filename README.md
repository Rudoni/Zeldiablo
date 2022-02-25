# Zeldiablo

Zelda x diablo game 100% in Java


## How it works?

We have created a very simple game engine combined with a maze generated from text files like this :
```
112111111111111111111
100104000100000100001
100111100100100101001
100100000100100060001
100111100111111101111
100050000100000100001
111100111100100101111
100000400100100100001
100111111111100111001
100000100000040000001
111100100100100111101
100000100100100000171
100100111111100100111
100100000000000105001
100100111111111100111
100100100000100000001
100111101100100100101
100194000100000100101
100111100111100111101
100000050100000100001
111111111111111111131
```

## How to launch it?

The easiest way will be to launch it via an IDE such as intelliJ Idea. However, if you don't have one, you'll need to compile and add the dependencies manually.

# Level and game design

## Game design

The goal is to cross labyrinths full of monsters, avoid traps, and recover the amulet of each level.

## Level design

We used some royalty free assets for the floors and walls, otherwise we drew the assets.

Here are a few : 
* <img src="https://user-images.githubusercontent.com/72690981/155810389-8773aed2-4700-4db7-8a7a-a95ee3a5abc4.png" alt="drawing" width="20"/> The amulet, necessary to pass to the next level
* <img src="https://user-images.githubusercontent.com/72690981/155810392-a3db6ead-209b-41a9-8b9b-0c14a50dca11.png" alt="drawing" width="20"/> The heart, to regain life
* <img src="https://user-images.githubusercontent.com/72690981/155810393-694e036d-dee5-428c-82e3-6a1f5c9ff83c.png" alt="drawing" width="20"/> The ghost, a swift monster that passes through walls
* <img src="https://user-images.githubusercontent.com/72690981/155810395-b992473f-12e2-4d22-aff1-85a17a3d0910.png" alt="drawing" width="20"/> Grass, where we can walk
* <img src="https://user-images.githubusercontent.com/72690981/155810398-ea909d50-a9f4-4bf9-a560-f80442020370.png" alt="drawing" width="20"/> Wall, allows to delimit the map
* <img src="https://user-images.githubusercontent.com/72690981/155810402-af50e4c4-feb5-44a3-b143-43f12fa9cdd9.png" alt="drawing" width="20"/> Adventurer Pol, main character
* <img src="https://user-images.githubusercontent.com/72690981/155810403-20a444ce-c35c-4012-9f6a-4114f38422aa.png" alt="drawing" width="20"/> The trap: will try to swallow you and cause you to lose life
* <img src="https://user-images.githubusercontent.com/72690981/155810405-0694e6bb-5391-42d1-85f5-3ee6ce031c14.png" alt="drawing" width="20"/> The "Rocher-Noerh", considered as a mythical creature of this game, it is imposing, charismatic and will not hesitate to attack you

