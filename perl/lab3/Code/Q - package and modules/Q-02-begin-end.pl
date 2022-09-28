#!/usr/bin/perl 

# Predefined BEGIN block 
BEGIN 
{ 
	print "In the begin block\n"; 
	$num = 10;
} 

# Predefined END block 
END 
{ 
	print "In the end block\n"; 
	print "last value for \$num = $num"; 
} 

print "Hello Perl;\n"; 
$num++;

