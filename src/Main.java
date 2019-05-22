public class Main {

    public static void main(String args[]){
        Usuario u1 = new Usuario("Pedro");
        u1.logar();
        Usuario u2 = new Usuario("João");
        u2.logar();
        Usuario u3 = new Usuario("Paulo");
        u3.logar();

        System.out.println(u2.totalUsuarioLogados);


    }

}
