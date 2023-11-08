# Class vs Instance
## Method
A sort of named procedure associated with a class that performs a predefined action. In the sample code below, returnType will either be a data type or  if no value need be returned. Like a constructor, a method can have  or more parameters.

returnType methodName(parameterOne, ..., parameterN){
    ...
    return variableOfReturnType; // no return statement if void
}
Most classes will have methods called getters and setters that get (return) or set the values of its instance variables. Standard getter/setter syntax:
```
class MyClass{
    dataType instanceVariable;
    ...
    void setInstanceVariable(int value){
        this.instanceVariable = value;
    }
    dataType getInstanceVariable(){
        return instanceVariable;
    }
}
```
Structuring code this way is a means of managing how the instance variable is accessed and/or modified.


