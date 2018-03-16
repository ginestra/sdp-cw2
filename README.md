# sdp-cw2
SDP Coursework Two (Kotlin)

**Pair:**

* Alun Davey - adavey03
* Ginestra Ferraro - gferra02

## The Problem

This problem asks you to write and test two functions (perhaps with helper functions, as well):

`encipher(s, n)`

and

`decipher(s)`

### encipher

`encipher(s, n)` takes as input a string `s` and a non-negative integer `n` between 0 and 25. This function returns a new string in which the letters in `s` have been rotated by `n` characters.

For this problem, you should assume that upper-case letters are "rotated" to upper-case letters, lower-case letters are "rotated" to lower-case letters, and all non-alphabetic characters are left unchanged. For example, if we were to shift the letter `y` by 3, we would get `b` and if we were to shift the letter `Y` by 3 we would get `B`.

You can write `encipher` any way you like as long as you use recursive functions. You may wish to write a helper function that "rotates" a single character by `n` spots, wrapping around the alphabet as appropriate. Then, you might use this helper function to encipher your string. It’s up to you how you do this! (Remember: uppercase letters wrap should around the alphabet to uppercase letters, and lowercase letters wrap always to lowercase letters.)

### decipher

On the other hand, decipher will be given a string of English text shifted by some amount already; decipher should return the original English string, to the best of its ability. 
Note: some strings have more than one English "deciphering". What’s more, it is very difficult to handle short strings correctly. Thus, your decipher does not have to be perfect.

One approach you could try is to use [letter frequencies](https://en.wikipedia.org/wiki/Letter_frequency). Scrabble scores have also been suggested in the past…! You might want also to use some additional "heuristics" (rules of thumb) of your own design. Also, you are welcome to write one or more small "helper" functions that will help decipher. Be sure to describe whatever strategies you used in writing your decipher function in a detailed comment above your decipher function.

### Some encipher examples

`encipher("xyza", 1)`

results in

`yzab`

and

`encipher("Z A", 1)`

results in

`A B`

Finally,

`encipher("Caesar cipher? I prefer Caesar salad.", 25)`

results in

`Bzdrzq bhogdq? H oqdedq Bzdrzq rzkzc.`

### Some decipher examples

`decipher("Bzdrzq bhogdq? H oqdedq Bzdrzq rzkzc.")`

results in

`Caesar cipher? I prefer Caesar salad.`

and

```
decipher("Hu lkbjhapvu pz doha ylthpuz hmaly dl mvynla " +
            ‘"clyfaopun dl ohcl slhyulk.")
```

might result in

`An education is what remains after we forget everything we have learned.`

### Hint

For decipher you might have your program "look at" all 26 possible rotations of the input string and then decide on which is "best". Consider possible strategies for determining how to get a computer to determine what would be the most likely deciphered text for any given encrypted text.
