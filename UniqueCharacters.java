public class UniqueCharacters
{
    public static void main(String[] args)
    {
        String stack = "stack";
        String unique = "unique";
        
        System.out.println(IsAllUnique(stack));
        System.out.println(IsAllUnique(unique));
    }
    
    public static boolean IsAllUnique(String str)
    {   
        int counter = 0; 
        
        for (int i = 0; i < str.length() - 1; i++)
        {
            counter = 0;
            
            for (int j = 0; j < str.length()- 1; j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    counter++;
                }
            }
            
            if (counter > 1)
            {
                    return false;
            }
            
        }
        
        return true;
    }
    
}

