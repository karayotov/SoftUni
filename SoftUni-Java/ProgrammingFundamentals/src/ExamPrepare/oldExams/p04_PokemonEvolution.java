//package ExamPrepare.oldExams;
//
//import javax.lang.model.type.TypeKind;
//import java.util.Arrays;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class p04_PokemonEvolution {
//
//    //public static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        //    You will receive input lines in the following format:
//        //    {pokemonName} -> {evolutionType} -> {evolutionIndex}
//        //    The pokemonName and evolutionType will be strings. The evolutionIndex will be an integer
//        String inputStr = scanner.nextLine();
//        String name = "";
//
//        Map<String, LinkedHashMap<String, Integer>> nestedMap = new LinkedHashMap<String, LinkedHashMap<String, Integer>>();
//
//        while (!inputStr.equals("wubbalubbadubdub")){
//
//            String[] inputArr = inputStr.split(" -> ");
//            name = inputArr[0];
//            if (inputArr.length > 1){
//                String evolutionType = inputArr[1];
//                int evolutionIndex = Integer.parseInt(inputArr[2]);
//
//                if (!nestedMap.containsKey(name)){
//                    nestedMap.put(name, new LinkedHashMap(){{put(evolutionType, evolutionIndex);}});
//                }else {
//                    nestedMap.get(name).put(evolutionType, evolutionIndex);
//                }
//            }else{
//                if (nestedMap.containsKey(name)){
//                    for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : nestedMap.entrySet()){
//                        System.out.printf("# %s", name);
//                        System.out.println();
//                        System.out.println(nestedMap.get(name));
//                    }
//                }
//            }
//            inputStr = scanner.nextLine();
//        }
//
//    }
//}
