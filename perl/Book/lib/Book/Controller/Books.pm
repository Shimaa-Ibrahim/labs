package Book::Controller::Books;
use Moose;
use namespace::autoclean;

BEGIN { extends 'Catalyst::Controller'; }

=head1 NAME

Book::Controller::Books - Catalyst Controller

=head1 DESCRIPTION

Catalyst Controller.

=head1 METHODS

=cut


=head2 index

=cut

sub index :Path :Args(0) {
    my ( $self, $c ) = @_;

    $c->response->body('Matched Book::Controller::Books in Books.');
}

sub list :Local :Args(0) {
    my ( $self, $c ) = @_;
    my @books = [$c->model('DB::Book')->all];
    $c->stash(books =>@books);
    $c->stash(template =>'Books/list.tt');
}


sub delete :Local :Args(1) {
    my ( $self, $c ,$id) = @_;
    my $book = $c->model('DB::Book')->find($id);
    $book->delete();
    $c->response->redirect($c->uri_for($self->action_for('list')));
}

sub form :Local :Args(0) {
    my ( $self, $c ) = @_;
    $c->stash(template =>'Books/form_create.tt');
}

sub form_create :Local :Args(0) {
    my ( $self, $c ) = @_;
    my $name = $c->request->params->{name} || 'N/A';
    my $author = $c->request->params->{author} || 'N/A';
    my $book = $c->model('DB::Book')->create({
        name => $name,
        author => $author,
    });
    $c->stash(book =>$book);
    $c->stash(template =>'Books/form_success.tt');
}

=encoding utf8

=head1 AUTHOR

shimaa,,,

=head1 LICENSE

This library is free software. You can redistribute it and/or modify
it under the same terms as Perl itself.

=cut

__PACKAGE__->meta->make_immutable;

1;
