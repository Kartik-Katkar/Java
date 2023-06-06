import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public class Linkedlist extends AbstractSequentialList<Integer> {
	private int size;

	public Linkedlist(int size) {
		this.size = size;
        
	}

	@Override
	public ListIterator<Integer> listIterator(int index) {
		return new ListIterator<Integer>() {
			private int currentIndex = index;

			@Override
			public boolean hasNext() {
				return currentIndex < size;
			}

			@Override
			public Integer next() {
				return currentIndex++;
			}

			@Override
			public boolean hasPrevious() {
				return currentIndex > 0;
			}

			@Override
			public Integer previous() {
				return currentIndex--;
			}

			@Override
			public int nextIndex() {
				return currentIndex + 1;
			}

			@Override
			public int previousIndex() {
				return currentIndex - 1;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}

			@Override
			public void set(Integer integer) {
				throw new UnsupportedOperationException();
			}

			@Override
			public void add(Integer integer) {
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		List<Integer> list = new Linkedlist(5);
		for (int i : list) {
			System.out.println(i);
		}
	}
}
