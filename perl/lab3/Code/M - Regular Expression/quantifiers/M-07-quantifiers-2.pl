#!/usr/bin/perl 
	
# Initializing a string 
$a = "Gks"; 
	
# matching the above string with "+" 
# quantifier in regular expression /Ge+ks/ 
if ($a =~ m/Ge+ks/) 
{ 
	print "Match Found\n"; 
} 
else
{ 
	print "Match Not Found\n"; 
} 

