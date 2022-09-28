# Perl program to demonstrate the variable 
# number of parameters to the subroutine 

#!/usr/bin/perl 

use strict; 
use warnings; 

# defining subroutine 
sub Multiplication { 
	
	# private variable containg 
	# default value as 1 
	my $mul = 1; 
	
	foreach my $val (@_) 
	{ 
		$mul *= $val; 
	} 
	
	
	return $mul; 
} 

# Calling subroutine with 4 parameters 
print Multiplication(8, 2, 3, 4); 

print "\n"; 

# Calling subroutine again but 
# with 3 parameters 
print Multiplication(3, 5, 4); 

