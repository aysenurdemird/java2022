package abstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{

	@Override
	public void getData() {
		System.out.println("Veri tabanı getirildi : My sql");
	}

}
