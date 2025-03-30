import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {

        User user1 = new User(1,4500);
        User user2 = new User(1, 1500);
        User user3 = new User(2, 1000);
        User user4 = new User(2, 1000);
        User user5 = new User(3, 4000);
        User user6 = new User(3, 2000);

        List<User> userListDay1 = new ArrayList<>();
        Collections.addAll(userListDay1, user1, user2, user3);

        List<User> userListDay2 = new ArrayList<>();
        Collections.addAll(userListDay2, user4, user5, user6);

        Days days1 = new Days(userListDay1);
        Days days2 = new Days(userListDay2);

        List<Days> daysList = new ArrayList<>();
        Collections.addAll(daysList, days1, days2);

        System.out.println(daysList);
        System.out.println(championsUsers(daysList));


    }

    public static Champions championsUsers (List<Days> daysList) {
        Map<Integer, Integer> userMap = daysList.stream()
                .flatMap(days -> days.getDaysList().stream())
                .collect(Collectors.toMap(User::getUserId, User::getSteps, Integer::sum));

        Integer maxSteps = userMap.values().stream()
                .max(Comparator.naturalOrder())
                .orElse(0);

        List<Integer> championsUserId = userMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(maxSteps))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return new Champions(championsUserId, maxSteps);
    }
}

class User {
    int userId;

    int steps;

    public User(int userId, int steps) {
        this.userId = userId;
        this.steps = steps;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getUserId() == user.getUserId() && getSteps() == user.getSteps();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getSteps());
    }

    @Override
    public String toString() {
        return "{" +
                "userId: " + userId +
                ", steps: " + steps +
                '}';
    }
}

class Days {
    List<User> daysList;

    public Days(List<User> daysList) {
        this.daysList = daysList;
    }

    public List<User> getDaysList() {
        return daysList;
    }

    public void setDaysList(List<User> daysList) {
        this.daysList = daysList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Days days)) return false;
        return Objects.equals(getDaysList(), days.getDaysList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDaysList());
    }

    @Override
    public String toString() {
        return daysList.toString();
    }
}

class Champions {
    List<Integer> userIds;

    Integer steps;

    public Champions(List<Integer> userIds, Integer steps) {
        this.userIds = userIds;
        this.steps = steps;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "champions = {" +
                "userIds: " + userIds +
                ", steps: " + steps +
                '}';
    }
}

