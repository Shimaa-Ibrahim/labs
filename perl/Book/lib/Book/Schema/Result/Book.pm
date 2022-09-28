use utf8;
package Book::Schema::Result::Book;

# Created by DBIx::Class::Schema::Loader
# DO NOT MODIFY THE FIRST PART OF THIS FILE

=head1 NAME

Book::Schema::Result::Book

=cut

use strict;
use warnings;

use Moose;
use MooseX::NonMoose;
use MooseX::MarkAsMethods autoclean => 1;
extends 'DBIx::Class::Core';

=head1 COMPONENTS LOADED

=over 4

=item * L<DBIx::Class::InflateColumn::DateTime>

=back

=cut

__PACKAGE__->load_components("InflateColumn::DateTime");

=head1 TABLE: C<books>

=cut

__PACKAGE__->table("books");

=head1 ACCESSORS

=head2 id

  data_type: 'int'
  is_nullable: 0
  size: 11

=head2 name

  data_type: 'varchar'
  is_nullable: 1
  size: 50

=head2 author

  data_type: 'varchar'
  is_nullable: 1
  size: 50

=cut

__PACKAGE__->add_columns(
  "id",
  { data_type => "int", is_auto_increment=> 1, is_nullable => 0, size => 11},
  "name",
  { data_type => "varchar", is_nullable => 1, size => 50 },
  "author",
  { data_type => "varchar", is_nullable => 1, size => 50 },
);

=head1 UNIQUE CONSTRAINTS

=head2 C<PRIMARY>

=over 4

=item * L</id>

=back

=cut

__PACKAGE__->set_primary_key("id");


# Created by DBIx::Class::Schema::Loader v0.07049 @ 2020-05-17 14:59:20
# DO NOT MODIFY THIS OR ANYTHING ABOVE! md5sum:LwJtt2xESZ0z5LgorMLBNg


# You can replace this text with custom code or comments, and it will be preserved on regeneration
__PACKAGE__->meta->make_immutable;
1;
