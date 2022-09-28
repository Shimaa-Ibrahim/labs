# Perl program to illustrate 
# the Package Variables 
 
# variable declared in 
# main namespace 
$var1 = "Main Namespace"; 

print "Value of Var1: ".$var1."\n"; 

# package declaration 
# Pack1 is the package 
package Pack1; 

	# since $var1 belongs to main namespace, 
	# so nothing will print inside Pack1 
	# namespace 
	print "Value of var1: ".$var1."\n"; 
	
	# variable declared in Pack1 namespace 
	# having same name as main namespace 
	$var1 = "Pack1 Namespace"; 
	
	# here $var1 belongs to Pack1 namespace 
	print "Value of var1: ".$var1."\n"; 
	
	# in-order to print variables 
	# from both namespace, use 
	# following method 
	print "Value of var1: ".$main::var1."\n"; 
	print "Value of var1: ".$Pack1::var1."\n"; 

