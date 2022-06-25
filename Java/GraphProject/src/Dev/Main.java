package Dev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, City> cities = new HashMap<>();

        File cityFile = new File(args[0]);
        try {
            Scanner scanner = new Scanner(cityFile);

            while (scanner.hasNextLine()) {
                String readData = scanner.nextLine();
                String[] splitData = readData.split(";");

                if (splitData[0].charAt(0) == '0') {
                    splitData[0] = splitData[0].substring(1);
                }

                City city = new City(Integer.parseInt(splitData[0]), splitData[1].toLowerCase());

                for (int i = 2; i <= 82; i++) {
                    city.addDistance(Integer.parseInt(splitData[i]));
                }

                cities.put(city.getID(), city);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File adjacentFile = new File(args[1]);
        try {
            Scanner scanner = new Scanner(adjacentFile);
            while (scanner.hasNextLine()){
                String readLine = scanner.nextLine().toLowerCase();
                String[] splitData = readLine.split(","); //Regular Expression

                int index = 1;
                for(Map.Entry<Integer,City> currentCity : cities.entrySet()){
                    if(currentCity.getValue().getName().equals(splitData[0])){
                        HashMap<Integer,City> currentCitiesAdjacency = new HashMap<>();
                        boolean controller = true;
                        while (controller){
                            for(Map.Entry<Integer,City> target : cities.entrySet()){
                                if(target.getValue().getName().equals(splitData[index])){
                                    currentCitiesAdjacency.put(target.getKey(),target.getValue());
                                    index++;
                                    if(index == splitData.length)
                                        controller = false;
                                    break;
                                }
                            }
                        }
                        currentCity.getValue().setAdjacency(currentCitiesAdjacency);
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        List<List<Node>> adj = new ArrayList<>();

        for(int i = 0; i<81; i++){
            List<Node> item = new ArrayList<>();
            adj.add(item);
        }

        for(Map.Entry<Integer,City> entry: cities.entrySet()){
            City currentCity = entry.getValue();
            for(Map.Entry<Integer,City> adjEntry: currentCity.getAdjacency().entrySet()){
                adj.get(currentCity.getID()-1).add(new Node(adjEntry.getValue().getID(),currentCity.getDistances().get(adjEntry.getValue().getID()-1)));
            }
        }

        Dijakstra dijakstra = new Dijakstra(81);
        dijakstra.dijakstra(adj,1);

        System.out.println("The shortest path from node: ");

        for(int i = 0; i<dijakstra.dist.length; i++){
            System.out.println(cities.get(1).getName() + " ===> " + cities.get(i+1).getName() + " is " + dijakstra.dist[i]);
        }

        System.out.println(cities);

    }
}
