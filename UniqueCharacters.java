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
        //counter to see how many letters are the same
        int counter = 0; 

        //goes through each letter, and compares each letter to each other
        for (int i = 0; i < str.length() - 1; i++)
        {
            counter = 0;
            
            for (int j = 0; j < str.length()- 1; j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    //increases counter if the letters are the same
                    counter++;
                }
            }
            
            if (counter > 1)
            {
                    //returns false if it matches with another letter in the word, besides itself
                    return false;
            }
            
        }
        //returns true if it doesn't find another letter match
        return true;
    }
    
}

