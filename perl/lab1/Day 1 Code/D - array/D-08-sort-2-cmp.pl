#!/usr/bin/perl 

# Initializing an array 
@fruits = ('chikoo', 'apple', 'banana', 
		'orange', 'grapes'); 

# Sorting array in ascending order 
@x = sort { $a cmp $b } @fruits; 

# Sorting array in descending order 
@y = sort { $b cmp $a } @fruits; 

# Printing sorted array 
print "Array in ascending order: @x\n"; 

# Printing sorted array 
print "Array in descending order: @y"; 

