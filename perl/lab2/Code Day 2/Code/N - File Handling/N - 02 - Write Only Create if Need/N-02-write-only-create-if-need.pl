#!/usr/bin/perl 

# Opening File Hello.txt in Read mode 
open(r, "<", "Hello.txt"); 

# Printing the existing content of the file
print("Read from the first time! \n");
print("Existing Content of Hello.txt: " . <r>); 

# Opening File in Write mode 
open(w, ">", "Hello.txt"); 

# Set r to the beginning of Hello.txt 
seek r, 0, 0; 

print "\n \n Writing to File..."; 

# Writing to Hello.txt using print 
print w "Content of this file is changed"; 

# Closing the FileHandle 
close(w); 

# Set r to the beginning of Hello.txt 
seek r, 0, 0; 

# Print the current contents of Hello.txt 
print("\n \n Read from the secind time!");
print("\n Updated Content of Hello.txt: \n ".<r>); 

# Close the FileHandle 
close(r); 

