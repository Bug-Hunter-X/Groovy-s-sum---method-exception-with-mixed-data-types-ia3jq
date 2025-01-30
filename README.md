# Groovy's sum() method exception with mixed data types

This repository demonstrates an uncommon error in Groovy related to the `sum()` method and lists containing mixed data types (numeric and non-numeric).

The `sum()` method in Groovy is designed to work efficiently with lists of numbers.  However, if your list contains non-numeric elements, it will throw a `groovy.lang.MissingMethodException`. This behavior might be unexpected for developers accustomed to languages with more implicit type conversions.

The `bug.groovy` file shows the problematic code, and `bugSolution.groovy` offers solutions to handle this situation gracefully.

## Solutions

The solution involves checking the list's contents before applying the `sum()` method, or using a more robust approach such as iterating and summing only the numbers.