import 'Animal.dart';


class Cocodrilo extends Animal{
  Cocodrilo(super.patas, super.tipoComida, super.puedeNadar, super.puedeVolar);

  
  void infoCocodrilo(){
    print("Cocodrilo-- Tiene $patas Patas -- Es $tipoComida -- Puede nadar: $puedeNadar , Puede Volar: $puedeVolar");
  }

}