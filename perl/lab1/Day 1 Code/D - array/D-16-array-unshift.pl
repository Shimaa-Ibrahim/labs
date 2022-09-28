#!/usr/bin/perl 

# Initalizing the array 
@x = ('Java', 'C', 'C++'); 

# Print the Inital array 
print "Original array: @x \n"; 

# Prints the number of elements 
# returned by unshift 
print "No of elements returned by unshift: ", 
				unshift(@x, 'PHP', 'JSP'); 

# Array after unshift operation 
print "\nUpdated array: @x"; 

