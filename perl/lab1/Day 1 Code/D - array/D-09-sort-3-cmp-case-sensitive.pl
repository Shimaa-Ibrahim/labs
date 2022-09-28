#!/usr/bin/perl 

# Initializing an array 
@fruits = ('Chikoo', 'Apple', 'banana', 
		'orange', 'Grapes'); 

# Converting values to lower case for 
# comparison before sorting 
@x = sort { lc($a) cmp lc($b) } @fruits; 

# Converting values to upper case for 
# comparison before sorting 
@y = sort { uc($a) cmp uc($b) } @fruits; 

# Printing sorted array 
print "Array after converting to lower case: @x\n"; 

# Printing sorted array 
print "Array after converting to upper case: @y\n"; 

