#!/usr/bin/perl 
use 5.010;
use Scalar::Util 'looks_like_number';

say('insert a string:');
chomp ($s = <>);

say('insert a number:');
chomp ($num = <>);
if (looks_like_number($num)){
    for(1 .. $num) {
        say($s);
    }
}else{
    say("$num is not a number try again later!");
}    
