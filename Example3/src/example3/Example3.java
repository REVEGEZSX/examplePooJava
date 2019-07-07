package example3;

public class Example3 {

    public static void main(String[] args) {
        smartphone array[] = new smartphone[2];
        array[0] = new LG("Plus9","201984abw45","2018");
        array[1] = new Huawei("P30","14456ERFG12","2019");
        
        for(smartphone celular: array)
        {
            System.out.println(celular.Mostrarinfo());
            System.out.println("");
        }
    }
    
}
