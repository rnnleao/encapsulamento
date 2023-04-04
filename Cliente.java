public class Cliente {
    
    public static void main(String[] args) {
        
        Conta conta=new Conta();
        conta.setNumero(1136);
        conta.nome="Renan";
        conta.salario=10000;

        System.out.println(conta.nome);
        System.out.println(conta.salario);
        System.out.println(conta.getNumero());
    }
}
