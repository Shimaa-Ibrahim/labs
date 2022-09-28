#!/usr/bin/perl 
package MooseAnimal;
use Moose;


has 'Name' => ( is => 'rw', isa => 'Str', required => 1);
has 'Age' => ( is => 'rw', isa => 'Int', default => 5);

sub get_name
{
  my $self = shift;
  return $self->Name;
}

sub get_age
{
  my $self = shift;
  return $self->Age;
}

sub talk
{
  my $self = shift;
  print "I am an animal \n";
}


my $dog = MooseAnimal->new("Name"=>"dog");
print $dog->get_name()."\n" ; 
print $dog->get_age()."\n";  
print $dog->talk(); 
