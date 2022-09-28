# Declaration and definition of Base class 
use strict; 
use warnings; 
	
# Creating parent class 
package vehicle; 

# Setter method 
sub set_mileage 
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
	
# Getter method 
sub get_mileage 
{ 
	my $self = shift; 
		
	# Calculating result 
	my $result = $self->{'distance'} / 
				$self->{'petrol_consumed'}; 
					
	print "The mileage by your vehicle is: $result\n"; 
	
} 

# Object creation and method calling 
my $ob1 = vehicle -> set_mileage(2550, 170); 
$ob1->get_mileage(); 

