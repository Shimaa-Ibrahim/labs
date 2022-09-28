package Compare; 

# A- Compare two arrays
sub compare_array 
{ 
    $a = $_[0]; 
	$b = $_[1]; 
	if (ref($a) !~ 'ARRAY' or ref($b) !~ 'ARRAY'){
        print "\none of the inputs is not an array\n";
    }else{
        if($_[0] ~~ $_[1]){
            print "\ntwo arrays are equal\n";
        }else{
            print "\ntwo arrays are Not equal\n";
        }
        
    }
	
} 

# B- Compare two hashes
sub compare_hash 
{ 
    $a = $_[0]; 
	$b = $_[1]; 
	if (ref($a) !~ 'HASH' or ref($b) !~ 'HASH'){
        print "\none of the inputs is not an hash\n";
    }else{
        if($_[0] ~~ $_[1]){
            print "\ntwo hash are equal\n";
        }else{
            print "\ntwo hash are Not equal\n";
        }
        
    }
	
} 

# C- Check if a key exist in a hash
sub compare_hash_key 
{ 
    $a = $_[0]; 
	$b = $_[1]; 
	if (ref(\$a) !~ 'SCALAR' or ref($b) !~ 'HASH'){
        print "\nwrong inputs\n";
    }else{
        if($_[0] ~~ $_[1]){
            print "\nkey exists\n";
        }else{
            print "\nkey does not exist\n";
        }
        
    }
}
1; 


