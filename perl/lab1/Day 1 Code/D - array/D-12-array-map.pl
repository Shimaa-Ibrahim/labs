# Initializing a list 
@Dept = ('comp', 'inft', 'extc', 'mech'); 

# Converting first character capital 
@upd1 = map(ucfirst, @Dept); 

# Printing list 
print "List with First char capital: "; 
foreach $i (@upd1) 
{ 
print "$i, "; 
} 

# Converting all characters capital 
@upd2 = map(uc, @Dept); 

# Printing list 
print "\nList with all char capital: "; 
foreach $i (@upd2) 
{ 
print "$i, "; 
} 

