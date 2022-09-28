#!/usr/bin/perl 

# Perl program to print respective day 
# for the day-code using given-when statement 
use 5.010; 

# Asking the user to provide day-code 
print "Enter a day-code between 0-6\n"; 

# Removing newline using chomp 
chomp(my $day_code = <>); 

# Using given-when statement 
given ($day_code) 
{ 
	when ('0') { print 'Sunday' ;} 
	when ('1') { print "What time of day is it?\n"; 
				chomp(my $day_time = <>); 
				
				# Nested given-when statement 
				given($day_time) 
				{ 
					when('Morning') {print 'It is Monday Morning'}; 
					when('Noon') {print 'It is Monday noon'}; 
					when('Evening') {print 'It is Monday Evening'}; 
					default{print'Invalid Input'}; 
				} 
				} 
	when ('2') { print 'Tuesday' ;} 
	when ('3') { print 'Wednesday' ;} 
	when ('4') { print 'Thursday' ;} 
	when ('5') { print 'Friday' ;} 
	when ('6') { print 'Saturday' ;} 
	default { print 'Invalid day-code';} 
} 

