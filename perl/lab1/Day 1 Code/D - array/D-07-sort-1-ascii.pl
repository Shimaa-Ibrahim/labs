#!/usr/bin/perl 

# Initializing an array 
@country = ('India', 'America', 'london', 
			'france', 'bangladesh'); 

# Printing sorted array 
@sorted_countries = sort @country; 

foreach $ele (@sorted_countries){
	print "$ele \n";
}

