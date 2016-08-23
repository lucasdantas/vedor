package jobs;

import models.*;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Inicializador extends Job{

	public void doJob() throws Exception {
		if(Operador.count() == 0){
			Operador op1 = new Operador();
			op1.nome = "root";
			op1.email="root";
			op1.senha="root";
			op1.save();
		}
		
		if(Municipio.count() == 0){
			Municipio m1 = new Municipio();
			m1.nome = "Pau dos Ferros";
			m1.estado = "Rio Grande do Norte";
			m1.save();
		}
		
		if(Bairro.count() == 0){
			
			Municipio m = Municipio.find("nome like ?", "Pau dos Ferros").first();
			
			Bairro b1 = new Bairro();
			b1.municipio = m;
			b1.nome = "Riacho do Meio";
			b1.setor = Setor.S1;
			b1.save();
			
			Bairro b2 = new Bairro();
			b2.municipio = m;
			b2.nome = "Carvão";
			b2.setor = Setor.S1;
			b2.save();
			
			Bairro b3 = new Bairro();
			b3.municipio = m;
			b3.nome = "São Vicente";
			b3.setor = Setor.S1;
			b3.save();
			
			Bairro b4 = new Bairro();
			b4.municipio = m;
			b4.nome = "São Judas Tadeu";
			b4.setor = Setor.S1;
			b4.save();
			
			Bairro b5 = new Bairro();
			b5.municipio = m;
			b5.nome = "Frei Damião";
			b5.setor = Setor.S1;
			b5.save();
			
			Bairro b6 = new Bairro();
			b6.municipio = m;
			b6.nome = "Paraíso";
			b6.setor = Setor.S1;
			b6.save();
			
			Bairro b7 = new Bairro();
			b7.municipio = m;
			b7.nome = "Assema";
			b7.setor = Setor.S1;
			b7.save();
			
			Bairro b8 = new Bairro();
			b8.municipio = m;
			b8.nome = "Alto do Açude";
			b8.setor = Setor.S1;
			b8.save();
			
			Bairro b9 = new Bairro();
			b9.municipio = m;
			b9.nome = "Alagoinha";
			b9.setor = Setor.S1;
			b9.save();
			
			Bairro b10 = new Bairro();
			b10.municipio = m;
			b10.nome = "Olívio de Souza";
			b10.setor = Setor.S1;
			b10.save();
			
			Bairro b11 = new Bairro();
			b11.municipio = m;
			b11.nome = "Centro";
			b11.setor = Setor.S2;
			b11.save();
			
			Bairro b12 = new Bairro();
			b12.municipio = m;			
			b12.nome = "Beira Rio";
			b12.setor = Setor.S2;
			b12.save();

			Bairro b13 = new Bairro();
			b13.municipio = m;
			b13.nome = "São Geraldo";
			b13.setor = Setor.S2;
			b13.save();
			
			Bairro b14 = new Bairro();
			b14.municipio = m;
			b14.nome = "João XXIII";
			b14.setor = Setor.S2;
			b14.save();

			Bairro b15 = new Bairro();
			b15.municipio = m;
			b15.nome = "Manoel Domingos";
			b15.setor = Setor.S2;
			b15.save();

			Bairro b16 = new Bairro();
			b16.municipio = m;
			b16.nome = "Bela Vista";
			b16.setor = Setor.S2;
			b16.save();

			Bairro b17 = new Bairro();
			b17.municipio = m;
			b17.nome = "São Benedito";
			b17.setor = Setor.S2;
			b17.save();

			Bairro b18 = new Bairro();
			b18.municipio = m;
			b18.nome = "Cohab";
			b18.setor = Setor.S2;
			b18.save();

			Bairro b19 = new Bairro();
			b19.municipio = m;
			b19.nome = "Nova Pau dos Ferros";
			b19.setor = Setor.S2;
			b19.save();

			Bairro b20 = new Bairro();
			b20.municipio = m;
			b20.nome = "Princesinha do Oeste";
			b20.setor = Setor.S3;
			b20.save();

			Bairro b21 = new Bairro();
			b21.municipio = m;
			b21.nome = "Chico Cajá";
			b21.setor = Setor.S3;
			b21.save();

			Bairro b22 = new Bairro();
			b22.municipio = m;
			b22.nome = "Nações Unidas";
			b22.setor = Setor.S3;
			b22.save();

			Bairro b23 = new Bairro();
			b23.municipio = m;
			b23.nome = "João Catingueira";
			b23.setor = Setor.S3;
			b23.save();

			Bairro b24 = new Bairro();
			b24.municipio = m;
			b24.nome = "Arizona";
			b24.setor = Setor.S3;
			b24.save();

			Bairro b25 = new Bairro();
			b25.municipio = m;
			b25.nome = "Zeca Pedro";
			b25.setor = Setor.S3;
			b25.save();

			Bairro b26 = new Bairro();
			b26.municipio = m;
			b26.nome = "Manoel Deodato";
			b26.setor = Setor.S3;
			b26.save();

			Bairro b27 = new Bairro();
			b27.municipio = m;
			b27.nome = "Aluízio Diógenes";
			b27.setor = Setor.S3;
			b27.save();
		}
	}
}