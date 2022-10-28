
import 'Animal.dart';
import 'Cocodrilo.dart';
import 'Perro.dart';
import 'Mono.dart';
import 'Gato.dart';
import 'Pajaro.dart';
void main(List<String> args) {
  
  print("TIENDA DE ANIMALES");
  print("------------------");

  //Animal animal=new Animal();

  //Animales 
  
  Perro perro = Perro(4,"Omnivoro",true,false);

  print("$Perro" +"$perro");



  Gato gato= Gato(4,"Carnivoro", true, false);

  print("$Gato" +"$gato");

  Mono mono= Mono(4,"Omnivoro", true, false);

  print("$Mono" +"$mono");


  Pajaro pajaro= Pajaro(2,"Herbivoro", false, true);

  print("$Pajaro" +"$pajaro");


  Cocodrilo cocodrilo= Cocodrilo(4,"Carnivoro", true, false);

  print("$Cocodrilo" +"$cocodrilo");



 /* perro.patas=4;
  perro.tipoComida="Omnivoro";
  perro.puedeNadar=true;
  perro.puedeVolar=false;*/

  /*Gato gato = new Gato();
  gato.patas=4;
  gato.tipoComida="Carnivoro";
  gato.puedeNadar=false;
  gato.puedeVolar=false;

  gato.infoGato();

  Mono mono = new Mono();
  mono.patas=2;
  mono.tipoComida="Omnivoro";
  mono.puedeNadar=true;
  mono.puedeVolar=false;

  mono.infoMono();

  Pajaro pajaro = new Pajaro();

  pajaro.patas=2;
  pajaro.tipoComida="Herbivoro";
  pajaro.puedeNadar=false;
  pajaro.puedeVolar=true;

  pajaro.infoPajaro();

  Cocodrilo cocodrilo = new Cocodrilo();

  cocodrilo.patas=4;
  cocodrilo.tipoComida="Carnivoro";
  cocodrilo.puedeNadar=true;
  cocodrilo.puedeVolar=false;

  cocodrilo.infoCocodrilo();*/

List<Animal>mainAnimals= [];

mainAnimals.add(Perro(4, "Omnivoro", true, false));
print(mainAnimals);

//AÑADIR MAS ANIMALES

 Map<String,Animal> moreAnimals ={
  
  
  "Caballo": Animal(4,"Herbivoro",false,false),
  "Delfin": Animal(0,"Carnivoro",true,false),
  "Aguila": Animal(2,"Carnivoro",false,true),
  "Oso": Animal(4,"Omnivoro",false,false),


};

/*print("--Nuevos animales-");
moreAnimals.forEach((key, value) { 
  print('$key,$value');*/

print("------NUEVOS ANIMALES -----------");
for(final String key in moreAnimals.keys){  //Bucle para ordenar los animales por la key.
  print("$key: ${moreAnimals[key]}");
}
}


//Agrupar animales por tipoComida

/*List<Animal> moreAnimalsExtra=[];
  moreAnimalsExtra.add(Perro(4, "Omnivoro", true, false));
  moreAnimalsExtra.add(Gato(4, "Carnivoro", false, false));
  moreAnimalsExtra.add(Mono(4, "Omnivoro", true, false));
  moreAnimalsExtra.add(Pajaro(2, "Herbivoro", false, true));
  moreAnimalsExtra.add(Cocodrilo(4, "Carnivoro", true, false));
  
List<Animal> herbivoro=[];
List<Animal> carnivoro=[];
List<Animal> omnivoro=[];

for(int i=0, i 5,i++){
  print(moreAnimalsExtra[i]);
}
}

}

}
if(moreAnimalsExtra.contains("Omnivoro")){
  omnivoro.asMap()

if(moreAnimals.containsValue("Carnivoro")){
  add(
}
if(moreAnimals.containsValue("Herbivoro")){
  add(
}

print(herbivoro);
print(carnivoro);
print(omnivoro);
}


}
*/



//for(var entry in moreAnimals.entries){

  //hacer algo con clave y valores

  //print('${entry.key}:${entry.value}');

