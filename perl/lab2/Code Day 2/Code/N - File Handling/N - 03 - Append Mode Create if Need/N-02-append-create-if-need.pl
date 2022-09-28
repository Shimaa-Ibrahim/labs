#!/usr/bin/perl 

# Opening File Hello.txt in Read mode 
open(r, "<", "Hello.txt"); 

# Printing the existing content of the file 
print("Existing Content of Hello.txt: \n" . <r>); 

# Opening the File in Append mode 
open(A, ">>", "Hello.txt"); 

# Set r to the beginning of Hello.txt 
seek r, 0, 0; 

print "\nAppending to File..."; 

# Appending to Hello.txt using print 
print A "New appended contents "; 

# Appending to Hello.txt using print 
print A "\n Hello Itians!!!"; 

# close the FileHandle 
close(A); 


# Close the FileHandle 
close(r); 

