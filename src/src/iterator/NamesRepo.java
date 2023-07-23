package iterator;

public class NamesRepo implements Container{

    private String[] names = new String[]{"Cilian Murphy",
    "Robert Downey Junior","Matt Damon","Christopher Nolan"};

    int index = 0;

    @Override
    public iterator getIterator() {
        return new NamesIterator();
    }

    public class NamesIterator implements iterator{

        @Override
        public boolean hasNext() {
            if (index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
           if (this.hasNext()){
              return names[index++];
           }
           return null;
        }

    }
    
}
