class Human {
    static final String classification = "哺乳類";
    String name;
    int age;
    
    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void greet() {
        System.out.printf("初めまして、%sです。\n", this.name); 
    }
    
    static final boolean isMammal() {
        return true;
    }
    /*
    エラーが発生
    フィールドを参照できない
    static void growOld() {
        age++;
    }*/
}

class Japanese extends Human {
    Japanese(String name, int age) {
        super(name, age);
    }
    @Override
    void greet() {
        super.greet();
        System.out.println("日本人です");
    }
}

class American extends Human {
    American(String name, int age) {
        super(name, age);
    }
    @Override
    void greet() {
        super.greet();
        System.out.println("アメリカ人");
    }
}