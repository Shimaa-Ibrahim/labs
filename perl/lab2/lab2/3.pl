#!/usr/bin/perl 
use 5.010;

system 'pwd';
 
say('Enter directory path:');
chomp ($path = <>); 
chdir $path;
system 'ls -1';




