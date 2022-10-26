public class massPerson {

    public Person[] pers = new Person[Person.count];


    public void sort(String a) {
        boolean sorted = false;
        Person buf;
        switch (a) {
            case "id":
                while (!sorted) {
                    sorted = true;
                    for (int i = 0; i < pers.length - 1; i++) {
                        for (int j = 0; j < pers.length - 1; j++) {
                            if (pers[j].getId() > pers[j + 1].getId()) {
                                buf = pers[j];
                                pers[j] = pers[j + 1];
                                pers[j + 1] = buf;
                                sorted = false;
                            }
                        }
                    }
                }
                break;
            case "name":
                while (!sorted) {
                    int b = 0;
                    sorted = true;
                    for (int i = 0; i < pers.length - 1; i++) {
                        for (int j = 0; j < pers.length - 1; j++) {
                            while (pers[j].getName().charAt(b) == pers[j + 1].getName().charAt(b)){
                                b++;
                                if (b==pers[j].getName().length()-1 && pers[j].getName().charAt(b) == pers[j + 1].getName().charAt(b)){
                                    j++;
                                }
                            }
                            b = 0;
                            if (pers[j].getName().charAt(b) > pers[j + 1].getName().charAt(b)) {
                                buf = pers[j];
                                pers[j] = pers[j + 1];
                                pers[j + 1] = buf;
                                sorted = false;
                            }

                        }
                    }
                }
                break;
            case "surname":
                while (!sorted) {
                    int b = 0;
                    sorted = true;
                    for (int i = 0; i < pers.length - 1; i++) {
                        for (int j = 0; j < pers.length - 1; j++) {
                            while (pers[j].getName().charAt(b) == pers[j + 1].getName().charAt(b)){
                                b++;
                                if (b==pers[j].getName().length()-1 && pers[j].getName().charAt(b) == pers[j + 1].getName().charAt(b)){
                                    j++;
                                }
                            }
                            b = 0;
                            if (pers[j].getSurname().charAt(b) > pers[j + 1].getSurname().charAt(b)) {
                                buf = pers[j];
                                pers[j] = pers[j + 1];
                                pers[j + 1] = buf;
                                sorted = false;
                            }
                        }
                    }
                }
            break;
            case "mailInd":
                while (!sorted) {
                    sorted = true;
                    for (int i = 0; i < pers.length - 1; i++) {
                        for (int j = 0; j < pers.length - 1; j++) {
                            if (pers[j].getMailInd() > pers[j + 1].getMailInd()) {
                                buf = pers[j];
                                pers[j] = pers[j + 1];
                                pers[j + 1] = buf;
                                sorted = false;
                            }
                        }
                    }
                }
            break;
            case "number":
                while (!sorted) {
                    sorted = true;
                    for (int i = 0; i < pers.length - 1; i++) {
                        for (int j = 0; j < pers.length - 1; j++) {
                            if (pers[j].getNumber() > pers[j + 1].getNumber()) {
                                buf = pers[j];
                                pers[j] = pers[j + 1];
                                pers[j + 1] = buf;
                                sorted = false;
                            }
                        }
                    }
                }
            break;

        }
    }
}
