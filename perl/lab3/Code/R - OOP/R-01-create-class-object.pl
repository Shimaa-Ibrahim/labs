#!/usr/bin/perl
use strict; 
use warnings; 

package Student; 

# constructor 
sub student_data 
{ 

	# shift will take package name 'student' 
	# and assign it to variable 'class' 
	my $class_name = shift; 
	my $self = { 
				'StudentFirstName' => shift, 
				'StudentLastName' => shift
			}; 
	# Using bless function 
	bless $self, $class_name; 
	
	# returning object from constructor 
	return $self; 
} 

# Object creationg and constructor calling 
#my $Data = student_data Student("Ahmed","Tarek"); 
my $Data = Student->student_data ("Ahmed","Tarek");
# Printing the data 
print "$Data->{'StudentFirstName'}\n"; 
print "$Data->{'StudentLastName'}\n";  

$Data->{'StudentFirstName'} = 'Ali';

print "$Data->{'StudentFirstName'}\n"; 
