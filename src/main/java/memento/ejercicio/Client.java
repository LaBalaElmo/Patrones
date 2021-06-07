package memento.ejercicio;

public class Client {
	public static void main(String[] args) {
		DataManagement data = new DataManagement();
		BaseDeDatos baseDeDatos = new BaseDeDatos();
		
		Persona persona;
		
		persona = new Persona("Jose", 7894561, 19);
		data.setState(persona);
		baseDeDatos.addDataBase("BackupFebrero", data.createBackup());
		
		persona = new Persona("Juan", 7563289, 25);
		data.setState(persona);
		baseDeDatos.addDataBase("BackupMarzo", data.createBackup());
		
		persona = new Persona("Roberto", 7452631, 31);
		data.setState(persona);
		baseDeDatos.addDataBase("BackupAbril", data.createBackup());
		
		persona = new Persona("Carlos", 7458963, 38);
		data.setState(persona);
		baseDeDatos.addDataBase("BackupMayo", data.createBackup());
		
		persona = new Persona("Julio", 7985215, 20);
		data.setState(persona);
		baseDeDatos.addDataBase("BackupJunio", data.createBackup());
		
		persona = new Persona("Jorge", 7632589, 15);
		data.setState(persona);
		
		data.restoreFromMemento(baseDeDatos.getMemento("BackupMarzo"));
				
	}
}
