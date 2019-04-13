class Profile {
    private String name;
    private int lv;
    private int hp;
    
    Profile(String _name, int _lv, int _hp) {
        this.name = _name;
        this.lv = _lv;
        this.hp = _jp;
    }
    
    public String getName() {
        return this.name;
    }
    public int getLv() {
        return this.lv;
    }
    public int getHp() {
        return this.hp;
    }
    public static void write(String str) {
        System.out.println(str);
    }
    public void show() {
        System.out.println( this.name + "のLVは" + this.lv + "です");
    }
}