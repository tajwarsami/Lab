package question2;

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " received notification:  " + price);
    }
}
