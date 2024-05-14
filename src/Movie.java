public class Movie {
    private int movieid;
    private String movieTitle;
    private String image;
    private int categoryid;
    private String subheading;

    public Movie(int movieid, String movieTitle, String image, int categoryid, String subheading) {
        this.movieid = movieid;
        this.movieTitle = movieTitle;
        this.image = image;
        this.categoryid = categoryid;
        this.subheading = subheading;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getSubheading() {
        return subheading;
    }

    public void setSubheading(String subheading) {
        this.subheading = subheading;
    }
}
