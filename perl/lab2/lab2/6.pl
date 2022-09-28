#!/usr/bin/perl 
use 5.010;

$dirname = '.';
opendir(DIR, $dirname) or die "Could not open $dirname\n";

while ($filename = readdir(DIR)) {
    if(-l $filename){ 
            print("$filename : is softlink\n"); 
        } else{ 
        print("$filename : is not softlink\n"); 
        }
}
closedir(DIR);
