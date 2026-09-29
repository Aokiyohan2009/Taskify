public class MiniPeta3Profile {
    private String name;
    private String username;
    private String email;
    private String course;
    private String section;

    // Constructor
    public MiniPeta3Profile(String name, String username, String email, String course, String section) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.course = course;
        this.section = section;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public String getSection() {
        return section;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSection(String section) {
        this.section = section;
    }

    // Display Profile
    public void displayProfile() {
        System.out.println("\n===== MY PROFILE =====");
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);
        System.out.println("======================");
    }
}
