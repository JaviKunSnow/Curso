package accesohibernate;

public class Main {

	public static void main(String[] args) {
		
//		Album a = new Album(9, "Far Beyond Driven", "Panteras");
//		AlbumDAO.anadir_album(a);
//		
//		AlbumDAO.anadir_album(9, "Far Beyond Driven", "Panteras");
//		AlbumDAO.anadir_album(0, "Nervermind", "Nirvana");
		
//		Album a = AlbumDAO.recuperar_album(1);
//		if(a != null) {
//			System.out.println(a.toString());
//		}
		
		//AlbumDAO.modificar_album(1, "La casa blanca", "Obus");

		//AlbumDAO.borrar_album(12);
		
		//AlbumDAO.consulta("SELECT * from Album"); //NO CORRECTA
		//AlbumDAO.consulta("SELECT a from Album a"); //Nombre del objeto, no de la tabla
		//AlbumDAO.consulta("SELECT a FROM Album a where titulo like '%a%'");
		//AlbumDAO.consulta2("SELECT a.titulo FROM Album a WHERE a.titulo like 'N%'");
		AlbumDAO.consulta3("SELECT a.titulo, a.autor FROM Album a WHERE a.titulo like 'N%'");

	}

}
