create table Livro(
	id_livro integer,
	nome varchar(15),
	autor varchar(40),
	sinopse varchar(500),
	id_professor integer,
	primary key (id_livro),
	foreign key (id_professor)
	references professores (id_professor)
)