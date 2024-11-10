public class Main {
    public static void main(String[] args) {

        // super = 	keyword refers to the superclass (parent) of an object
        //			very similar to the "this" keyword

        //   במקרים רבים אנחנו דווקא כן נרצה לשמור על המימוש של המתודה שעוברת בהורשה, אך גם לאפשר למחלקה היורשת להוסיף למתודה פונקציונליות.
        //   כלומר, אנחנו מעוניינים לשלב בין שתי האפשרויות: גם להשתמש במימוש של המחלקה המורישה, וגם לאפשר למחלקה היורשת להוסיף פונקציונליות משל עצמה.
        //   נשתמש במילה super.


                Hero hero1 = new Hero("Batman", 42, "$$$");

        System.out.println(hero1.getName());
        System.out.println(hero1.getAge());
        System.out.println(hero1.getPower());
    }
}