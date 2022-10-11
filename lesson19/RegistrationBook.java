package com.bilgeadam.course04.lesson19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class RegistrationBook extends Object{

	public static void main(String[] args) {
		Registiration r1 = new Registiration(612578, "Tuna Dağ", "Java", 2022);
		Registiration r2 = new Registiration(512679, "Hilal Korkmaz", "Java", 2022);
		Registiration r3 = new Registiration(712578, "Şeyda Mersin", "Java", 2022);
		Registiration r4 = new Registiration(578678, "Babür Somer", "Java", 2022);

		Registiration[] regs1 = new Registiration[4];
		regs1[0] = r1;
		regs1[1] = r2;
		regs1[2] = r3;
		regs1[3] = r4;
		
		Registiration[] regs11 = new Registiration[5];
		regs11[0] = regs1[0];
		regs11[1] = regs1[1];
		regs11[2] = regs1[2];
		regs11[3] = regs1[3];
		regs11[4] = r4;
				
		System.out.println(Arrays.toString(regs1));
		
		// 712578 aramamak için
		int i = 0;
		Registiration r = null;
		for (; i<regs1.length;i++) {
			if (regs1[i].registraionNumber == 712578) {
				r = regs1[i];
				break;
			}
		}
		System.out.println("'712578' numaralı kişi " + i + ". adımda bulundu: " + r);
		
		TreeMap<Long, Registiration> regs2 = new TreeMap<>();
		regs2.put(r1.registraionNumber, r1);
		regs2.put(r2.registraionNumber, r2);
		regs2.put(r3.registraionNumber, r3);
		regs2.put(r4.registraionNumber, r4);
		
		r = regs2.get((long)712578);
		
		
		List<Registiration> regs3 = new ArrayList<>();
		regs3.add(r1);
		regs3.add(r2);
		regs3.add(r3);
	}

}
