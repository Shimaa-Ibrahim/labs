#!/usr/bin/perl 
#use strict;
# Initializing values to scalar 
# variables x and y 
my $x = 10; 
my $y = 20; 

# Values before subroutine call 
print "Before calling subroutine x = $x, y = $y \n"; 

# Subroutine call 
sample($x, $y); 

# Values after subroutine call 
print "After calling subroutine x = $x, y = $y "; 

# Subroutine sample 
sub sample 
{ 
	$temp = $_[0];
	$_[0] = $_[1]; 
	$_[1] = $temp; 
} 

