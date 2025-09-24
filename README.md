## Why doesn't the integer change after the method call?
The integer `number` doesn't change because within the loop we are only editing the value of the local variable `in1`, which starts off equal to `number` but changes in line 6. 

## Why does the array change after the method call?
Because the loop is iterating through the indexes of the array and then using them to access the `arr1` array, the actual values of the `arr1` array are being changed. 

If the for loop was instead 
    for (int i : arr1)
and the values edited were just `i`, then the array would be unchanged, as then we would only be editing the local variable `i`.


## What happens when you try to access y outside the loop?
It returns an error because the variable `y` is only stored in the scope of the `demonstrateScope` function.