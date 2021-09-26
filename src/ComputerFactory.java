public class ComputerFactory {



    public  static  Computer  getComputer (String Type) throws IllegalAccessException {
        switch (Type){
            case "PC":
                return new PC("8GO","1TO","i3");
            case  "PcGamer":
                return new PcGamer("16GO","1TO SSD","i5");

            case  "Server":
                return new PC("32GO","10TO","i9");

            default:
                throw new IllegalAccessException("il n'existe pas");
        }

    }
}
