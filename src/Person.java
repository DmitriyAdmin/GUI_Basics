public class Person
    {
        private String surname;
        private String name;
        private String patronymic;

        public Person(String surname, String name, String patronymic)
            {
                this.surname = surname;
                this.name = name;
                this.patronymic = patronymic;
            }

        public String getSurname()
            {
                return surname;
            }

        public void setSurname(String surname)
            {
                this.surname = surname;
            }

        public String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }

        public String getPatronymic()
            {
                return patronymic;
            }

        public void setPatronymic(String patronymic)
            {
                this.patronymic = patronymic;
            }

        @Override
        public String toString()
            {
                StringBuilder returnText = new StringBuilder();
                for(String value : new String[]{getSurname(), getName(), getPatronymic()})
                    {
                        if(returnText.length() > 0 && value.length() > 0 && value != null)
                            returnText.append(" ");
                        returnText.append(value);
                    }

                return returnText.toString();
            }
    }
