package jp.ac.uryukyu.ie.e245729;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 自分の名前
     * @param maximumHP 自分のHP
     * @param attack 自分の攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * isDeadメソッド
     * 自分の生死の状態(dead)を取得する
     * @return 自分の生死(dead)
     */
    public boolean isDead(){
        return this.dead;
    }
    /**
     * getNameメソッド
     * 自分の名前(name)を取得する
     * @return 自分の名前
     */
    public String getName(){
        return this.name;
    }
    /**
     * getHitPointメソッド
     * 自分のHP(hitPoint)を取得する
     * @return 自分のHP
     */
    public int getHitPoint(){
        return this.hitPoint;
    }
    /**
     * getAttackメソッド
     * 自分の攻撃力(attack)を取得する
     * @return 自分の攻撃力
     */
    public int getAttack(){
        return this.attack;
    }
    /**
     * setDeadメソッド
     * 自分の生死の状況(dead)を変更する
     * @param dead
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }
    /**
     * setHitPointメソッド
     * 自分のHP(hitPoint)を変更する
     * @param hitPoint
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    /**
     * LivingThingへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if(dead == false){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);}
    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            this.dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}