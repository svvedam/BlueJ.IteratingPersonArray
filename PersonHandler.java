 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // assume there is a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
            int arrLength = personArray.length;
            int counter=0;
            Person person=null;
            String stringPerson="";
            while(counter<arrLength){
                person = personArray[counter];
                stringPerson = person.toString();
                result=result+stringPerson;
                counter++;
            }
           
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
            int arrLength = personArray.length;
            
            Person person=null;
            String stringPerson="";
            for(int counter=0; counter < arrLength; counter++){
                person = personArray[counter];
                stringPerson = person.toString();
                result=result+stringPerson;
            }
            
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
         
            for(Person person : personArray){
                result = result + person.toString();
            }
            
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
