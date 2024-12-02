package jp.ac.uryukyu.ie.e245729;

/**
 * 戦士クラス。
 *  String name; //戦士の名前
 *  int hitPoint; //戦士のHP
 *  int attack; //戦士の攻撃力
 *  boolean dead; //戦士の生死状態。true=死亡。
 */
public class Warrior extends Hero{
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 戦士名
     * @param maximumHP 戦士のHP
     * @param attack 戦士の攻撃力
     */
    public Warrior(String name, int maximumHP, int attack){
        super (name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if(isDead() == false){
            int damage = (int)(getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);}
    }
}