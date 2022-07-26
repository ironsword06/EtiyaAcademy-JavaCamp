package ws1;

public class Main {

	public static void main(String[] args) {
		Camp camp1 = new Camp("C# kampı", "İleri seviye C# kampı", "Engin Demiroğ", "Ücretsiz");
        Camp camp2 = new Camp("Java + React kampı", "İleri seviye Java + React kampı", "Engin Demiroğ", "Ücretsiz");
        Camp camp3 = new Camp("JavaScript kampı", "İleri seviye JavaScript kampı", "Engin Demiroğ", "Ücretsiz");
        Camp camp4 = new Camp("Programlamaya giriş kursu", "Giriş seviye kamp", "Engin Demiroğ", "Ücretsiz");

        Camp[] camps = {camp1, camp2, camp3, camp4};

        for (Camp camp : camps) {
            System.out.println(camp.name);
            System.out.println(camp.details);
            System.out.println(camp.instructor);
            System.out.println(camp.price);
        }

        System.out.println("------------------------- Kamp Katılım Sayfası");

        CampManager campManager = new CampManager();
        campManager.joinCamp(camp1);
        campManager.joinCamp(camp2);
        System.out.println("-------------");
        campManager.leaveCamp(camp2);


	}

}
