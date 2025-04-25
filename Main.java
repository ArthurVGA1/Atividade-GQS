public class Main {
    public static void main(String[] args) {
      
        Cliente cliente1 = new Cliente(1, "Maria", 10);

       
        ContaCliente conta1 = new ContaCliente(101, cliente1);
        conta1.addDeposito(500.0); 

       
        conta1.subSaldo(100.0);
        conta1.subSaldo(600.0); 

       
        FaturaCliente fatura1 = new FaturaCliente(201, cliente1, 200.0);
        System.out.println(fatura1.toString());
        System.out.println("Valor com desconto: R$" + String.format("%.2f", fatura1.getValorComDesconto()));

        
        System.out.println(conta1.toString());
    }
}