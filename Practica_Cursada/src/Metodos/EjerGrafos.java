//package Metodos;
//
//public class EjerGrafos {
//    public static int mayorCosto(GrafoTDA g, int v) {
//        int max=-1;
//        ConjuntoTDA vertices=g.vertices();
//        if (vertices.pertenece(v)) {
//            vertices.sacar(v);
//            boolean primeraVez=true;
//            while(!vertices.conjuntoVacio()) {
//                int vertice_destino=vertices.elegir();
//                if(g.existeArista(v,vertice_destino))
//                    if (primeraVez) {
//                        max=g.pesoArista(v,vertice_destino);
//                        primeraVez=false;
//                    }
//                    else
//                    if (max < g.pesoArista(v,vertice_destino))
//                        max=g.pesoArista(v,vertice_destino);
//                vertices.sacar(vertice_destino);
//            }
//        }
//        return max;
//    }
//
//
//    public static int mayorCosto1(GrafoTDA g, int v) {
//        int max=-1;
//        ConjuntoTDA vertices=g.vertices();
//        if (vertices.pertenece(v)) {
//            vertices.sacar(v);
//            while(!vertices.conjuntoVacio()) {
//                int vertice_destino=vertices.elegir();
//                if(g.existeArista(v,vertice_destino))
//                    if (max < g.pesoArista(v,vertice_destino))
//                        max=g.pesoArista(v,vertice_destino);
//                vertices.sacar(vertice_destino);
//            }
//        }
//        return max;
//    }
//    public static ConjuntoTDA conjuntoPredecesor(GrafoTDA g, int v) {
//        ConjuntoTDA conjResultante=new ConjuntoLD();
//        conjResultante.inicializarConjunto();
//        ConjuntoTDA vertices=g.vertices();
//        if (vertices.pertenece(v)) {
//            vertices.sacar(v);
//            while(!vertices.conjuntoVacio()) {
//                int vertice_origen=vertices.elegir();
//                if(g.existeArista(vertice_origen,v))
//                    conjResultante.agregar(vertice_origen);
//                vertices.sacar(vertice_origen);
//            }
//        }
//        return conjResultante;
//    }
//
//    public static ConjuntoTDA dobleAdyacente(GrafoTDA g, int v) {
//        ConjuntoTDA conjResultante=new ConjuntoLD();
//        conjResultante.inicializarConjunto();
//        ConjuntoTDA ws;
//        ConjuntoTDA xs=g.vertices();
//        if (xs.pertenece(v)) {
//            xs.sacar(v);
//            while(!xs.conjuntoVacio()) {//Candidatos a x
//                int x =xs.elegir();
//                if(g.existeArista(v,x)) {
//                    ws=g.vertices();
//                    ws.sacar(v);
//                    while(!ws.conjuntoVacio()) {//Candidatos a w
//                        int w=ws.elegir();
//                        if (g.existeArista(x, w))// Por cada x debo verificar que exista un w
//                            conjResultante.agregar(w);
//                        ws.sacar(w);
//                    }
//                }
//                xs.sacar(x);
//            }
//        }
//        return conjResultante;
//    }
//
//    public static ConjuntoTDA aislados(GrafoTDA g) {
//        ConjuntoTDA conjResultante=new ConjuntoLD();
//        conjResultante.inicializarConjunto();
//        ConjuntoTDA vertices=g.vertices();
//        while(!vertices.conjuntoVacio()) {//Candidatos a aislado
//            int v=vertices.elegir();
//            boolean aislado=true;
//            ConjuntoTDA otros=g.vertices();
//            otros.sacar(v);
//            while(!otros.conjuntoVacio() && aislado) {//Candidatos a w
//                int otro=otros.elegir();
//                if (g.existeArista(v, otro) || g.existeArista(otro, v ))// Por cada v debo verificar que sea aislado
//                    aislado=false;
//                otros.sacar(otro);
//            }
//            if (aislado)
//                conjResultante.agregar(v);
//
//            vertices.sacar(v);
//        }
//
//        return conjResultante;
//    }
//}
