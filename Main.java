class Main {
  public static void main(String[] args) {
  Vigenere v = new Vigenere();
    new Thread (v).start();
    t= new Thread (v);
    t.start();
    //saluto
  }
  Vigenere v1= new Vigenere( 12,25,13,25,0);
}