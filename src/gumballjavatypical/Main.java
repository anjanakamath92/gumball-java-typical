package gumballjavatypical;

public class Main {
    public static void main(String[] args) {
     	testMachineA();
        testMachineB();
        testMachineC();
    }

    private static void testMachineA(){
        System.out.println("Testing Machine A");

        GumballMachine gumballMachine = new GumballMachine(10, GumballMachine.MACHINE_TYPE.MACHINE_A);

        System.out.println(gumballMachine);

        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.DIME);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.QUARTER);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }


    private static void testMachineB(){
        System.out.println("Testing Machine B");

        GumballMachine gumballMachine = new GumballMachine(10, GumballMachine.MACHINE_TYPE.MACHINE_B);

        System.out.println(gumballMachine);

        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.DIME);

        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.QUARTER);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.QUARTER);
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }

    private static void testMachineC(){
        System.out.println("Testing Machine C");

        GumballMachine gumballMachine = new GumballMachine(10, GumballMachine.MACHINE_TYPE.MACHINE_C);

        System.out.println(gumballMachine);

        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.QUARTER);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.DIME);
        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.DIME);
        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.QUARTER);
	    gumballMachine.insert_coin(GumballMachine.COIN_VALUE.NICKLE);
        gumballMachine.turnCrank();
        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.NICKLE);
        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.NICKLE);
        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.NICKLE);
        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.NICKLE);
        gumballMachine.turnCrank();
        gumballMachine.insert_coin(GumballMachine.COIN_VALUE.QUARTER);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }

}