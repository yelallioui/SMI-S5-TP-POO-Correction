/**
 * @author yelallioui
 *
 */

interface CalculGeometrique {
 

 default public double surface() {
        return -1;
    }
 default public double perimetre() {
        return -1;
    }
} // Fin de la l'interface CalculGeometrique