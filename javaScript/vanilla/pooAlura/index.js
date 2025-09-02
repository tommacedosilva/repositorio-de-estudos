console.log("############## Sistema do ByteBank ##############");

class Cliente{
    nome;
    cpf;
    rg;
}

class ContaCorrente{
    agencia;
    saldo;

    sacar(valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }
    }
}

const cliente1 = new Cliente();
cliente1.nome = "Tom";
cliente1.cpf = 1234567890;

const cliente2 = new Cliente();
cliente2.nome = "Cinthia";
cliente2.cpf = 9876543210;

const contaCorrenteTom = new ContaCorrente();
contaCorrenteTom.saldo = 0;
contaCorrenteTom.agencia = 1001;

console.log(contaCorrenteTom.saldo);
contaCorrenteTom.saldo = 100;
console.log(contaCorrenteTom.saldo);
contaCorrenteTom.sacar(50);

console.log(contaCorrenteTom.saldo);

console.log(cliente1);
console.log(cliente2);
