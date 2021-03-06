package com.players.india;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.players.india.dao.PlayerDao;
import com.players.india.model.Player;

@SpringBootApplication
@EnableTransactionManagement
public class CricketPlayersApplication implements CommandLineRunner {
   
	@Autowired
	PlayerDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(CricketPlayersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Player p=sendplayer();
		dao.createPlayer(p);
		*/
		Player p=getplayer(1);
		System.out.println();
		System.out.println(dao.getPlayers());
	}
	
	
	
	
	/*public Player sendplayer()
	{
		Player p=new Player();
		p.setHighScore(100);
		p.setPlayerName("Sachin");
		p.setTotalFifties(5);
		p.setTotalHundreds(45);
		p.setTotalMatches(31);
		p.setTotalScore(40);
	return p;
	}
	*/
	public Player getplayer(int id)
	{
		Player p=dao.getPlayer(id);
	return p;
	}
	public List<Player>  getPlayers()
	{		
		return dao.getPlayers();
	}
	
}
