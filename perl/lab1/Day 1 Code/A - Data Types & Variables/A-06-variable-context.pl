#!/usr/bin/perl 

# Defining Array variable 
@names = ('XYZ', 'LGH', 'KMR'); 

# Assigning values of array variable 
# to another array variable 
@copy = @names; 

# Assigning values of Array variable 
# to a scalar variable 
$size = @names; 

$names[5] = "New String";

$#last_index = @names;

# Printing the values of new variables. 
print "Given names are : @copy\n"; 
print "Number of names are : $size\n"; 
print "last index of array : $#last_index";
