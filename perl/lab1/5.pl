#!/usr/bin/perl 
use 5.010;
use Math::Trig;
use Scalar::Util 'looks_like_number';

say('insert first number:');
chomp ($a = <>);   
if (looks_like_number($a)){
    say('insert second number:');
    chomp ($b = <>);

    if (looks_like_number($b)){    
        say("$a*$b = ". $a*$b);
    } else{
        say("$b is not a number try again later!");
    }
    
} else{
    say("$a is not a number try again later!");
}
