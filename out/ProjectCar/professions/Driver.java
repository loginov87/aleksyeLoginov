package professions;

public class Driver extends Person {

        private int experience;
        private String name;

        public Driver(int experience, String name, int age, String fullName) {
                super(age, fullName);
                this.experience = experience;
                this.name = name;
        }


        public int getExperience() {
                return experience;
        }

        public void setExperience(int experience) {
                this.experience = experience;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override
        public String toString() {
                return "Driver{" +
                        "experience=" + experience +
                        ", name='" + name + '\'' +
                        '}';
        }
}


