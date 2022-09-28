# Open Hello.txt in Read-Append Mode 
open(ra, "+>>", "Hello.txt"); 

# Set ra to the beginning of the File for reading. 
seek ra, 0, 0; 

# Original content of the File 
# is NOT cleared when the File is opened 
print("Existing Content of the File: \n" . <ra>); 

print "\nAppending to the File...."; 

# The string is appended to the File 
print ra "Added using Read-Append Mode\n"; 



# Closing the File 
close(rw); 

