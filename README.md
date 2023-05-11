# Battleship
Battleship is a strategy type guessing game for two players. It is played on ruled grids (paper or board) on which each player's fleet of warships are marked. The locations of the fleets are concealed from the other player. Players alternate turns calling "shots" at the other player's ships, and the objective of the game is to destroy the opposing player's fleet.

## Example

<pre>
  1 2 3 4 5 6 7 8 9 10
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

Enter the coordinates of the Aircraft Carrier (5 cells):

> F3 F7

  1 2 3 4 5 6 7 8 9 10
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ O O O O O ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

Enter the coordinates of the Battleship (4 cells):

> A1 D1

  1 2 3 4 5 6 7 8 9 10
A O ~ ~ ~ ~ ~ ~ ~ ~ ~
B O ~ ~ ~ ~ ~ ~ ~ ~ ~
C O ~ ~ ~ ~ ~ ~ ~ ~ ~
D O ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ O O O O O ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

Enter the coordinates of the Submarine (3 cells):

> J7 J10

Error! Wrong length of the Submarine! Try again:

> J10 J8

  1 2 3 4 5 6 7 8 9 10
A O ~ ~ ~ ~ ~ ~ ~ ~ ~
B O ~ ~ ~ ~ ~ ~ ~ ~ ~
C O ~ ~ ~ ~ ~ ~ ~ ~ ~
D O ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ O O O O O ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ O O O

Enter the coordinates of the Cruiser (3 cells):

> B9 D8

Error! Wrong ship location! Try again:

> B9 D9

  1 2 3 4 5 6 7 8 9 10
A O ~ ~ ~ ~ ~ ~ ~ ~ ~
B O ~ ~ ~ ~ ~ ~ ~ O ~
C O ~ ~ ~ ~ ~ ~ ~ O ~
D O ~ ~ ~ ~ ~ ~ ~ O ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ O O O O O ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ O O O

Enter the coordinates of the Destroyer (2 cells):

> E6 D6

Error! You placed it too close to another one. Try again:

> I2 J2

  1 2 3 4 5 6 7 8 9 10
A O ~ ~ ~ ~ ~ ~ ~ ~ ~
B O ~ ~ ~ ~ ~ ~ ~ O ~
C O ~ ~ ~ ~ ~ ~ ~ O ~
D O ~ ~ ~ ~ ~ ~ ~ O ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ O O O O O ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ O ~ ~ ~ ~ ~ ~ ~ ~
J ~ O ~ ~ ~ ~ ~ O O O

The game starts!

  1 2 3 4 5 6 7 8 9 10
A ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

Take a shot!

> A1

  1 2 3 4 5 6 7 8 9 10
A X ~ ~ ~ ~ ~ ~ ~ ~ ~
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

You hit a ship! Try again:

> A2

  1 2 3 4 5 6 7 8 9 10
A X M ~ ~ ~ ~ ~ ~ ~ ~
B ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

You missed. Try again:

> B1

  1 2 3 4 5 6 7 8 9 10
A X M ~ ~ ~ ~ ~ ~ ~ ~
B X ~ ~ ~ ~ ~ ~ ~ ~ ~
C ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

You hit a ship! Try again:

> C1

  1 2 3 4 5 6 7 8 9 10
A X M ~ ~ ~ ~ ~ ~ ~ ~
B X ~ ~ ~ ~ ~ ~ ~ ~ ~
C X ~ ~ ~ ~ ~ ~ ~ ~ ~
D ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

You hit a ship! Try again:

> D1

  1 2 3 4 5 6 7 8 9 10
A X M ~ ~ ~ ~ ~ ~ ~ ~
B X ~ ~ ~ ~ ~ ~ ~ ~ ~
C X ~ ~ ~ ~ ~ ~ ~ ~ ~
D X ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

You sank a ship! Specify a new target:

> E4

  1 2 3 4 5 6 7 8 9 10
A X M ~ ~ ~ ~ ~ ~ ~ ~
B X ~ ~ ~ ~ ~ ~ ~ ~ ~
C X ~ ~ ~ ~ ~ ~ ~ ~ ~
D X ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ M ~ ~ ~ ~ ~ ~
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

You missed. Try again:

> C9

  1 2 3 4 5 6 7 8 9 10
A X M ~ ~ ~ ~ ~ ~ ~ ~
B X ~ ~ ~ ~ ~ ~ ~ ~ ~
C X ~ ~ ~ ~ ~ ~ ~ X ~
D X ~ ~ ~ ~ ~ ~ ~ ~ ~
E ~ ~ ~ M ~ ~ ~ ~ ~ ~
F ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
G ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
H ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
I ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
J ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

You hit a ship! Try again:

...

  1 2 3 4 5 6 7 8 9 10
A X M ~ ~ ~ ~ ~ ~ ~ ~
B X ~ ~ M ~ ~ M ~ X ~
C X ~ ~ ~ ~ ~ ~ ~ X ~
D X ~ ~ ~ ~ M ~ ~ X ~
E ~ ~ ~ M ~ ~ M ~ M ~
F M ~ X X X X X M ~ ~
G ~ ~ ~ ~ ~ ~ M ~ ~ ~
H ~ M M ~ ~ ~ ~ ~ ~ M
I ~ X ~ ~ M ~ ~ M ~ ~
J ~ X ~ ~ ~ ~ M X X ~

You hit a ship! Try again:

> J10

  1 2 3 4 5 6 7 8 9 10
A X M ~ ~ ~ ~ ~ ~ ~ ~
B X ~ ~ M ~ ~ M ~ X ~
C X ~ ~ ~ ~ ~ ~ ~ X ~
D X ~ ~ ~ ~ M ~ ~ X ~
E ~ ~ ~ M ~ ~ M ~ M ~
F M ~ X X X X X M ~ ~
G ~ ~ ~ ~ ~ ~ M ~ ~ ~
H ~ M M ~ ~ ~ ~ ~ ~ M
I ~ X ~ ~ M ~ ~ M ~ ~
J ~ X ~ ~ ~ ~ M X X X

You sank the last ship. You won. Congratulations!
</pre>