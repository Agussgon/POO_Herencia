

import java.util.*;

public class Main {


    static void main() {

        Ornitorrinco perri= new Ornitorrinco(1,"perri",2,3);
        Ornitorrinco perri2= new Ornitorrinco(2,"perri2",2,3);
        Ornitorrinco perri3= new Ornitorrinco(0,"perri3",2,3);


        IO.println("Ejemplos con List: ");
        //creando objeto de tipo List y agregando obj. de distinta forma
        List<Ornitorrinco> ornitorrincosList= new ArrayList<>( List.of(perri,perri2) );
        ornitorrincosList.addAll(List.of(perri,perri3)); //cargo de nuevo a perri

        IO.println(ornitorrincosList);

        Collections.sort(ornitorrincosList);

        IO.println(ornitorrincosList);

        //si necesito garantizar que no se guarden duplicados y acceder de forma rápida a los obj. usamos set





        IO.println("Comienzo con Set");
        //Una de Animales general en la cual no puedan repetirse elementos. probando cargar duplicados. no mantiene el orden
        Set<Animal> animalesSet= new HashSet<>( Set.of(perri,perri2));
        animalesSet.add(null); //uno solo
        animalesSet.addAll(Set.of(perri3,perri)); //no permite guardar duplicados....
        animalesSet.add(new Ornitorrinco(1,"perri",2,2)); //no permite guardar duplicados....
        //no respeta el orden de guardado a != de list
        IO.println(animalesSet);

        boolean respuesta= animalesSet.stream().anyMatch(a-> a instanceof Mamifero);
        IO.println("hay un mamifero en la lista de animales?" + respuesta);

        //si es verdad guardamos esos animales en una nueva lista
        List listaFiltrada= new ArrayList<>();

        if(respuesta){
           listaFiltrada= animalesSet.stream().filter(animal -> animal instanceof Mamifero ).toList();
        }

        IO.println(listaFiltrada);



        //eliminar desde Set si cumple una condición
        animalesSet.removeIf(animal -> animal != null && animal.getNombre().startsWith("p"));

        IO.println(animalesSet); //solo queda el valor nulo

        // Consultar si hay algún mamífero en la colección de irrepetibles y crear una nueva lista a partir de ese filtro.



        IO.println("inicio map");

        //La tercera de Aves que permita buscar por id un Ave de forma rápida.

      Ave ave1= new Ave(20,"Piolin",3,"..");
      Ave ave2= new Ave(10,"Alba",3,"..");
      Ave ave3= new Ave(10,"Piolin",3,"..");//no se duplica el código

        Map<Integer,Ave > avesMap= new HashMap<>();
        avesMap.put(ave1.getId(), ave1);
        avesMap.put(ave2.getId(),ave2);
        avesMap.put(null, null); //Una sola clave nula
        avesMap.put(null, ave2);

        //como queda la coleccion map
        IO.println(avesMap);


        //eliminar aves que comienzan con a

        List clavesEliminar= new ArrayList<>();

        avesMap.forEach(( k,v)->
        {if (v.getNombre().toLowerCase().charAt(0) == 'a') {
           IO.println("se encontró el ave que comienza con a "+ v);
           clavesEliminar.add(k);
        //   avesMap.remove(k); // No se puede por ConcurrentModificationException
            }
            } );
        clavesEliminar.forEach(clave-> avesMap.remove(clave));



//
//        Consultar si la colección de dueños tiene a alguien en
//        particular.
        IO.println("se elimina ");

        Integer claveB= null;

        for(Integer clave: avesMap.keySet()){
            if(avesMap.get(clave).getNombre().toLowerCase().charAt(0) == 'a'){
               claveB=clave;
            }
        }

        avesMap.remove(claveB);

        //como queda después de eliminar
        IO.println(avesMap);













    }





    }


