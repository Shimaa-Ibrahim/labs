# Perl Program to illustrate 
# the index() function 

# !/usr/bin/perl 
use warnings; 
use strict; 

# string 
my $st = "ITI - Open Source - Nasr City\n"; 

# substring 
my $subs = "Nasr"; 

# using index function 
my $r = index($st, $subs); 

# displaying result 
print(qq\The substring $subs found at position $r in string $st\); 

