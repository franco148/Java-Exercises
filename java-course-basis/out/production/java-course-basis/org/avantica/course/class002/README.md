OPERATORS
=================================================


![operadoresjava](https://user-images.githubusercontent.com/10811329/47256839-ebe7a100-d453-11e8-858c-909fd15f31cc.png)


- Operator is a special symbol that is applied to variables values of litterers operators. They can be
applied to one, two or three operands unless there are brackets. Java operator follow operator precedence.


###### Arithmetic operators examples:

- 3 - 2 + 2 * 2 + 3 = ?
- 4 / 2 + 1 - 4 * 2 + 10 = ?

###### Unary operator examples:

1.-
``` java
int a = 4;
b = 3 - 2 * --a;
```

2.-
```
int a = 4;
b = 3 - 2 * a--;
```

3.-
```
10 - 3 * (2 + 1) - 4 / (1 + 3)
```

4.-
```
int i = 10;
int j = 3;

int k = i % j;
int e = 10 % 2;
```


#### Numeric Promotion.
Promotion is converting smaller data type to a bigger one.

###### Rules

1) When two values have different data types, Java will auto promote one of the values to the larger data type.
2) When one of the values is integral and the other is floating-point. Java will auto promote the integral
(byte, short, int, long) value to the floating-point (float, double) value's data type.
3) Small data types (byte, short and char), are first promoted to int any time they are used with binary
arithmetic operator, even when neither of the operands is int.
4) After all promotion has finished and the operands are the same data type (e.g. all double), the
result value will have the same data type as its promoted operands.


#### Casting
Casting is converting bigger type to smaller one.

Example:
```
double myDouble = 5.55;
int myInt = 4 + myDouble; // compilation error. - Incompatible types.
```

Questions:
1. What is the data type of x + y?
```
double x = 44.25;
float y = 3.35;
```

2. What is the data type of x / y?
```
short x = 14;
short y = 6;
```

3. What is the data type of x * y /z?
```
short x = 14;
float y = 13f;
double z = 30;
```


#### Unary Operators:

![unaryoperators](https://user-images.githubusercontent.com/10811329/47257343-5c91bc00-d45a-11e8-9c48-471e3c0efec1.png)


#### Assignment Operators
```
short a = 10;
short b = 20;

short c = a * b; // Is it correct? Does it compile? 
```

#### Compound assignment operators

```
int x = 2;
int z = 3;

x = x * z;

// Do we have another way to do the same operation?
```

#### Relational operators

![relationaloperators](https://user-images.githubusercontent.com/10811329/47260416-3b948f80-d489-11e8-8a5d-992d1ced37ff.png)

#### Conditional operators: && , || , ^

#### Equality operators ==, !=

#### == and equals()












