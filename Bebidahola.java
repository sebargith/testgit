public abstract class Bebidahola {
    
        private int serie;
        
        public Bebidahola(int serie){
            this.serie=serie;
        }
        public int getSerie(){
            return serie;
        }
        public abstract String beberhola();
    }
    
    class Sprite extends Bebida{
        public Sprite(int serie){
            super(serie);
        }
        public String beber(){
            return "sprite";
        }
    }
    
    class CocaCola extends Bebida{
        public CocaCola(int serie){
            super(serie);  
        }
        public String beber(){
            return "cocacola";
        }
    
}
