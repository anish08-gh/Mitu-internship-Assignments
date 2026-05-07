import java.util.Scanner;

class LinkedList{
	int data;
	LinkedList next = null;
	static LinkedList start = null; //Declared as static to just maintain one common value for all objects
	Scanner sc = new Scanner(System.in);
	
	void Create(){ 
		int num;
		System.out.println("Enter the no of nodes to create: ");
		num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			LinkedList ptr = new LinkedList();
			System.out.println("Enter a new no: ");
			ptr.data = sc.nextInt();
			 
			if(start == null) {
				start = ptr;
			}else {
				LinkedList current = start;
				while(current.next != null) {
					current = current.next;
				}
				current.next = ptr;
			}
		}
	}
	
	void insert() {
		//to insert a node at the end of the linked list
		LinkedList ptr = new LinkedList();
		System.out.println("\nEnter a new no: ");
		ptr.data = sc.nextInt();
		
		LinkedList current = start;
		while(current.next != null) {
			current = current.next;
		}
		current.next = ptr;
	}
	
	void display() {
		LinkedList current = start;
		System.out.println("\n\nElements in the Linked List are:  ");
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}


public class Main {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("-------------Control Panel-------------");
			System.out.println("1. Create a Linked List");
			System.out.println("2. Insert");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			
			System.out.println("Please Enter Your Choice....");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				list1.Create();
			break;
			case 2:
				list1.insert();
			break;
			case 3: 
				list1.display();
			break;
			case 4:
				System.out.println("\n\n   Thank You....");
			break;
			default:
				System.out.println("Invalid Choice....Please Try Again.....");
			}
		}while(choice != 4);
	}
}
