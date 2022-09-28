#!/usr/bin/perl 
use 5.010;
use Scalar::Util 'looks_like_number';

say('insert today\'s temperature:');
chomp ($num = <>);
if (looks_like_number($num)){
    if ($num > 35){
        say("too hot");
    }elsif($num>=28 and $num<=35){
         say("just right!");
    }else{
        say("too cold");
    }
}else{
    say("$num is not a number try again later!");
}    