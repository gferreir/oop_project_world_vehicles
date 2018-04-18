package projeto_poo;

import java.util.ArrayList;

public class World {
	
	private ArrayList <Truck> t = new ArrayList<>();
	private ArrayList <Car> c = new ArrayList<>();
	private ArrayList <Motorcycle> m = new ArrayList<>();
	int map[][] = new int[30][60];
	
	public World() {
		t.add(new Truck(1, 1, false));
		c.add(new Car(1, 2, false));
		m.add(new Motorcycle(1, 3, false));
		printReset();
	}
	
	private void printReset() {
		
		for(int i=0; i<30; i++) {
			for(int j=0; j<60; j++) {
				if(i==4 && ((j>5 && j<11) || (j>48 && j<54)))
					map[i][j]=2;
				else if(i==5 && ((j>5 && j<11) || (j>48 && j<54)))
					map[i][j]=2;
				else if(i==6 && ((j>5 && j<11) || (j>48 && j<54)))
					map[i][j]=2;
				
				else if(i==14 && ((j>5 && j<11) || (j>48 && j<54)))
					map[i][j]=2;
				else if(i==15 && ((j>5 && j<11) || (j>48 && j<54)))
					map[i][j]=2;
				else if(i==16 && ((j>5 && j<11) || (j>48 && j<54)))
					map[i][j]=2;
				
				else if(i==23 && ((j>5 && j<11) || (j>48 && j<54)))
					map[i][j]=2;
				else if(i==24 && ((j>5 && j<11) || (j>48 && j<54)))
					map[i][j]=2;
				else if(i==25 && ((j>5 && j<11) || (j>48 && j<54)))
					map[i][j]=2;
				
				else
					map[i][j]=0;
			}
		}
		
	}
	
	public void print() {
		
		printReset();
		checkCar();
		checkMotorcycle();
		checkTruck();
		
		for(int i=0; i<30; i++) {
			for(int j=0; j<60; j++) {
				if(map[i][j]==7)
					System.out.print("\u001b[44m \033[0m");
				else if(map[i][j]==8)
					System.out.print("\u001b[41m \033[0m");
				else if(map[i][j]==9)
					System.out.print("\u001b[43m \033[0m");
				else
					System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}	
	
	private void checkCar() {
		for (Car car : c) {
			map[car.getX()][car.getY()]=8;
		}
	}
	private void checkTruck() {
		for (Truck truck : t) {
			map[truck.getX()][truck.getY()]=9;
		}
		
	}
	private void checkMotorcycle() {
		for (Motorcycle motorcycle : m) {
			map[motorcycle.getX()][motorcycle.getY()]=7;			
		}
		
	}
		
}
