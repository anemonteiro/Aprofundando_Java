package classes_metodos.data;

public class DataTeste {
    public static void main(String[] args) {
        Data hoje = new Data();
        hoje.dia = 7;
        hoje.mes = 9;
        hoje.ano = 2024;

        var d2 = new Data();
        d2.dia = 28;
        d2.mes = 11;
        d2.ano = 2024;

        System.out.println(d2.formatarData());
    }
}
