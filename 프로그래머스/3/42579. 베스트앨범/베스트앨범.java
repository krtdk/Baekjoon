import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genrePlay = new HashMap<>();
        HashMap<String, List<int[]>> genreSong = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            
            genrePlay.put(genre, genrePlay.getOrDefault(genre, 0) + play);
            
            genreSong.putIfAbsent(genre, new ArrayList<> ());
            genreSong.get(genre).add(new int[]{i, play});
        }
        
        List<String> sortedGenres = new ArrayList<>(genrePlay.keySet());
        sortedGenres.sort((a,b) -> genrePlay.get(b) - genrePlay.get(a));
        
        List<Integer> result = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<int[]> songs = genreSong.get(genre);
            songs.sort((a,b) -> b[1] == a[1] ? a[0] - b[0] : b[1] - a[1]);
            
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                result.add(songs.get(i)[0]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}