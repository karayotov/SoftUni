//package L08DictionariesLamdaAndTroubleshooting.exercices;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class p05_HandsOfCarts {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String player = "";
//        Map<String, List<String>> playersMap = new LinkedHashMap<>();
//
//        do{
//            player = scanner.nextLine();
//
//            if (!player.equals("JOKER")){
//                List<String> separrPlayerArr = Arrays.stream(player.split(": "))
//                        .collect(Collectors.toList());
//                String playerName = separrPlayerArr.get(0);
//                String deck = separrPlayerArr.get(1);
//                List<String> cardDecsArr = Arrays.stream(deck.split(", "))
//                        .collect(Collectors.toList());
//
//                for (Map.Entry<String, List>:
////                     ) {
////
////                }
////                List<String> oldDeck = Arrays.stream(entry.)
////                for (Object x : cardDecsArr) {
////                    if (!oldDeck.contains(x))
////                        oldDeck.add(x);
////                }
////                    cardDecsArr.add();
////                    playersMap.get(playerName).add();
////                }
//            }
//        }while (!player.equals("JOKER"));
//    }
//}