class Box{
    double width,height,depth;
    //This is a constructor for Box
    Box(double w,double h, double d){
        width=w;
        height=h;
        depth=d;
    }

// compute and return volume
double volume()
{
    return width* height* depth;

}
}
class BoxDemo1{
    public static void main(String args[]){
        //declare,allocate,and initialize Box objects
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);
        double vol;
        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        // get volume of second Box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }

}