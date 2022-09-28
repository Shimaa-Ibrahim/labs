#!/usr/bin/perl 

# Initalizing the array 
@x = ('Java', 'C', 'C++'); 

# Print the Inital array 
print "Original array: @x \n"; 

# Prints the value returned 
# by shift function 
print "Value returned by shift: ", shift(@x); 

# Array after shift operation 
print "\nUpdated array: @x"; 

