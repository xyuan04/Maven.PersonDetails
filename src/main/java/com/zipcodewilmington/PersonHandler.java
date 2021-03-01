package com.zipcodewilmington;

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
        StringBuilder newPerson = new StringBuilder();
        int counter = 0;
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        while (counter < this.personArray.length) {
            newPerson.append(this.personArray[counter]);
            counter++;
        }
        result = newPerson.toString();
        return result;
    }



    public String forLoop() {
        String result = "";
        StringBuilder newPerson = new StringBuilder();
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for (int i = 0; i < this.personArray.length; i++) {
            newPerson.append(this.personArray[i]);
        }
        result = newPerson.toString();
        return result;
    }



    public String forEachLoop() {
        String result = "";
        StringBuilder peeps = new StringBuilder();
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for(Person newPerson:this.personArray) {
            peeps.append(newPerson);
        }

        result = peeps.toString();
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
