class Box {
    double width,height,depth;
    //This is a constructor for Box
    Box(){
        System.out.println("Constructing Box");
        width=10;
        height=10;
        depth=10;

    }
    // compute and return volumme
    double volume(){
        return width *height * depth;

    }
}
class BoxDemo{
    public static void main(String args[]){
        //declare,allocate,and initialize Box objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        // get volume of second Box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);


    }
}
