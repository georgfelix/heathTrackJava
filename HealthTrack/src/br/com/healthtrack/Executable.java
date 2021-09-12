package br.com.healthtrack;

public class Executable {
	
	static User user1 = new User(1234, "Georg Felix", "Jovem", "geofelixmail@gmail.com", "123456", "geo@gmail.com", 34991306666, "90kg", "1,80m", "FotoCara", "FotoFundo");

	// user1 é o OBJETO da classe User
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("App criada com sucesso"); //sysout + Control + Espaco
		
		
		//----------Preenchimento das Propriedades de user1------------
		
//		user1.userName = "Georg Felix";
//		user1.userNickname = "Jovem";
//		user1.userCellPhone = "34 991306666";
//		user1.userEmail = "geofelixmail@gmail.com";
//		user1.userWeight = "90kg";
//		user1.userHeight = "1,80m";
		
		// Para comentar TUDO selecione e use Command + /
		
		//-------------Invocando os Metodos-----------------
		user1.enterUserData("123", "Georg Felix", "Jovem", "geofelix@gmail.com", "343434", "geo@gmail.com", "34 991306666", "90kg", "1,80m", null, null);
		user1.consultUser("123", "Georg Felix", "Jovem", "geofelix@gmail.com", "343434", "geo@gmail.com", "34 991306666", "90kg", "1,80m", null, null);

	}

}

//----------GTerminado em 12 set domingo----------- 

