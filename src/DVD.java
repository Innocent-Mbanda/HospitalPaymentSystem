

public class DVD {

    DVD []dvdCollection =new DVD[15];
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public void String (){
        System.out.printf(this.name + "directed by" + this.director + ", " +
                "released in " + this.releaseYear);

    }


}
