#!/usr/bin/perl 
package Cat;
use lib '/home/shimaa/perl/lab3';
use parent 'Animal'; 


sub talk 
{ 
	my $self = shift; 
	print "I am a cat\n"
} 



# my $cat = Cat->new();
# print $cat->get_Name()."\n" ; 
# print $cat->get_age()."\n";  
# print $cat->talk(); 

