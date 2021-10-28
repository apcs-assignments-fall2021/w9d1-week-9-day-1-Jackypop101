public class Get_Big_Tests {
    public static void main(String[] args) {
        Get_Big part1 = new Get_Big("Pushups", "Chest", 25, 8);
        System.out.println(part1.get_workout()); //Pushups
        System.out.println(part1.get_muscle()); //Chests
        System.out.println(part1.get_reps()); //25
        System.out.println(part1.get_sets()); //8
        part1.add_workout("Toe to bar");
        part1.add_muscle("Abs");

        part1.set_reps(10);
        part1.set_sets(6);
        System.out.println(part1.get_workout()); //Toe to bar
        System.out.println(part1.get_muscle()); //Abs
        System.out.println(part1.get_reps()); // 10
        System.out.println(part1.get_sets()); // 6

        part1.add_reps(5);
        part1.add_sets(2);
        System.out.println(part1.get_reps()); // 15
        System.out.println(part1.get_sets()); // 8

        part1.subtract_reps(10);
        part1.subtract_sets(4);
        System.out.println(part1.get_reps()); // 5
        System.out.println(part1.get_sets()); // 2

        System.out.println(part1.print_out());
    }
    }
