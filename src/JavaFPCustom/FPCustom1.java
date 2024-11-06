package JavaFPCustom;


import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{

    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String toString()
    {
        return name + ":" +category +":" + reviewScore +":"+ noOfStudents;
    }
}

public class FPCustom1 {

    public static void main(String[] args) {

        List<Course> courses = List.of(
                new Course("Mca", "technical", 95, 1000),
        new Course("Data Science", "technical", 88, 750),
        new Course("Creative Writing", "arts", 92, 1200),
        new Course("Cyber Security", "technical", 94, 600),
        new Course("Digital Marketing", "business", 90, 1000),
        new Course("Philosophy", "humanities", 85, 500)
            );

        Predicate<Course> ReviewScoreGreaterthan85 = Course -> Course.getReviewScore() > 85;
        Predicate<Course> ReviewScoreGreaterthan90 = Course -> Course.getReviewScore() > 90;
        Predicate<Course> ReviewScoreLesserthan85 = Course -> Course.getReviewScore() < 85;
        System.out.println(courses.stream().allMatch(ReviewScoreLesserthan85));
        System.out.println(courses.stream().anyMatch(ReviewScoreGreaterthan85));
        System.out.println(courses.stream().noneMatch(ReviewScoreGreaterthan85));


        Comparator<Course> comparingbyNoOfStudentsIncreasing=Comparator.comparing(Course::getNoOfStudents);
        System.out.println(
                courses.stream().sorted(comparingbyNoOfStudentsIncreasing).collect(Collectors.toList())
        );
        System.out.println();
        Comparator<Course> comparingbyNoOfStudentsDecreasing=Comparator.comparing(Course::getNoOfStudents).reversed();
        System.out.println(
                courses.stream().sorted(comparingbyNoOfStudentsDecreasing).collect(Collectors.toList())
        );
        Comparator<Course> comparingbyNoOfStudentsAndReviewScore=
                Comparator.comparing(Course::getNoOfStudents)
                .thenComparing(Course::getReviewScore).reversed();

        System.out.println(
                courses.stream().sorted(comparingbyNoOfStudentsAndReviewScore).collect(Collectors.toList())
        );

        System.out.println("origianl list");
        System.out.println(courses);
        System.out.println(
                courses.stream().sorted(comparingbyNoOfStudentsIncreasing).collect(Collectors.toList())
        );
        System.out.println(
                courses.stream().sorted(comparingbyNoOfStudentsIncreasing).skip(3).collect(Collectors.toList())
        );
        System.out.println(
                courses.stream().sorted(comparingbyNoOfStudentsIncreasing).limit(3).collect(Collectors.toList())
        );
        System.out.println(
                courses.stream().sorted(comparingbyNoOfStudentsIncreasing).takeWhile(course -> course.getReviewScore() > 85).collect(Collectors.toList())
        );

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory))
        );
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,Collectors.counting()))
        );
        //for getting the maximum review score from each category
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,Collectors.maxBy(Comparator.comparing(Course::getReviewScore))))
        );
        //for names of all the courses in a group
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getName,Collectors.toList()))));



    }
}
