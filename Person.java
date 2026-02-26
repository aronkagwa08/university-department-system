public abstract class Person {
    protected String name;
    protected String id;
    protected String email;

    public Person(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public String getEmail() { return email; }

    public void setEmail(String email) {
        this.email = email;   // use of this
    }

    public abstract void displayRole();
}
