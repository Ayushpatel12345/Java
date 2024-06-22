public class POLYmovie {
    private String title;

    public POLYmovie(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static POLYmovie getPOLYmovie(String type,String title){
      return switch (type.toUpperCase().charAt(0)){
          case 'A' -> new Adventure(title);
          case 'C' -> new Comedy(title);
          case 'S' -> new ScienceFiction(title);
          default -> new POLYmovie(title);
      };
    }
}

class Adventure extends POLYmovie{
    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "pleasnt movie",
                "scary music",
                "something bad happens");
    }
}

class Comedy extends POLYmovie{
    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "comedy pic",
                "comedy bus",
                "something comedy happy");
    }
}

class ScienceFiction extends POLYmovie{
    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "science is easy",
                "science fiction is hard",
                "science fiction is difficult");
    }
}
