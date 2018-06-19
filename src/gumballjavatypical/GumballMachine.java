package gumballjavatypical;

public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private MACHINE_TYPE machine_type;
    private int currency;

    public GumballMachine(int size, MACHINE_TYPE t)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.machine_type = t;
    }

    // insert coin with different values	
    public void insert_coin(COIN_VALUE coin_inserted) {
        System.out.println("inserting " + coin_inserted);

    // If the machine is of type which accepts only quarter coins, then the user is prompted to enter a quarter
        if (machine_type.acceptQuarterOnly() && coin_inserted != COIN_VALUE.QUARTER ) {
            System.out.println( "Accepts only quarter values, Insert quarter" ) ;
            return;
        }

        if (has_quarter){
            System.out.println("Already inserted enough coins.");
        }

        //if inserted coin is greater than the coin value the machine accepts, it indicated the user has entered a quarter (since all the machines accepts quarter)
        currency += coin_inserted.acceptValue();
        if(currency >= machine_type.acceptCost()){
            has_quarter = true;
        }
    }


    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.currency -= machine_type.acceptCost();
                
              //if inserted coin is less than the coin value the machine accepts, then the user has no entered a quarter.
                if(currency < machine_type.acceptCost()){
                    has_quarter = false;
                }
                System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
            }
        }
        else
        {
            System.out.println( "Please enter sufficient coins." ) ;	
        }
    }

    enum COIN_VALUE{

        NICKLE(1),
        DIME(10),
        QUARTER(25);

        COIN_VALUE(int value) {
            this.value = value;
        }

        int value;

        public int acceptValue() {
            return value;
        }
    }

    enum MACHINE_TYPE{
        MACHINE_A(25, true),
        MACHINE_B(50, true),
        MACHINE_C(50, false);

        MACHINE_TYPE(int cost, boolean quarterOnly) {
            this.cost = cost;
            this.quarterOnly = quarterOnly;
        }

        int cost;
        boolean quarterOnly;

        public int acceptCost() {
            return cost;
        }

        public boolean acceptQuarterOnly() {
            return quarterOnly;
        }
    }
}