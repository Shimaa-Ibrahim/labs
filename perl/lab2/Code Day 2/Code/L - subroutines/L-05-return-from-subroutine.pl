# Perl Program to demonstrate the 
# returning values subroutine 

#!/usr/bin/perl 

# subroutine definition 
sub Sum { 
	
	# To get total number 
	# of parameters passed. 
	$num = scalar(@_); 
	$s = 0; 

	foreach $i (@_) 
	{ 
		$s += $i; 
	} 
		
	# returning sum 
	return $s; 
} 

# subroutine calling and storing result 
$result = Sum(30, 2, 40); 

# displaying the result 
print "Sum of the given numbers : $result\n"; 

