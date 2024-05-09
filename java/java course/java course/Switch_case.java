public class Switch_case {
    public static void main(String[] args){
        char ch = 'f';
        switch(ch){
            case 'a':
                System.out.println("character is a");
                break;
            case 'b':
                System.out.println("character is b");
                break;
            case 'c':
                System.out.println("character is c");
                break;
            case 'd': case 'e': case 'f':
                System.out.println("Character is d,e and f");
                System.out.println("actually it is : " + ch);
                break;
            default:
                System.out.println("character is not a,b,c,d,e and f ");
                break;
        }
    }
    
}
