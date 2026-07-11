import java.util.HashSet;
import java.util.Set;

/**
 * Data Structures Lab 4: Set - Student Exam Results Analysis
 */
public class SetLab {

    public static void main(String[] args) {

        System.out.println("=== STUDENT EXAM RESULTS ANALYSIS ===");
        System.out.println("Learning HashSet operations through exam result analysis\n");


        // SECTION 1: Creating Sets
        System.out.println("1. Creating sets for students who passed each exam...");

        Set<String> mathPassers = new HashSet<>();
        Set<String> englishPassers = new HashSet<>();
        Set<String> sciencePassers = new HashSet<>();

        System.out.println("   Three subject sets created!");
        System.out.println();


        // SECTION 2: Adding Students
        System.out.println("2. Adding students who passed each exam...");

        mathPassers.add("Alice");
        mathPassers.add("Bob");
        mathPassers.add("Charlie");
        mathPassers.add("Diana");
        mathPassers.add("Eve");

        englishPassers.add("Alice");
        englishPassers.add("Bob");
        englishPassers.add("Frank");
        englishPassers.add("Grace");
        englishPassers.add("Diana");

        sciencePassers.add("Charlie");
        sciencePassers.add("Diana");
        sciencePassers.add("Eve");
        sciencePassers.add("Frank");
        sciencePassers.add("Henry");

        System.out.println("   Math passers: " + mathPassers);
        System.out.println("   English passers: " + englishPassers);
        System.out.println("   Science passers: " + sciencePassers);
        System.out.println();


        // SECTION 3
        System.out.println("3. Testing membership...");

        boolean alicePassedMath = mathPassers.contains("Alice");
        boolean johnPassedEnglish = englishPassers.contains("John");

        System.out.println("   Did Alice pass Math? " + alicePassedMath);
        System.out.println("   Did John pass English? " + johnPassedEnglish);
        System.out.println();


        // SECTION 4
        System.out.println("4. Testing duplicate handling...");

        boolean addedAlice = mathPassers.add("Alice");
        boolean addedNewStudent = mathPassers.add("Zoe");

        System.out.println("   Adding Alice again returned: " + addedAlice);
        System.out.println("   Adding Zoe returned: " + addedNewStudent);
        System.out.println("   Math passers: " + mathPassers);
        System.out.println();


        // SECTION 5
        System.out.println("5. Students who passed ALL three exams...");

        HashSet<String> allThreePassers =
                new HashSet<>(mathPassers);

        allThreePassers.retainAll(englishPassers);
        allThreePassers.retainAll(sciencePassers);

        System.out.println(
                "   All three passers: "
                + allThreePassers
        );

        System.out.println();


        // SECTION 6
        System.out.println("6. Students who passed AT LEAST one exam...");

        HashSet<String> atLeastOnePassers =
                new HashSet<>(mathPassers);

        atLeastOnePassers.addAll(englishPassers);
        atLeastOnePassers.addAll(sciencePassers);

        System.out.println(
                "   At least one: "
                + atLeastOnePassers
        );

        System.out.println();


        // SECTION 7
        System.out.println("7. Students who passed exactly two exams...");

        HashSet<String> exactlyTwoPassers =
                new HashSet<>(atLeastOnePassers);

        exactlyTwoPassers.removeAll(allThreePassers);


        HashSet<String> onlyMath =
                new HashSet<>(mathPassers);

        onlyMath.removeAll(englishPassers);
        onlyMath.removeAll(sciencePassers);


        HashSet<String> onlyEnglish =
                new HashSet<>(englishPassers);

        onlyEnglish.removeAll(mathPassers);
        onlyEnglish.removeAll(sciencePassers);


        HashSet<String> onlyScience =
                new HashSet<>(sciencePassers);

        onlyScience.removeAll(mathPassers);
        onlyScience.removeAll(englishPassers);


        exactlyTwoPassers.removeAll(onlyMath);
        exactlyTwoPassers.removeAll(onlyEnglish);
        exactlyTwoPassers.removeAll(onlyScience);


        System.out.println(
                "   Exactly two exams: "
                + exactlyTwoPassers
        );

        System.out.println();


        // SECTION 9
        System.out.println("9. Detailed student analysis...");

        for (String student : atLeastOnePassers) {

            System.out.print(
                    "   " + student + " passed: "
            );

            if (mathPassers.contains(student))
                System.out.print("Math ");

            if (englishPassers.contains(student))
                System.out.print("English ");

            if (sciencePassers.contains(student))
                System.out.print("Science ");

            System.out.println();
        }


        System.out.println();


        // SECTION 11
        System.out.println("11. Remove operation demo...");

        HashSet<String> testSet =
                new HashSet<>(mathPassers);

        boolean removed = testSet.remove("Alice");
        boolean removedAgain = testSet.remove("Alice");

        System.out.println("   Removed Alice: " + removed);
        System.out.println("   Removed again: " + removedAgain);
        System.out.println("   Test set: " + testSet);


        System.out.println();


        // SECTION 12
        System.out.println("12. Final statistics...");

        int exactlyOneCount =
                atLeastOnePassers.size()
                - allThreePassers.size()
                - exactlyTwoPassers.size();


        System.out.println(
                "   Total unique students: "
                + atLeastOnePassers.size()
        );

        System.out.println(
                "   Passed all three: "
                + allThreePassers.size()
        );

        System.out.println(
                "   Passed exactly two: "
                + exactlyTwoPassers.size()
        );

        System.out.println(
                "   Passed exactly one: "
                + exactlyOneCount
        );


        System.out.println("\n=== LAB COMPLETE ===");

    }
}