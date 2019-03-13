import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("texto.txt");
		BufferedWriter bf = new BufferedWriter(new FileWriter(arquivo,true));
		String nome = "";
		char aux;
		
		while(true){
			nome = JOptionPane.showInputDialog("Digite um nome, ou 'sair' para finalizar: ");
			if(nome.equals("sair")){
				bf.close();
				break;
			}else{
				for (int i=0; i< nome.length(); i++)
				{
				   aux = nome.charAt(i);
				   
				   if(aux=='i' || aux=='I'){
					   bf.write("1");
				   }else if(aux=='z' || aux=='Z'){
					   bf.write("2");
				   }else if(aux=='e' || aux=='E'){
					   bf.write("3");
				   }else if(aux=='a' || aux=='A'){
					   bf.write("4");
				   }else if(aux=='s' || aux=='S'){
					   bf.write("5");
				   }else if(aux=='g' || aux=='G'){
					   bf.write("6");
				   }else if(aux=='t' || aux=='T'){
					   bf.write("7");
				   }else if(aux=='b' || aux=='B'){
					   bf.write("8");
				   }else if(aux=='q' || aux=='Q'){
					   bf.write("9");
				   }else if(aux=='o' || aux=='O'){
					   bf.write("0");
				   }else{
					   bf.write(aux);
				   }
				}
				bf.newLine();
				bf.flush();
			}
		}
	}

}
