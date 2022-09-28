#!/usr/bin/perl 
use 5.010;

say('Enter file name:');
chomp ($file_name = <>);

open(f, "<", $file_name) or die $!; 

while($line = <f>){
 print $file_name." : ".$line;
}
print "\n";

close(f); 
