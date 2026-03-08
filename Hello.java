public class Hello 
{
    public static void main (String args[])
    {
        System.out.println("Hello from Jenkins!");
        System.out.println("Current Time: " + java.time.LocalDateTime.now());
        //now the first commit made
        System.out.println("made the changes for polling!");
        //made another change
        for(int i=0 ; i<5 ; i++)
            { for(int j=0;j<i;j++)
                {
                System.out.print("* ");
                }
             System.out.println();
            }
    }//new changes
}








