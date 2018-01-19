public class Chocolate extends RectangularPrism {
  //Instance variables, assigned in Zero Argument Constructor
  private int numberOrdered;
  private double totalChocCost;

  //Zero Argument Constructor

  //Getters and Setters Methods
  //Getters: instance Variable cannot be changed by outside class or program
  public double getTotalCost () {
    return this.totalChocCost = Information.chocolateBoxCost * this.numberOrdered; //
  }

  //Processor Methods

  //multi-argument Constructor
  public Chocolate (int userEntered, double length, double width, double height) {
    super( userEntered, length, width, height );
    this.numberOrdered = userEntered;
  }

  //toString() for Printing Results of Class to Console
  public String toString() { //For JOptionPane and Println
    return super.toString() + "\n";
  }


} //End of Chocolate Class
