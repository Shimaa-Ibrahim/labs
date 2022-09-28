#!/usr/bin/perl 
use 5.010;
# to read from current dir,comment&uncomment necessery lines"

$file_name = 'file_name.txt';
open(f, "<", $file_name) or die $!; 

# $dirname = '.';
# opendir(DIR, $dirname) or die "Could not open $dirname\n";

while($line = <f>){
# while ($filename = readdir(DIR)) {
    chomp($line);
    $filename = $line;
    if(-e $filename) 
    {
        print("File $filename exists\n"); 
        if(-r $filename){ 
                print("File $filename is readable\n"); 
            } else{ 
            print("File $filename is not readable\n"); 
            } 

            if(-w $filename){ 
                print("File $filename is writable\n"); 
            } else{ 
            print("File $filename is not writable\n"); 
            }

            if(-x $filename){ 
                print("File $filename is executable\n"); 
            } else{ 
            print("File $filename is not executable\n"); 
            } 

            print("\n");
        }else{ 
	print("File $filename does not exists\n"); 
    } 

}
closedir(DIR);
