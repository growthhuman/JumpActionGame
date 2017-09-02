package jp.techacademy.kenta.imabayashi.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by kenta on 2017/09/02.
 */

public class Enemy extends GameObject{
    //横幅、高さ
    public static final float ENEMY_WIDTH = 1.0f;
    public static final float ENEMY_HEIGHT = 1.0f;

    /** これいるか？
    //状態（ジャンプ中、落ちている最中）
    public static final int ENEMY_STATE_JUMP= 0;
    public static final int ENEMY_STATE_FALL = 1;

    //速度
    public static final float ENEMY_JUMP_VELOCITY = 11.0f;
    public static final float ENEMY_MOVE_VELOCITY = 20.0f;
    **/
    int mState;


    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
    }
}
