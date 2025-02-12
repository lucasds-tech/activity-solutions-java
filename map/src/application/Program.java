package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

// ARQUIVO DE VOTOS DOS CANDIDATOS (VOTOS.TXT) 

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votos = new LinkedHashMap<>();
		
		System.out.print("Insira o caminho da pasta: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(",");
				String nome = fields[0];
				int cont = Integer.parseInt(fields[1]);
				
				if (votos.containsKey(nome)) {
					int votosSF = votos.get(nome);
					votos.put(nome, cont + votosSF);
				}
				else {
					votos.put(nome, cont);
				}
				
				line = br.readLine();
			}
			
			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();		
	}

}

