public class Hero extends Person{
    private String power;

    public Hero(String name, int age, String power){
        super(name, age);  // המילה super מתייחסת לבנאי של מחלקת האב Person ומעבירה לבנאי את השדות name ו age
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String toString(){
        return super.toString() + "power: " + this.power + "\n";  // הרחבה של המתודה toString על ידי המילה super שמתייחסת למתודה toString של מחלקת האב
    }
}
