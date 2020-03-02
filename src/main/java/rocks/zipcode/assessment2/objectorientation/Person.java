package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    Long id;
    String name;
    Address address;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person(){
        this.id = Long.MIN_VALUE;
        this.name = "";
        this.address = new Address();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if(o.equals(this.id)){
            return true;
        }else if(((String)o).equals(this.name)){
            return true;
        }else if(((String)o).equals(this.address)){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "Person{id="+this.id+", name="+this.getName()+", address="+this.address.getAddressLine1()+", addressLine2="+this.address.getAddressLine2()+" city="+this.address.getCity()+" state="+this.address.getState()+", zipcode="+this.address.getZipcode()+"}}";
    }
}