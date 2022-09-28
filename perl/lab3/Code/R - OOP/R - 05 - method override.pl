#!/usr/bin/perl
use warnings; 

# Creating class using package 
package A; 

# Constructor creation 
sub new 
{ 

	# shift will take package name 'vehicle' 
	# and assign it to variable 'class' 
	my $class = shift; 
	my $self = { 
				'name' => shift, 
				'roll_no' => shift
			}; 
	

}; 
sub poly_example 
{ 
print("This corresponds to class A\n"); 
} 
package B; 

# The @ISA array contains a list 
# of that class's parent classes, if any 
my @ISA = (A); 

sub poly_example 
{ 
print("This corresponds to class B\n"); 

} 

package main; 

B->poly_example(); 
A->poly_example(); 

