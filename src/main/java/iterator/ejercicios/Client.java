package iterator.ejercicios;

public class Client {
	public static void main(String[] args) {
		Arrays1 array = new Arrays1();
		array.add("Jose1");
		array.add("Jose2");
		array.add("Jose3");
		array.add("Jose4");
		array.add("Jose5");

		List1 list = new List1();
		list.add("Maria1");
		list.add("Maria2");
		list.add("Maria3");
		list.add("Maria4");
		list.add("Maria5");

		Stack1 stack = new Stack1();
		stack.add("Pedro1");
		stack.add("Pedro2");
		stack.add("Pedro3");
		stack.add("Pedro4");
		stack.add("Pedro5");

		Vector1 vector = new Vector1();
		vector.add("Luis1");
		vector.add("Luis2");
		vector.add("Luis3");
		vector.add("Luis4");
		vector.add("Luis5");

		HashMap1 hashMap = new HashMap1();
		hashMap.add("Coca", array);
		hashMap.add("Pepsi", list);
		hashMap.add("Fanta", stack);
		hashMap.add("Sprite", vector);

		Iterator iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println("Nombre: " + iterator.next());
		}
		iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("Nombre: " + iterator.next());
		}

		iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println("Nombre: " + iterator.next());
		}

		iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.println("Nombre: " + iterator.next());
		}

		Iterator iteratorMap = hashMap.iterator();
		System.out.println("************************************************");
		while (iteratorMap.hasNext()) {
			Object aux = iteratorMap.next();
			if (aux instanceof Arrays1) {
				iterator = ((Arrays1) aux).iterator();
				while (iterator.hasNext()) {
					System.out.println("Nombre: " + iterator.next());
				}
			} else if (aux instanceof List1) {
				iterator = ((List1) aux).iterator();
				while (iterator.hasNext()) {
					System.out.println("Nombre: " + iterator.next());
				}
			} else if (aux instanceof Stack1) {
				iterator = ((Stack1) aux).iterator();
				while (iterator.hasNext()) {
					System.out.println("Nombre: " + iterator.next());
				}
			} else if (aux instanceof Vector1) {
				iterator = ((Vector1) aux).iterator();
				while (iterator.hasNext()) {
					System.out.println("Nombre: " + iterator.next());
				}
			}
		}
	}
}
