import 'Animal.dart';


class Pajaro extends Animal{
  Pajaro(super.patas, super.tipoComida, super.puedeNadar, super.puedeVolar);


  
  void infoPajaro(){
    print("Pajaro-- Tiene $patas Patas-- Es $tipoComida --  Puede nadar: $puedeNadar , Puede Volar: $puedeVolar");
  }

}