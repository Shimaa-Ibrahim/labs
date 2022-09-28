#!/usr/bin/perl 
$directory = "/home/ziyad/test/remove_me"; 

# This removes perl directory 
rmdir($directory ) or die "Couldn't remove $directory directory, $!"; 
		
print "Directory removed \n"; 
