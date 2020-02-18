package lesson8;

public class House {

    private Armchair myArmchair;
    private Televisor myTelevisor;
    private Cupboard myCupboard;
    private Table myTable;
    private Bed myBed;

    public void buyArmchair(int width, int height, int depth, String model){
        myArmchair = new Armchair(width, height, depth, model);
    }

    public void buyTelevisor(int width, int height, int depth, String color){
        myTelevisor = new Televisor(width, height, depth, color);
    }

    public void buyCupboard(int width, int height, int depth, String countryOfManufacture){
        myCupboard = new Cupboard(width, height, depth, countryOfManufacture);
    }

    public void buyTable(int width, int height, int depth, String woodGrade){
        myTable = new Table(width, height, depth, woodGrade);
    }

    public void buyBed(int width, int height, int depth, int weight){
        myBed = new Bed(width, height, depth, weight);
    }

    public void infoAboutArmchair(){
        if(!(myArmchair == null)) System.out.println("кресло " + myArmchair.getInfoArmchair());
    }

    public void infoAboutTelevisor(){
        if(!(myTelevisor == null)) System.out.println("телевизор " + myTelevisor.getInfoTelevisor());
    }

    public void infoAboutCupboard(){
        if(!(myCupboard == null)) System.out.println("шкаф " + myCupboard.getInfoCupboard());
    }

    public void infoAboutTable(){
        if(!(myTable == null)) System.out.println("стол " + myTable.getInfoTable());
    }

    public void infoAboutBed(){
        if(!(myBed == null)) System.out.println("кровать " + myBed.getInfoBed());
    }

    public void infoAboutHous(){
        infoAboutBed();
        infoAboutTable();
        infoAboutCupboard();
        infoAboutArmchair();
        infoAboutTelevisor();

    }
}
