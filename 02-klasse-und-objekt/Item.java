public class Item()
{
  private Article articles;
  private Item[] items;
  private String ItemName;
  int firstUnused;


  public Item (String name , Articles ar)
  {
     this.ItemName = name;
     this.Articles = ar;
     firstUnused = 0;
  }


}
