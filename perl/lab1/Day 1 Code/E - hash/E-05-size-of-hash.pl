# Perl program to find the size of a Hash 

#use warnings; 

# creating hash 
%rateof = ('Mango' => 64, 'Apple' => 54, 'Grapes' => 44, 'Strawberry'=>23); 

# creating array of keys 
@keys = keys %rateof; 
$size = @keys; 
print "Hash size using Keys is: $size\n"; 

# creating hash of values 
@values = values %rateof; 
$size = @values; 
print "Hash size using Values is: $size\n"; 

