# Hexadecimal to RGB

Hexadecimal is a numeral system with a base of 16. It uses sixteen distinct symbols : `0` to `9` to represent values zero to nine, and `A` to `F` represent values ten to fifteen.

*E.g:*
```
   0 : 0
   1 : 1
   9 : 9
   A : 10
   B : 11
   F : 15
  10 : 16
  11 : 17
  FF : 255
4F2C : 20268
```

Create a method that converts a hexadecimal color string into a RGB array.

A hexadecimal color string is a triplet of hexadecimal values (red, blue, green) that begins with a '#'.
E.g: `#FFD700` will be the gold color : `FF` for red, `D7` for blue, `00` for green.

A hexadecimal digit (base 16) goes from `0` to `9` and then from `A` to `F` (10 to 15).
Each color group contains two digits, and goes from `00` to `FF` (255).

A RBG array contains the value of each color group in decimal.

If you convert `#FFD700` into a RGB array, you'll obtain `{255, 215, 0}`.


If the argument is null, empty, doesn't begins with a '#' or contains an illegal character, throw an `IllegalArgumentException`.