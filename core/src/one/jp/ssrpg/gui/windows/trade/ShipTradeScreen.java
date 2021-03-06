package one.jp.ssrpg.gui.windows.trade;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import arch.interfaces.TradeSessionInterface;
import one.jp.ssrpg.gui.Assets;
import one.jp.ssrpg.gui.Styles;
import one.jp.ssrpg.gui.windows.SsrpgWindow;

/**
 * Created by Jp on 17/04/2017.
 */

public class ShipTradeScreen extends SsrpgWindow {

    public ShipTradeScreen() {
        super("", Assets.skin);
        setToStandardWindowSize();
        getTitleLabel().setVisible(false);
        setMovable(false);
        setColor(Color.BLACK);
        add(new TextButton("BUY", Styles.menuButtonStyle()));
        add(new TextButton("SELL", Styles.menuButtonStyle()));
    }

}
