public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Computer PC =ComputerFactory.getComputer("PC");
        System.out.println(PC);
        Computer PCGamer =ComputerFactory.getComputer("PcGamer");
        System.out.println(PCGamer);
        Computer Server =ComputerFactory.getComputer("Server");
        System.out.println(Server);

    }
}
