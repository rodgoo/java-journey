package advanced_oop.keywords;

public class Client {
    private static String name;
    private static String staticName;
    protected Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Being static we can't change name attribute
    public static class Nested{
        public void test(){
            name = "Rodrigo";
        }
    }

    public static String getStaticName() {
        return staticName;
    }

    public void setStaticName(final String param){
        staticName = param;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
