
## **History of Java: -**
    - Father of Java - James Goslings
    - introduced year - 1995
    - the company introduced - Sun Microsystems
    - first name of Java - OAK
    - currently Owned & Maintained by - Oracle  

## **Compiler: -**
     It finds the bug or error in the program, converts into Bytecode (Intermediate language) and stored into fileName.class file 
    - Bytecode is platform independent, it can run any platform

## **JVM: -**
    - Java Virtual Machine (JVM) it reads the code line by line
    - Converts Binary code (0's and 1's) with help of JIT
    - Platform dependent 

## **Features of Java: -**
    - Simple Language (syntax easy)
    - Platform independent (can run any operating systems)
    - object oriented programming 
    - Extensible (integrate with other programming language)
    - Robust (it can handle huge applications and No viruses harm)
    - Automatic Garbage Collector (identifies the duplicate data and remove automatically)    


## **Variables: -**

    Variable are the container or memory location used to store the data or information

        Syntax : -
        Datatype VariableName = Value;


### **Local Variable**
    Local Variables are declared inside the body of the method. only accessed by the method

### **Instance Variable**
    Instance Variable are defined without static keyword, and it declare outside of the method.

### **Gloabal Variable**
    Global Variables are declared inside of the class and outside of the method. It can be accessed by any methods within the class

## **Constant**
    Constant is a variable whose value can't change once and it be assigned
    - java doesn't have built in support
    - for alternate we use " final " keyword. 

## **DataTypes: -**

    Datatypes tells what type of data can be stored in the variable

    Primitive Datatype

| Datatypes | Bits | Bytes | uses       |
| --------- | ---- | ----- | ---------- |
| byte      | 8    | 1     | -          |
| short     | 16   | 2     | -          |
| int       | 32   | 4     | -          |
| long      | 64   | 8     | 89l        |
| float     | 32   | 4     | 89.0l      |
| double    | 64   | 8     | 89.0       |
| char      | 16   | 2     | ' k '      |
| boolean   | 8    | 1     | true/false |

    Reference Datatype -> String, Array, Enum 

## **Println, Print and Printf: -**
    **Println**
        - Executes the code and move the cursur next line

    **Print**
        - Executes the code and the cursur remains same line

    **Printf**
        - To printing the format number : 
            - for Numbers use " %d "
            - for double use " %f "  


## **Identifiers (or) Naming Convention: -**
    - A to Z and a - z characters allowed
    - Numerics should comes after the character, not in beginning (Name1 not 1Name)
    - Special Characters are not allowed except $ and _
    - Keyword is not allowed 
    - Class name should starts with Uppercase
    - method name should start with lowercase (Camel Case) 
    - classname should be same has filename

## **Type Casting or Type Conversion: -**
    Converting the one datatype value into another datatype 
        Syntax: -
            Datatype VariableName = (TypeOfData)Value;

        -Widening (converting smaller datatype into larger datatype) - automatic conversion
                int num1 = 20;
                double value = num1;
                System.out.println(num1);

        -Narrowing (Converting Larger datatype into smaller datatype) - Manual conversion
                double num1 = 20.87;
                int value =   (int) num1;
                System.out.println(num1);


## **Operators: -**
    perform some operations on operands, serves results
        - Arithmetic operator (+,-,*,/,%)
        - Assignment operator (=,+=,-=,*=,/=,%=)
        - Relational operator (==,!=,<=,>=)
        - Logical Operator (AND (&&), OR (||), XOR (^))
        - Increment and Decrement Operator (++(Preincrement, Postincrement), --(predecrement, Postdecrement) )
        - Bitwise Operator (&, |, ^) - perform operations on Binary representation numbers or they work individual bit 
        - Conditional or Ternary Operator (condition1 ? expression2 : expression3)
    
        
## **Conditional Statements**
    Conditional statement allows to perform tasks based on certain conditions
       -if
            syntax: -
                 if(condition){
                    statement(s);    
                 }
        
        -if-else
            syntax: -
                if(condition){
                    statement(s);
                }else{
                    execution;
                }

        -nestedif
            syntax: -
                if(condition1){
                    if(condition2){
                        statement(s);
                    }
                }else{
                    execution;
                }    
        -if-elseif
            syntax: -
                if(condition1){
                    statement(S);
                }elseif(condition2){
                    statement(S);
                }else{
                    execution;
                }

        -switch (variable / expression){
            case value1:
                statement(s);
                break;     
            case value2:
                statement(S);
                break;
            default:
                execution(deafult value);   
        }


## **Looping / Iteration Statement**
    whenever we need to perform condition again and again
        
        -for loop
        syntax: -
            for (intialization; condition; iteration){
                execution statement;
            }
            
        -while loop
        syntax: -
            while (condition){
                execution block;
            }

        -do-while loop - first do the instuction after checking conditions
        syntax: - 
            do{
                set of instruction
            }while(condition){
                execution;
        }

        -for-each loop -- same has for loop but its for array concept
        syntax: -
            for(variable type: array){
                statement(s);
            }

## **String**
    String Object usually stores the text that are enclosed with double quotes.
        Syntax: -
            String Name = "Srikanth Sankar"

### **String Length**
    - length() method is used to find the length of the string.
        Syntax: -
            String Name = "Srikanth Sankar"
            System.out.println("Name.length()");

### **String Uppercase and Lowercase**
    - toUpperCase() method is used to convert the string to uppercase.
        Syntax: -
            System.out.println(Name.toUpperCase());

    -toLowerCase() method is used to convert the string to lowercase.
        Syntax: -
            System.out.println(Name.toLowerCase());

### **Finding Characters in String**
    indexOf() method used to find the index position of the String or value 
        Syntax: -
            System.out.println(indexOf(r));


## **Arrays**
    Arrays is a group of homogeneous data in one single variable and it is called by using index position
        - index position starts with 0.
    
    Array Declaration: - 
        syntax: -
            ArrayType[] VariableName = ArrayValue[]

        -one Dimentional Array

