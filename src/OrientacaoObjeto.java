public class OrientacaoObjeto {
    public static void main(String[] args) {

        System.out.println(System.getenv("JAVA_HOME"));
        OrientacaoObjeto.printMessage("Running");

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }

    public static void printMessage(String mensagem) {
        System.out.println(mensagem);
    }
}
