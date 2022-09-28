# Perl program to demonstrate qw function 

# using qw function 
@arr1 = qw /ITI Open Source /; 

# Creates array2 with elements at 
# index 2,3,4 in array1 
@arr2 = @arr1[1, 3]; 

print "Elements of arr1 are:\n"; 
foreach $ele (@arr1) 
{ 
	print "$ele \n"; 
} 

print "Elements of arr2 are:\n"; 
foreach $ele (@arr2) 
{ 
	print "$ele \n"; 
} 

