#!/usr/bin/perl 
	
# Initializing a string 
$a = "Geeks"; 
	
# matching the above string with "?" 
# quantifier in regular expression /Ge?ks/ 
if ($a =~ m/Geek?s/) 
{ 
	print "Match Found\n"; 
} 
else
{ 
	print "Match Not Found\n"; 
} 

