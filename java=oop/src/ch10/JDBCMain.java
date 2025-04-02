package ch10;
import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;
import dto.Actor;
public class JDBCMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1) 키보드를 통해 매개값 입력 받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("firstName을 입력하세요:");
		String firstName = scanner.nextLine();
		System.out.println("lastName을 입력하세요:");
		String lastName = scanner.nextLine();

		System.out.println("firstName:"+firstName);
		System.out.println("lastName:"+lastName);
		scanner.close();
		
		// 2)
		Actor actor = new Actor();
		actor.setFirstName(firstName);
		actor.setLastName(lastName);
		
		// 3)
		ActorDAO actorDao = new ActorDAO();
		int row = actorDao.insertActor(actor);
		
		
		// 4)조회 select 모듈 호출
		ArrayList<Actor> list = actorDao.selectActorList(5);
		
		// 5)출력
		for(Actor a : list) {
			System.out.println(a.getActorId()+"\t"+a.getFirstName()+"\t"+a.getLastName()+"\t"+a.getLastUpdate()+"\t");
		}
		
		
		/*
		// 조회 select
		PreparedStatement stmt2 = null;
		ResultSet rs2 = null;
		String sql2 = "select actor_id actorId, first_name firstName, last_name lastName, last_update lastUpdate from actor order by actor_id desc limit 5";
		stmt2 = conn.prepareStatement(sql2);
		rs2 = stmt2.executeQuery();
		System.out.println("actorId\tfirst_Name\tlast_Name\tlast_Update");
		while(rs2.next()) {
			System.out.println(rs2.getInt("actorId") + "\t" + 
	                 		 rs2.getString("firstName") + "\t" + 
	                 		 rs2.getString("lastName") + "\t" + 
	                 		 rs2.getString("lastUpdate"));
		}
		conn.close();
		*/
	}
}
