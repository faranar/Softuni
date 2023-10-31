import java.util.*;

public class Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < numSongs; i++) {
            String[] input = scanner.nextLine().split("_");
            String type = input[0];
            String name = input[1];
            String time = input[2];
            Song song = new Song();
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);
            songs.add(song);
        }

        String filter = scanner.nextLine();
        if (filter.equals("all")){
            for (Song song: songs) {
                System.out.println(song.getName());
            }
        }else {
            for (Song song: songs) {
                if (song.getTypeList().equals(filter)){
                    System.out.println(song.getName());
                }
            }
        }

    }
}
