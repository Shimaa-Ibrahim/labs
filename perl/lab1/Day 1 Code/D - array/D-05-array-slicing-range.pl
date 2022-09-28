#!/usr/bin/perl 

# Perl program to implement the use of Array Slice 
@array = ('ITI', 'Open', 'Source', 'Nasr', 'City'); 

# Using range operator for slicing method 
@extracted_elements = @array[0..1,4]; 

# Printing the extracted elements 
print"Extracted elements: ". 
	"@extracted_elements"; 

