# Perl program to illustrate 
# unless - elsif statement 
$a = 50; 

unless($a == 60) 
{ 

# if condition is false 
printf "a is not euqal to 60\n"; 
} 
elsif($a == 60) 
{ 
	
# if condition is true 
printf "a is equal to 60\n"; 
} 
else
{ 

# if none of the condition matches 
printf "The value of a is $a\n"; 
} 

