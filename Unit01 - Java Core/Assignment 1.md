### Assignment 1
Compare Value types and reference types. Explain and example.
#
### Value types
Value types are stored directly in memory and hold their values within their own memory space. They are essentially a copy of the original value, and any changes made to the copy do not affect the original value. Examples of value types include primitive data types like integers, characters, and booleans.
#
### Reference Types
Reference types, on the other hand, store memory addresses that point to complex objects or data structures stored elsewhere in memory. They are essentially pointers to the actual objects. When a reference type is assigned to another reference type, both variables point to the same object in memory. Changes made to the object through one reference affect the original object.

#
### Example 
```java
String str1 = "Hello";
String str2 = str1;

str2 = str2 + " World";

System.out.println(str1); 
System.out.println(str2); 
```
In this example, str1 and str2 are reference types that point to the same string object. When str2 is modified, it does not create a new string but rather changes the original string that str1 also points to. This is because reference types store memory addresses, not the actual data.

#
### Differences
- Value types store their values directly in memory, while reference types store memory addresses that point to the actual data.
- When a value type is assigned to another value type, a copy of the value is made. When a reference type is assigned to another reference type, both variables point to the same object.
- Changes made to a value type do not affect the original value. Changes made to a reference type affect the original object.