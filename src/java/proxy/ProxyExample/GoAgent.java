public class GoAgent implements Search{
    Search mSearch;
    public GoAgent(){
        mSearch = new GAE();
    }

    public String googlesearch(String kw){
        System.out.println("Use GoAgent to access google search...");
        String res = mSearch.googlesearch(kw);
        System.out.println("Successfully access google");
        return res;
    }
}
