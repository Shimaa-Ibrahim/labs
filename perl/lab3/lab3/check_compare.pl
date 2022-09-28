#!/usr/bin/perl 
use lib '/home/shimaa/perl/lab3';
use Compare;

$a = 'John Paul';
@b = [1,2,3]; 

Compare::compare_array($a, \@b); 

@a = [2,2,3]; 
@b = [1,2,3]; 
Compare::compare_array(\@a, \@b); 

@a = [1,2,3]; 
@b = [1,2,3]; 
Compare::compare_array(\@a, \@b); 

@a = [1,2,3]; 
%b = ('John Paul', 45, 'Lis', 30, 'Kumar', 50); 
Compare::compare_hash(\@a, \%b); 


%a = ('another', 45, 'Lis', 30, 'Kumar', 50); 
%b = ('John Paul', 45, 'Lis', 30, 'Kumar', 50); 
Compare::compare_hash(\%a, \%b); 


%a = ('John Paul', 45, 'Lis', 30, 'Kumar', 50); 
%b = ('John Paul', 45, 'Lis', 30, 'Kumar', 50); 
Compare::compare_hash(\%a, \%b); 


%a = ('John Paul', 45, 'Lis', 30, 'Kumar', 50); 
%b = ('John Paul', 45, 'Lis', 30, 'Kumar', 50); 
Compare::compare_hash_key(\%a, \%b); 


$a = 'another';
%b = ('John Paul', 45, 'Lis', 30, 'Kumar', 50); 

Compare::compare_hash_key($a, \%b); 

$a = 'John Paul';
%b = ('John Paul', 45, 'Lis', 30, 'Kumar', 50); 

Compare::compare_hash_key($a, \%b); 