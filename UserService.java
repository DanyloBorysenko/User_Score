package org.example;

public class UserService {
    public int getUserScore(String[] records, String email) {
        if (records == null || email == null) {
            throw new UserNotFoundException("User with given email doesn't exist");
        }
        String [] record = new String[2];
        int score = 0;
        for (int i = 0; i < records.length; i++) {
            record = records[i].split(":");
            if (record[0].equals(email)) {
                score = Integer.parseInt(record[1]);
                break;
            } else if (i == records.length - 1) {
                throw new UserNotFoundException("User with given email doesn't exist");
            }
        }
        return score;
    }
}
