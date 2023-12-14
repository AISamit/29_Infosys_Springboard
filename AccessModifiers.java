package day4;
public class AccessModifiers {
    public static void main(String[] args) {
        // Create an object of class InfyTV
        InfyTV infyTV = new InfyTV();

        // Try to access private members directly (This will result in a compilation error)
        // infyTV.correspondent = "Kimberely";  // Error: correspondent has private access
        // infyTV.newsReporter = "Hudson";      // Error: newsReporter has private access
        // infyTV.photographer = "Joshua";      // Error: photographer has private access

        // Access private members using setters
        infyTV.setCorrespondent("Kimberely");
        infyTV.setNewsReporter("Hudson");
        infyTV.setPhotographer("Joshua");

        // Show the documentary to the public
        infyTV.documentaryFilm();
    }
}

class InfyTV {
    private String correspondent;
    private String newsReporter;
    private String photographer;

    // Setter methods to access private members
    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent;
    }

    public void setNewsReporter(String newsReporter) {
        this.newsReporter = newsReporter;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    // Public method to display documentary information
    public void documentaryFilm() {
        System.out.println("A hundred years ago there were 100,000 tigers in the world. Today there are as few as 3,200. Why are tigers disappearing?......");
        System.out.println("by Correspondent: " + correspondent);
        System.out.println("Photographer: " + photographer);
        System.out.println("newsReporter: " + newsReporter);
    }
}