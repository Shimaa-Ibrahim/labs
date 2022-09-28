# Declaration and definition of Base class 
use strict; 
use warnings; 

# Creating parent class 
package Vehicle; 

sub new 
{ 

	# shift will take package name 'vehicle' 
	# and assign it to variable 'class' 
	my $class = shift; 
	
	my $self = { 
				'distance'=> shift, 
				'petrol_consumed'=> shift
			}; 
	
	# Bless function to bind object to class 
	bless $self, $class; 
	
	# returning object from constructor 
	return $self; 
} 

# Method for calculating the mileage 
sub get_mileage 
{ 
	my $self = shift; 
	
	# Calculating result 
	my $result = $self->{'distance'} / 
				$self->{'petrol_consumed'}; 
				
	print "The mileage by your vehicle is: $result\n"; 
	
} 

# Method for calculating the cost 
sub get_cost 
{ 
	my $self = shift; 
	
	# Calculating result 
	my $result = $self->{'petrol consumed'} * 70; 
	
	print "The cost is: $result\n"; 
} 
1; 

