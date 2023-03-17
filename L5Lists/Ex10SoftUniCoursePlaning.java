package L5Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex10SoftUniCoursePlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> courses = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")){
            String[] command = input.split(":");
            String lesson1 = command[1];

            switch (command[0]){
                case "Add":
                    courses.add(command[1]);
                    break;

                case "Insert":
                    if(!courses.contains(command[1])){
                        courses.add(Integer.parseInt(command[2]), command[1]);
                    }
                    break;

                case "Remove":
                    int indexOfLesson = courses.indexOf(command[1]);
                    if(courses.contains(command[1])){
                        courses.remove(command[1]);
                    }
                    if(courses.contains(lesson1+"-Exercise")){
                        courses.remove(indexOfLesson+1);
                    }
                    break;
                case "Swap":
                    // String lesson1 = command[1];
                    String lesson2 = command[2];
                    if(courses.contains(command[1]) && courses.contains(command[2])){
                        int indexOfLesson1 = courses.indexOf(lesson1);
                        int indexOfLesson2 = courses.indexOf(lesson2);

                        courses.set(indexOfLesson1, lesson2);
                        courses.set(indexOfLesson2, lesson1);

                        if(courses.contains(lesson1+"-Exercise")){
                            courses.remove(indexOfLesson1+1);
                            courses.add(indexOfLesson2+1, command[1]+"-Exercise");
                        }
                        if(courses.contains(lesson2+"-Exercise")) {
                            courses.remove(indexOfLesson2+1);
                            courses.add(indexOfLesson1+1, command[2]+"-Exercise");
                        }
                    }
                    break;
                case "Exercise":
                    if(courses.contains(command[1]) && !courses.contains(command[1]+"-Exercise")){
                        courses.add(courses.indexOf(command[1]) + 1, command[1]+"-Exercise");
                    }else if (!courses.contains(command[1])) {
                        courses.add(command[1]);
                        courses.add(command[1]+"-Exercise");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        for(int i = 0; i < courses.size(); i++) {
            System.out.printf("%d.%s%n", i+1, courses.get(i));
        }
    }
}