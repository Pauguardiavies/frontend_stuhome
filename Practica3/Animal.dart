
class Animal{

late  int patas;
late  String tipoComida;
late  bool puedeNadar;
late  bool puedeVolar; 

 Animal(this.patas, this.tipoComida, this.puedeNadar, this.puedeVolar);

 

   @override
  String toString() {
    return "-- Tiene $patas Patas -- Es $tipoComida -- Puede nadar: $puedeNadar , Puede Volar: $puedeVolar";
  }

  compareTo(Animal b) {}
}














