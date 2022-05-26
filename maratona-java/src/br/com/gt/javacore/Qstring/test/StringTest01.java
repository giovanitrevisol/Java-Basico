package br.com.gt.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Giovani";
        String nome2 = "Giovani";
        System.out.println(nome == nome2);
//        OBS: Neste caso estamos fazendo um comparação de strings usando o ==,
//        pois neste caso as duas strings estão apontando para o mesmo lugar no "pull Strings do java"
//        Isso é ligado com imutalibidade das strings, veja:
        nome.concat(" Trevisol");
        System.out.println(nome); //R: Giovani
//        Ou seja, mesmo usando o concat, a string não foi alterada.
//        apos o nome.concat ser executado, criu-se uma nova variable no "pull de String" porem esta ainda não esta referenciada;
        String nome3 = nome.concat( "Trevisol");
//        Por isso sempre precisamos referenciar as string.
//        Assim pegamos esta nova posição no poll de string e apontamos para uma variável visivel para nós.

        String nome4 = new String("Giovani");
        System.out.println(nome == nome4); //R : false
        //Neste caso é false pois a var nome esta no pull de String,
        //já o nome4 foi criada como um objeto, neste caso não esta no mesmo local de memória

    }
}
