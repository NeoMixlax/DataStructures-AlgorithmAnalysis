import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Nodo raiz;

    public BinaryTree() {
        this.raiz = null;
    }

    public boolean estaVacio() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertarNodo(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo recorre = raiz;
            Nodo padre;
            while (true) {
                padre = recorre;
                if (dato < recorre.dato) {
                    recorre = recorre.hijoIzquierdo;
                    if (recorre == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    recorre = recorre.hijoDerecho;
                    if (recorre == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public void instertarNodoRecursivo(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    public Nodo insertarRec(Nodo padre, int dato) {
        if (padre == null) {
            return new Nodo(dato);
        } else {
            if (dato < padre.dato) {
                padre.hijoIzquierdo = insertarRec(padre.hijoIzquierdo, dato);
            } else if (dato >= padre.dato) {
                padre.hijoDerecho = insertarRec(padre.hijoDerecho, dato);
            }
            return padre;
        }
    }

    public void recorrerAnchura() {
        if (estaVacio()) {
            System.out.println("El árbol está vacío");
        } else {
            Queue<Nodo> nodos = new LinkedList<>();
            nodos.add(raiz);

            while (!nodos.isEmpty()) {
                Nodo nodo = nodos.poll();

                System.out.println(" " + nodo.dato);

                if (nodo.hijoIzquierdo != null) {
                    nodos.add(nodo.hijoIzquierdo);
                }
                if (nodo.hijoDerecho != null) {
                    nodos.add(nodo.hijoDerecho);
                }
            }
        }
    }

    public void recorrerPreOrden(Nodo recorre) {
        if (recorre != null) {
            System.out.println(recorre.dato);
            recorrerPreOrden(recorre.hijoIzquierdo);
            recorrerPreOrden(recorre.hijoDerecho);
        }
    }

    public void recorrerOrden(Nodo recorre) {
        if (recorre != null) {
            recorrerOrden(recorre.hijoIzquierdo);
            System.out.println(recorre.dato);
            recorrerOrden(recorre.hijoDerecho);
        }
    }

    public void recorrerPostOrden(Nodo recorre) {
        if (recorre != null) {
            recorrerPostOrden(recorre.hijoIzquierdo);
            recorrerPostOrden(recorre.hijoDerecho);
            System.out.println(recorre.dato);
        }
    }

    public void eliminarNodo(int dato) {
        eliminarNodoRec(raiz, dato);
    }

    public Nodo minimoElemento(Nodo recorre) {
        if (recorre.hijoIzquierdo == null)
            return recorre;
        else
            return minimoElemento(recorre.hijoIzquierdo);
    }

    public Nodo eliminarNodoRec(Nodo recorre, int dato) {
        if (recorre == null) //No tiene mas hijos
            return null;
        if (dato < recorre.dato) { //Buscando nodo a eliminar
            recorre.hijoIzquierdo = eliminarNodoRec(recorre.hijoIzquierdo, dato);
        } else if (dato > recorre.dato) {
            recorre.hijoDerecho = eliminarNodoRec(recorre.hijoDerecho,
                    dato);
        } else {
            // Si el nodo a borrar tiene 2 hijos
            if (recorre.hijoIzquierdo != null && recorre.hijoDerecho != null) {
                Nodo temp = recorre;
                // busque el menor nodo de la derecha, reemplace recorre y borrelo
                Nodo minNodoDerecha = minimoElemento(temp.hijoDerecho);
                recorre.dato = minNodoDerecha.dato;
                recorre.hijoDerecho = eliminarNodoRec(recorre.hijoDerecho,
                        minNodoDerecha.dato);
            } // Si el nodo a borrar tiene 1 hijo (hijo izquierda); asignelo
            else if (recorre.hijoIzquierdo != null) {
                recorre = recorre.hijoIzquierdo;
            }
            // Si el nodo a borrar tiene 1 hijo (hijo derecha); asignelo
            else if (recorre.hijoDerecho != null) {
                recorre = recorre.hijoDerecho;
            }
            // Si el nodo a borrar no tiene hijos (hoja); borrelo
            else {
                recorre = null;
            }
        }
        return recorre;
    }
}
