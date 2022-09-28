# Perl program to demonstrate 
# range in character class 

# Actual String 
$str = "Intake40"; 

# Prints match found if 
# its found in $str 
# using range 
if ($str =~ /[1-7a-z]/) 
{ 
	print "Match Found\n"; 
} 

# Prints match not found 
# if its not found in $str 
else
{ 
	print "Match Not Found\n"; 
} 

