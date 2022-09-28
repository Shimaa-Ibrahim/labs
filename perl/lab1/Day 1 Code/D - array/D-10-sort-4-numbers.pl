#!/usr/bin/perl 

# Initializing an array 
@n = (12, 44, 2, 5, 25, 7, 96, 1); 

# Printing Original Array 
print "Original Array: @n\n"; 

# Sorting numbers with use of 
# spaceship operator 
@x = sort { $a <=> $b } @n; 

# Printing sorted array 
print "Array after Sorting: @x"; 


# Sorting numbers with use of 
# spaceship operator 
@y = sort { $b <=> $a } @n; 

# Printing sorted array 
print "Array after Sorting: @y"; 

