public class RectangularPrism extends ShoppingCart {
  //Instance variables, assigned in Zero Argument Constructor
  private double diameter;
  private int numberOrdered;

  private double length;
  private double width;
  private double height;
  private double prismvolume;
  private int prismsperrow;
  private int prismsperflat;
  private int prismsperbox;

  private int numBoxes;
  private int numFlats;
  private int numRows;

  private int prismNumberCalculator;
  private int prismLeftover;
  //Zero Argument Constructor
  //Getters and Setters Methods
    //Getters: instance Variable cannot be changed by outside class or program
  //Processor Methods
  //Multi-argument Constructor
  public RectangularPrism (int userEntered, double length1, double width1, double height1) {
     //Changing Variables to mimic packing an object
     //Caution: every time an order is called, the order object must deliever the
         //diameter, from appples or oranges
     //Note: perspective is from an object, action is one item at a time which might be confusing
     super();
     //Assigning Instance Variables
     this.numberOrdered = this.prismNumberCalculator = userEntered;
     this.length = length1;
     this.width = width1;
     this.height = height1;
     this.prismvolume = this.length * this.width * this.height;
     this.prismsperrow = (int) Information.box1Width / ((int) this.width); //Items per row
     this.prismsperflat = (int) Information.box1Length / (int) this.length * this.prismsperrow; //Spheres per flat
     this.prismsperbox = (int) Information.box1Height / (int) this.height * this.prismsperflat; //Spheres per flat
     this.numBoxes = 0;
     this.numFlats = 0;
     this.numRows = 0;
     //Using the Instance Variables
     while (this.prismNumberCalculator >= this.prismsperbox) { //Check if we need 1 box or more
       this.numBoxes += 1; //Same as numBoxes = numBoxes +1
       this.prismNumberCalculator -= this.prismsperbox; //Same as sphereNumberCalculated = sphereNumberCalculated - spheresPerBox
     } //End of WHILE for Full boxes
     while (this.prismNumberCalculator >= this.prismsperflat) { //Check if we need 1 flat or more
       this.numFlats += 1;
       this.prismNumberCalculator -= this.prismsperflat;
     } //End of WHILE for Full flats
     while (this.prismNumberCalculator >= this.prismsperrow) { //Check if we need 1 row or more
       this.numRows += 1;
       this.prismNumberCalculator -= this.prismsperrow;
     } //End of WHILE for Full boxes
     this.prismLeftover = this.prismNumberCalculator; //Number of spheres left in less than a row
  } //End of Multi-argument Constructor

  //toString() for Printing Results of Class to Console
  public String toString() {
    return "Boxing Guide: \nNumber Ordered: " + this.numberOrdered + "\n" +
           "Number of Boxes Needed: " + (numBoxes + 1) + "\n" +
           "\tNumber of Full Boxes: " + numBoxes + "\n" +
           "\tGuide for last partial box: " + numFlats + " full flats, " + numRows +
           " full row(s) on last flat, " + this.prismLeftover + " chocolate boxes in last row.";
  }


} //End of Rectangular Prism Class
