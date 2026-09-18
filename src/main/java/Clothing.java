public abstract class Clothing {
    private String name;
    private Size size;
    private double unitPrice;
    private Material material;

    public Clothing(String name, Size size, double unitPrice, Material material, int sleeveType) {
        this.name = name;
        this.size = size;
        this.unitPrice = unitPrice;
        this.material = material;
    }

    public String getName() { return name; }
    public Size getSize() { return size; }
    public double getUnitPrice() { return unitPrice; }
    public Material getMaterial() { return material; }
}
