public class SGRandomWalk {
public static void main (String[] args){
int numSteps = 0;


Rectangle field = new Rectangle(0, 0, 300, 300);
field.setColor(Color.YELLOW);
field.fill();

Ellipse egg = new Ellipse(50, 50, 200, 200);
egg.setColor(Color.RED);
egg.draw();

Ellipse walker = new Ellipse(150, 150, 10, 10);
walker.setColor(Color.BLACK);
walker.fill();


while(10750 > Math.abs((int)(Math.pow(walker.getY()-150,2))) + Math.abs((int)(Math.pow(walker.getX()-150,2))) ){
    walker.translate((int)(Math.random()*20) -10, (int)(Math.random()*20) - 10);

    try {Thread.sleep(100);}
    catch(Exception ex){};
    numSteps++;

}
System.out.println("Escaped in " + numSteps + " steps");


}
}