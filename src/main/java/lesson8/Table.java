package lesson8;

public class Table extends Furniture {
    String woodGrade;

    public Table(int width, int height, int depth, String woodGrade){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.woodGrade = woodGrade;

    }

    public String getInfoTable(){
        return getInfoSize() + " Сорт древесины: " + woodGrade;
    }
}
