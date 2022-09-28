#!/usr/bin/perl 

# Open Hello.txt in Read-Write Mode 
open(rw, "+<", "Hello.txt"); 

# Print original contents of the File. 
# rw is set to the end. 
print("Existing Content of Hello.txt: ".<rw>); 

# The string is attached at the end 
# of the original contents of the file. 
print rw "\nAdded using Read-Write Mode."; 



# Close the FileHandle 
close(rw); 

