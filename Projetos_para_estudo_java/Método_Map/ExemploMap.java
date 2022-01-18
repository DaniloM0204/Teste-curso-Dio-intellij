package Método_Map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        /*Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
        modelo = gol - consumo = 14,4 km/L
        modelo = uno - consumo = 15,6 km/L
        modelo = mobi - consumo = 16,1 km/L
        modelo = hb20 - consumo = 14,5 km/L
        modelo = kwid - consumo = 15,6 km/L*/

        System.out.println("Crie um dicionário que relacione os modelos e seus repectivos consumos");
        Map <String, Double> carrosPopulares = new HashMap <>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson est´adiconado" + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos: ");
        Set <String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection <Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais ecônomico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set <Map.Entry <String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry <String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) modeloMaisEficiente = entry.getKey();
            System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
        }

        System.out.println("Exiba o modelo menos ecônomico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry :carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente))
                modeloMenosEficiente = entry.getKey();
            System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + consumoMenosEficiente);
        }

        Iterator <Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a som dos consumos: " + soma);

        System.out.println("Exiba a média de consumo deste dícionario de carros: " + (soma/carrosPopulares.size()));

        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com consumo igual a 15,6 km/l ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem que foram infromados ");
        Map <String, Double> carrosPopulares1 = new LinkedHashMap <>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba um dícionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap <>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dícionario está vazio: " + carrosPopulares.isEmpty());



    }

}
