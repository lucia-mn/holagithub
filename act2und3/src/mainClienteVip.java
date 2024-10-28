public class mainClienteVip {
    public static void main(String[] args) {

        ClienteVip clienteVip = new ClienteVip();
        ClienteVip clienteVip2 = new ClienteVip("lucia", 20000);
        ClienteVip clienteVip4 = new ClienteVip("luis", 2500, "lucia@gmail", ClienteVip.TipoVip.GOLD);

        System.out.println("El nombre del cliente es: " + clienteVip.getNombre());
        System.out.println("El nombre del segundo cliente es: " + clienteVip2.getNombre());
        System.out.println("El nombre del tercer cliente es: " + clienteVip4.getNombre());

        System.out.println("El límite de crédito del cliente es: " + clienteVip.getLimiteCredito());
        System.out.println("El límite de crédito del segundo cliente es: " + clienteVip2.getLimiteCredito());
        System.out.println("El límite de crédito del tercer cliente es: " + clienteVip4.getLimiteCredito());

        System.out.println("El mail del cliente es: " + clienteVip.getEmail());
        System.out.println("El mail del segundo cliente es: " + clienteVip2.getEmail());
        System.out.println("El mail del tercer cliente es: " + clienteVip4.getEmail());

    }
}