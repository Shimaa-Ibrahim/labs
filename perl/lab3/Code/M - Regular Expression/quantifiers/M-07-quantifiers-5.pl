#!/usr/bin/perl 
	
# Initializing a string 
$a = "Geks"; 
	
# matching the above string with {n, } 
# quantifier in regular expression /Ge{2, }ks/ 
if ($a =~ m/Ge{2,}ks/) 
{ 
	print "Match Found\n"; 
} 
else
{ 
	print "Match Not Found\n"; 
} 

