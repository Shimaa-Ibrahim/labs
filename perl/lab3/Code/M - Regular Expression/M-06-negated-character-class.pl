# Perl program to demonstrate 
# negated character class 

# Actual String 
$str = "Intake40"; 

# using negated character class 
# Prints match found if 
# its found in $str 
if ($str =~ /[^Intake0-9]/) 
{ 
	print "Match Found\n"; 
} 

# Prints match not found 
# if its not found in $str 
else
{ 
	print "Match Not Found\n"; 
} 

