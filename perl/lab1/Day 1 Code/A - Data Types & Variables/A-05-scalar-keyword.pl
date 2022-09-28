#!/usr/bin/perl -w 

# Defining Arrays 
@array1 = ("ITI", "Open", "Source"); 
@array2 = (1, 1, 0, 0, 9, 6); 

# Concatenation of both arrays 
@array3 = (@array1, @array2); 

# Printing the Concatenated Array 
# in List form 
print "Array in List form: @array3\n"; 

# Conversion of Arrays to scalar context 
@array3 = (scalar(@array1), scalar(@array2)); 

# Conversion to scalar returns 
# the number of elements in the array 
print "Array in scalar form: @array3\n"; 

