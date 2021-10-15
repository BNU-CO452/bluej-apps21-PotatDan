
/**
 * 
 *
 * @Daniel moynihan 
 * @15/10/2021
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String code;
    private String title;
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
        
    }

    
    public String getcode()
    {
        return code;
    }
    public String getTitle()
    {
        return title;
    }
    public  void Creditset(int credit)
    {
        this.credit = credit;
    }
    
    
    
    
    
    
    /**
     * this methoud will print the module code and its title
     */
    public void print()
    {
        printHeading();
        
        System.out.println(" Module Code: " + code);
        System.out.println(" Module title:" + title);
        System.out.println(" Module Credit:" + credit);
        
        System.out.println();
    }
    
    /**
     * Print out the details of the Module to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Module Details");
        System.out.println(" --------------------------------");
        System.out.println();
        
    }
}
