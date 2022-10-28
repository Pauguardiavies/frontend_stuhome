import 'Animal.dart';

class Perro extends Animal{
  
  Perro(super.patas, super.tipoComida, super.puedeNadar, super.puedeVolar);
      
  
 @override
  String toString(){
    return  super.toString();
  }    
}

  //print("Perro-- Tiene $patas Patas -- Es $tipoComida -- Puede nadar: $puedeNadar , Puede Volar: $puedeVolar");
  


