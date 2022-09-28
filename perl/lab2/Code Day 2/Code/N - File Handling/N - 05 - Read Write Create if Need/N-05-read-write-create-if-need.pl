#!/usr/bin/perl 

# Opening File Hello.txt in Read mode 
open(r, "<", "Hello.txt"); 

# Printing the existing content of the file 
print("Existing Content of Hello.txt: " . <r>); 

# Closing the File 
close(r); 

# Open Hello.txt in Read-Write Mode 
open(rw, "+>", "Hello.txt"); 

# Printing the existing content of the file 
print("Existing Content of Hello.txt: " . <rw>); 


# Original contents of the File 
# are cleared when the File is opened 
print("\nContents of Hello.txt gets cleared..."); 

# The string is written to the File 
print rw "Hello!!! This is updated file."; 

# Set rw to the beginning of the File for reading. 
seek rw, 0, 0; 

print("\nUpdated Content of Hello.txt: " .<rw>); 

# Closing the File 
close(rw); 

