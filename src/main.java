import java.util.ArrayList;
import java.util.List;

public class main {
	
	public static void main(String[] args) {
		
		//dimiourgia ergasiwn episkevis
		 List<ErgasiaEpiskevhs> ergasiaEpiskevhs = new ArrayList<>();
		 ergasiaEpiskevhs.add(new ErgasiaEpiskevhs("Αλλαγή λαδιών", 20));
		 ergasiaEpiskevhs.add(new ErgasiaEpiskevhs("Αλλαγή φίλτρου καμπίνας", 5));
		 ergasiaEpiskevhs.add(new ErgasiaEpiskevhs("Συντήρηση φρένων", 30));

		 //dimiourgia tipwn antallaktikwn
	     List<TyposAntallaktikwn> typosAntallaktikwn = new ArrayList<>();
	     typosAntallaktikwn.add(new TyposAntallaktikwn("Συσκευασία λαδιών 4lt", 30));
	     typosAntallaktikwn.add(new TyposAntallaktikwn("Φίλτρο λαδιού", 20));
	     typosAntallaktikwn.add(new TyposAntallaktikwn("Φίλτρο καμπίνας", 30));
	     typosAntallaktikwn.add(new TyposAntallaktikwn("Τακάκι φρένων εμπρός τροχού", 5));
	     typosAntallaktikwn.add(new TyposAntallaktikwn("Τακάκι φρένων πίσω τροχού", 5));
	     typosAntallaktikwn.add(new TyposAntallaktikwn("Υγρό φρένων", 10));
	     
	     //dimiourgw episkeves
	     Episkevh task1 = new Episkevh("ΕργασίαΕπισκευής1");
	     Episkevh task2 = new Episkevh("ΕργασίαΕπισκευής2");
	     Episkevh task3 = new Episkevh("ΕργασίαΕπισκευής3");
	     
	     //dimiourgw antallaktika
	     SparePartType part1 = new SparePartType("ΤύποςΑνταλλακτικού1");
	     SparePartType part2 = new SparePartType("ΤύποςΑνταλλακτικού2");
	     SparePartType part3 = new SparePartType("ΤύποςΑνταλλακτικού3");
	     SparePartType part4 = new SparePartType("ΤύποςΑνταλλακτικού4");
         SparePartType part5 = new SparePartType("ΤύποςΑνταλλακτικού5");
	     SparePartType part6 = new SparePartType("ΤύποςΑνταλλακτικού6");

      

        
    }
        
	
}
