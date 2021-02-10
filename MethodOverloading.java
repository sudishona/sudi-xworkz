class MethodOverLoading
{
static String name= "cricket";
static int noOfplayers=15;
public static void main(String shona[])
{
play();
play(noOfplayers);
}
public static void play()
{
System.out.println("playing in the ground");
}
public static void play(int noOfplayers)
{
System.out.println("playing in the ground with"+noOfplayers+ " players");
}
}