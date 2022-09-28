#!/usr/bin/perl 
use 5.010;

say('Enter your name :');
chomp ($name = <>);
$flag = 0;

sub check{
    open(f, "<", "users.txt") or die $!; 
    while($line = <f>){
        @list = split(':',$line);
        if($list[0] =~ $_[0]){
            $flag = 1;
            say('Enter your password :');
            chomp ($pass = <>);
            if($list[1] =~ $pass){
                say('you are logged in :)');
            }else{
                say('password is not correct.. try again later!');
                }
            }
        }
    close(f); 
}

check($name);
while($flag == 0){
        say('Incorrect username... Enter your name :');
        chomp ($username = <>);
        check($username);
    }


