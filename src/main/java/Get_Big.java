public class Get_Big {
    // state instance variable
    private String workout;
    private String muscle ;
    private int reps;
    private int sets;

    //conductor
    public Get_Big (String w, String m, int r, int s){
        workout = w;
        muscle = m;
        reps = r;
        sets = s;
    }
    //behavior
    public void add_workout(String x){

        this.workout = x;
    }
    public void add_muscle(String x){
        this.muscle = x;
    }
    public void set_reps(int x) {
        this.reps = x;
    }
    public void set_sets(int x) {
        this.sets = x;
    }
    public void add_reps(int x) {
        this.reps += x;
    }
    public void add_sets(int x) {
        this.sets += x;
    }
    public void subtract_reps(int x) {
        this.reps -= x;
    }
    public void subtract_sets(int x) {
        this.sets -= x;
    }
    public String get_workout(){
        return(this.workout);
    }
    public String get_muscle(){
        return(this.muscle);
    }
    public int get_reps(){
        return(this.reps);
    }
    public int get_sets(){
        return(this.sets);
    }
    public String print_out(){
        return("Workout: " + this.workout + "\nMuscle: " + this.muscle + "\nReps: " + this.reps + "\nSets: " + this.sets);

    }
}
