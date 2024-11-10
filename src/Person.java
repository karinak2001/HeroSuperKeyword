public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //שימו לב: על אף קיומה של הרשאת הגישה protected, לא נשתמש בה כדי לסמן שדות, אלא רק כדי לסמן מתודות.
    //בדרך כלל אין סיבה מספיק מוצדקת כדי לסמן שדה protected ולאפשר למחלקות היורשות גישה לא מבוקרת אליו.
    //אם המחלקות היורשות מעוניינות בגישה אל השדה, הן יוכלו להשתמש ב-getterים וב-setterים, לפי כללי המחלקה המורישה.

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }


    public String toString(){
        return "name: " + this.name + "\n" +
                "age: " + this.age + "\n";
    }
}
