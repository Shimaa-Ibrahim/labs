package Book::View::HTML;
use Moose;
use namespace::autoclean;

extends 'Catalyst::View::TT';

__PACKAGE__->config(
    TEMPLATE_EXTENSION => '.tt',
    render_die => 1,
    WRAPPER => 'wrapper.tt',
);

=head1 NAME

Book::View::HTML - TT View for Book

=head1 DESCRIPTION

TT View for Book.

=head1 SEE ALSO

L<Book>

=head1 AUTHOR

shimaa,,,

=head1 LICENSE

This library is free software. You can redistribute it and/or modify
it under the same terms as Perl itself.

=cut

1;
