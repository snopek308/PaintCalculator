
import java.util.ArrayList;

public class Room {

    //added those two below + For the slideshow slide 10
    private static int roomCount = 0;
    private int roomNum = 0;
    
    private ArrayList<Wall> wallList;

    public Room(double length, double width, double height) throws BadWidthException, BadHeightException {
        wallList = new ArrayList<Wall>();

        Wall wallA = new Wall(length, height);
        wallList.add(wallA);
        Wall wallB = new Wall(length, height);
        wallList.add(wallB);
        Wall wallC = new Wall(width, height);
        wallList.add(wallC);
        Wall wallD = new Wall(width, height);
        wallList.add(wallD);
        
        //For the slideshow slide 10
        roomCount++;
        
        roomNum = roomCount;
    }

    public double getArea() {
        double area = 0;

        for (int i = 0; i < wallList.size(); i++) {
            Wall w = wallList.get(i);
            area += w.getArea();
        }

        return area;
    }
    
    //yellow string on toString() for an override annotations here must add the @Override bc it thinks its overriding a method somewhere
    @Override
    public String toString(){
        //helps you build longer strings easier --> "a" + "b" + "c" + "d" would make "ab" and "abc" and "abcd"
        //you can keep appending with this--> sb.append("a").append("b").append("c").append("d");
        StringBuilder sb = new StringBuilder("Room: ");
        sb.append(roomNum).append("\n");
        sb.append(getArea()).append("\n");
        return sb.toString();
    }
}
