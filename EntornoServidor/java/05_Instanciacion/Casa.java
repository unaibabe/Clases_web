public class Casa{
    public int superficie, aseos, habitaciones;
    
    public Casa(int sup, int hab, int as){
        superficie = sup;
        aseos = as;
        habitaciones = hab;
        
        
    }
    public boolean equals(Casa casa){
        // Paradigma declarativo logico
       return (superficie == casa.superficie) && (habitaciones == casa.habitaciones) && (aseos == casa.aseos);
    }
}