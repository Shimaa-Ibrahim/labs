#!/usr/bin/perl 

my $directory = '/home/ziyad/test'; 
opendir (DIR, $directory) or die "No directory, $!"; 
while ($file = readdir DIR) 
{ 
	print "$file\n"; 
} 
closedir DIR; 
