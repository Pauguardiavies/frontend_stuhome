import 'Animal.dart';

class Mono extends Animal{
  Mono(super.patas, super.tipoComida, super.puedeNadar, super.puedeVolar);

  
  void infoMono(){
    print("Mono-- Tiene $patas Patas -- Es $tipoComida --  Puede nadar: $puedeNadar , Puede Volar: $puedeVolar");
  }

}