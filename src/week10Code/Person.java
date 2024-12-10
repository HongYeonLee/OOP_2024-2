package week10Code;


class Person {
    private String name;
    private int age;
    private String occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + occupation;
    }

    // Getter 및 Setter 생략 (필요에 따라 추가)
}
