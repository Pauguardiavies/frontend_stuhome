import 'Animal.dart';

class Gato extends Animal{
  Gato(super.patas, super.tipoComida, super.puedeNadar, super.puedeVolar);

  
  void infoGato(){
    print("Gato-- Tiene $patas Patas-- Es $tipoComida -- Puede nadar: $puedeNadar , Puede Volar: $puedeVolar");
    return infoGato();
  }

}