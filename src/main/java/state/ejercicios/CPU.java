package state.ejercicios;

public class CPU {
       private int percentageUse=0;
       private String action;

       public CPU(int percentageUse, String action){
           this.percentageUse=percentageUse;
           this.action=action;
       }

    public int getPercentageUse() {
        return percentageUse;
    }

    public void setPercentageUse(int percentageUse) {
        this.percentageUse = percentageUse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
