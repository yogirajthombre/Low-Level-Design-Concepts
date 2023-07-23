package iterator;

public class Main {
    public static void main(String[] args) {

        NamesRepo namesRepo = new NamesRepo();

        iterator iterator = namesRepo.getIterator();

        while(iterator.hasNext()){

            System.out.print("Main method .....");
            
            System.out.println(iterator.next());
        }
    }
    
}
