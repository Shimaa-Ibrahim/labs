#!/usr/bin/perl 
	
# Initializing a string 
$a = "Geeeks"; 
	
# matching the above string with {n, m} 
# quantifier in regular expression /Ge{1, 2}ks/ 
if ($a =~ m/Ge{1,2}ks/) 
{ 
	print "Match Found\n"; 
} 
else
{ 
	print "Match Not Found\n"; 
} 

