#!/usr/bin/perl
use strict; 
use warnings; 
use feature qw/say/; 
use lib '/home/ziyad/Desktop/PERL Day 3/Code/R - OOP/R - 03 - Destructor';
use Area;
# pass length and width arguments 
# to the constructor 
my $area = Area->new( 
			{ 
				length => 2, # passing '2' as param of length 
				width => 2, # passing '2' as param of width 
			}); 

say $area->get_area; 

