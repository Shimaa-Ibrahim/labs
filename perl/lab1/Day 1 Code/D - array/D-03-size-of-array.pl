# Perl program to demonstrate 
# the length of an array 

# declaring an array 
@arr = (11, 22, 33, 44, 55, 66); 

# Storing the length of array 
# in variable imp_size 
# implicit scalar context 
$imp_size = @arr; 

# Storing the length of array 
# in variable exp_size 
# explicit scalar context 
$exp_size = scalar @arr; 



print "Size of arr(imp_size) $imp_size\n"; 
print "Size of arr(exp_size) $exp_size\n";


