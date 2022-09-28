#!/usr/bin/perl 

# Initializing a Hash 
%hash = (Nasr => 30, Mansora => 20 , Alex => 15); 

# each() function 
while (($key, $value) = each(%hash)) 
{ 
	
	# Printing(key, value) pair 
	print("$key = $value\n"); 
} 

