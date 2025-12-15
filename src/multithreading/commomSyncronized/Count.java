package multithreading.commomSyncronized;

public class Count {

  private int value = 0;

  int getValue(){
      return this.value;
  }

  public synchronized void increamentValue(int offset){
      this.value = offset;

  }
}
