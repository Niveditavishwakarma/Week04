package smartwarehousemanagementsystem;

 class Furniture extends WarehouseItem{
     public Furniture(String itemName) {
         super(itemName);
     }

     @Override
     public String getCategory() {
         return "Furniture";
     }
}
