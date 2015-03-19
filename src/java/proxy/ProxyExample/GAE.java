public class GAE implements Search{
    public String googlesearch(String kw){
        System.out.println("Search result from google...keyword is : "+kw);
        return "pcx : "+System.currentTimeMillis();
    }
}
