package jp.ac.uryukyu.ie.e245729;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    /**
     * attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを確認する。
     * 検証手順
     *  (1) 戦士と敵を準備。戦士の攻撃力は100、敵のHPは500に設定しておく。
     *  (2) 敵に対してattackWithWeponSkillを実行する。
     *  (3) ダメージ量を計算し、ダメージ量が150になっているか確認する。
     *  (4) (2)~(3)を３回繰り返す
     */
    @Test
    void attackWithWeponSkillTest() {
        Warrior demoWarrior = new Warrior("デモ勇者", 500, 100);
        Enemy slime = new Enemy("スライムもどき", 500, 100);
        for(int i = 0; i < 3; i++){
            int beforeHitPoint = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            int afterHitPoint = slime.getHitPoint();
            int damage = beforeHitPoint - afterHitPoint;
            assertEquals(damage, 150);
        }
    }
}