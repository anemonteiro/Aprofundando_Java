package classes_metodos.data;

public class Data {
    int dia;
    int mes;
    int ano;

    String formatarData(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
