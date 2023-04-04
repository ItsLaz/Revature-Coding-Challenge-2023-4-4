public class App{
  public static void main(String[] args) {
    System.out.println(getVoteCount(13, 0));
    System.out.println(getVoteCount(2, 33));
    System.out.println(getVoteCount(132, 132));
  }

  static int getVoteCount(int upvotes, int downvotes){
    return upvotes - downvotes;
  }
}
