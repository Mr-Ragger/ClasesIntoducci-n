
public class Main {

	public static void main(String[] args) {

		Usuario miUsuario = new Usuario();

		Usuario miSegundoUsuario = new Usuario();

		miUsuario.email = "email@email.com";
		miUsuario.nombre = "Yotoko Turaja";
		miUsuario.comprobarEdad();

		miSegundoUsuario.contrase�a = "abc";

		System.out.println("Mi email es: " + miUsuario.email + " y mi usuario es: " + miUsuario.nombre);
	}

}
