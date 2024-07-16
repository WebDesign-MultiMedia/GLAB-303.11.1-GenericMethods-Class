public class GMultipleDatatype  <Datatypeone, DatatypeTwo>{
    Datatypeone vOne;
    DatatypeTwo vTwo;

    public GMultipleDatatype(Datatypeone v1, DatatypeTwo v2){
        this.vOne = v1;
        this.vTwo = v2;
    }

    public  Datatypeone getvOne(){
        return vOne;
    }

    public void setvOne(Datatypeone vOne){
        this.vOne = vOne;
    }

    public DatatypeTwo getvTwo(){
        return vTwo;
    }

    public void setvTwo(DatatypeTwo vTwo){
        this.vTwo = vTwo;
    }





}

