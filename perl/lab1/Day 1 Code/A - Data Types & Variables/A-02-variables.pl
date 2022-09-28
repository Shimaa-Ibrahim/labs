#!/usr/bin/perl 
use Data::Dumper; 

# Scalar Variable 
$name = "ITI"; 

# Array Variable 
@array = ("G", "E", "E", "K", "S"); 

# Hash Variable 
%Hash = ('Welcome', 10, 'to', 20, 'ITI', 40); 

# Variable Modification 
$array[2] = "F"; 

print "Modified Array is @array\n"; 

# Interpolation of a Variable 

# Using Single Quote 
print 'Name is $name\n'; 

# Using Double Quotes 
print "\nName is $name"; 

# Printing hash contents 
print Dumper(\%Hash); 

