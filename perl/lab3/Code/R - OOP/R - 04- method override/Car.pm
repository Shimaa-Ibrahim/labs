# Declaring and defining derived class 

# Creating derived class 
package Car; 

use strict; 
use warnings; 

# Using parent class 
use parent 'Vehicle'; 

# Overriding the method 
sub get_mileage 
{ 
	my $self = shift; 
	
	# Calculating the result 
	my $result = $self->{'distance'} / 
				$self->{'petrol_consumed'}; 
				
	print "The mileage by your car is: $result"; 
} 

1; 

