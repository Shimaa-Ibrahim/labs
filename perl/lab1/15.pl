#!/usr/bin/perl   
use 5.010;

say('insert a values separated by space:');
chomp ($s = <>);
@list = split(/ /, $s);
%hash = @list;
while (($key, $value) = each(%hash)) 
{ 
    say("$key => $value"); 
} 
