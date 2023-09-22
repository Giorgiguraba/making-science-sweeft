# GitHub Repository README

## Project Title: making-science-sweeft

This GitHub repository contains a Java project titled "Tasks." This project consists of several functions that perform various tasks and operations. Below, you will find a brief description of each function and its purpose.

### Functions:

#### 1. `singleNumber`

- **Description:** This function takes an array of integers as input and finds the integer that appears only once in the array, with all other integers appearing exactly twice.

- **Usage Example:**

```java
int[] nums = {1, 2, 2, 1, 3};
int result = Tasks.singleNumber(nums);
System.out.println(result); // Output: 3
```

#### 2. `minSplit`

- **Description:** This function calculates the minimum number of coins needed to make change for a given amount using coin denominations of 50, 20, 10, and 5.

- **Usage Example:**

```java
int amount = 95;
int minCoins = Tasks.minSplit(amount);
System.out.println(minCoins); // Output: 4
```

#### 3. `notContains`

- **Description:** This function finds the smallest positive integer that is not present in a given array of integers.

- **Usage Example:**

```java
int[] array = {1, 3, 5};
int smallest = Tasks.notContains(array);
System.out.println(smallest); // Output: 2
```

#### 4. `addBinary`

- **Description:** This function takes two binary strings as input, converts them to decimal, adds them together, and returns the result as a binary string.

- **Usage Example:**

```java
String binary1 = "1101";
String binary2 = "101";
String result = Tasks.addBinary(binary1, binary2);
System.out.println(result); // Output: "10010"
```

#### 5. `countVariants`

- **Description:** This function calculates the number of distinct ways to climb a staircase with a given number of steps, where you can climb either 1 or 2 steps at a time.

- **Usage Example:**

```java
int stairsCount = 4;
int variants = Tasks.countVariants(stairsCount);
System.out.println(variants); // Output: 5
```
