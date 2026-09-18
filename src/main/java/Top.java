public class Top extends Clothing {
    private SleeveType sleeveType;

    public Top (String name, Size size, double unitPrice, Material material, SleeveType sleeveType){
        super(name, size, unitPrice, material, sleeveType.ordinal());
        this.sleeveType = sleeveType;
    }

    public SleeveType getSleeveType() { return sleeveType; }
}
