public class FixDebugOceanLiner extends FixDebugBoat
{
   public FixDebugOceanLiner()
   {
      super("ocean liner ");
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 5000;
   }
   public void setPower()
   {
      super.power = "3 engines";
   }
}
