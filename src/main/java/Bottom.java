public class Bottom extends Clothing{
    private int waistSize;
    public Bottom (String name, Size size, double unitPrice, Material material, int waistSize){
        super(name, size, unitPrice, material, waistSize);
        this.waistSize = waistSize;
    }

    public int getWaistSize() { return waistSize; }
}
