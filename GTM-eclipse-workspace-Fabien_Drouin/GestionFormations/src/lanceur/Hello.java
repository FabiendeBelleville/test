package lanceur;


/**
 * 
 * @author Adminl
 *
 */


public class Hello {

	/**
	 * la méthode main est statique, elle est chargée en mémoire
	 * au démarrage de l'application et peut donc être utilisée avant la
	 * création de tout objet
	 * 
	 * @param args
	 * c'est un programme tout simple
	 * 
	 */ 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour formation JAVA") ; 
	
		
		
String pseudo="Fabien";
		
		int age=2;

System.out.println(pseudo + " " +age); 
age+=7;
System.out.println("le pseudo change");
pseudo="Tanguy";
System.out.println(pseudo + " " +age); 


int note1=10, note2=8, note3=18;
double moyenne=(note1+note2+note3)/3;

System.out.println(moyenne); 



if(age >=18) {
	System.out.println("personne majeure"); 

}
else if(age<10) {
	System.out.println("c'est un enfant"); 

}

else {
	System.out.println("personne mineure"); 

}
switch(age) {
case 10:  
	System.out.println("la personne a"+" "+ age + " "+ "ans"); 
	break;
default:
	System.out.println("Eh, maintenant tu vas t'arrêter"); 
}

int monnaie=10000;
int telephone=1000;
boolean hasPhone=false;
if(monnaie>=telephone && !hasPhone) {
	System.out.println("achat possible"); 
	
	
	
} 
else {
	System.out.println("achat impossible"); 

}

//On passe aux tableaux
System.out.println("*******************************"); 
System.out.println("*****On passe aux tableaux*****"); 
System.out.println("*******************************"); 



String[] listeDesNoms={
		
		"Tanguy", "Tanguy", "Brice"
		
};
		

//comparaison des données tableau
if(listeDesNoms[0]==listeDesNoms[1]) {
	System.out.println("Mêmes noms dans le tableau !!"); 
	
	
	
} 
else {
	System.out.println("Noms différents"); 

}
//tableaux d'entiers
int[] tailles={
		
		12,7,19		
};
System.out.println(tailles.length); 

float calculMoyenne=((tailles[0]+tailles[1]+tailles[2])/tailles.length);
System.out.println(calculMoyenne); 

//Maintenant on met des tableaux dans des tableaux
int[][] taillesPuissance3={
		{
			5,7,8
		},
		{
			3,2,1
		},
		{
			9,4,2
		},
};
System.out.println(taillesPuissance3[2][1]);

String xdfgksdfgj="reine,fou,tour,roi,cavalier";
String xdfgksdfgjS[]=xdfgksdfgj.split(",");
System.out.println(xdfgksdfgjS.length); 
System.out.println(xdfgksdfgjS[2]); 

//On passe aux boucles!
System.out.println("*******************************"); 
System.out.println("*****On passe aux boucles!*****"); 
System.out.println("*******************************"); 

//For
System.out.println("*****Boucle For*****"); 
	for(int i = 0; i<10; i++){
	System.out.println("ceci est le tour de boucle "+ i); 
}
	

	//For en boucle infinie
		//for(;;){
		//	System.out.println("ceci est le tour de boucle test infinie"); 
		//}
		
		



	
//For each
	System.out.println("*****Boucle For each*****"); 
	for(String str : xdfgksdfgjS) {
		System.out.println(str); 
	}
		
//For each (en récupérant les valeurs d'un tableau)
	System.out.println("*****For each (en récupérant les valeurs d'un tableau)*****"); 
int notes[]= {12,18,17,20};
int calcul=0;
for(int chaque_note : notes) {
	calcul = calcul + chaque_note;
	System.out.println(chaque_note); 
}
calcul=calcul/notes.length;

System.out.println("le résultat du calcul sur les valeurs est "+ calcul); 

//While
System.out.println("*****Boucle While*****");
int i=0;


while(i!=7) {
	i++;
	System.out.println("fromage "+i);
}
//boucle infinie
//while(true) {
	//i++;
	//System.out.println("fromage "+i);
//}


//Do While
//s'execute au moins une fois (do while essai d'abord une fois la boucle avant de faire le test donc au moins 1 tour de boucle)
System.out.println("*****Boucle Do While*****");
i=0;
do {
	i++;
	System.out.println("fromage de chèvre "+i);
} while(i!=7);
	




		
	}

}
