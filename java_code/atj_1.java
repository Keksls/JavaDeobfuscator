/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/*
 * Renamed from atJ
 */
class atj_1
extends atl_2<FU> {
    atj_1(String string, Color color, FU fU) {
        super(string, color, fU);
    }

    @Override
    public void a(JPanel jPanel) {
        short s2 = ((FU)this.b).b();
        BufferedImage bufferedImage = atg_1.a(s2);
        Graphics graphics = jPanel.getGraphics();
        graphics.setColor(Color.GRAY);
        graphics.fillRect(0, 0, jPanel.getWidth(), jPanel.getHeight());
        graphics.setColor(Color.BLACK);
        if (bufferedImage == null) {
            return;
        }
        int n = Math.round((float)bufferedImage.getWidth() * ((FU)this.b).d());
        int n2 = Math.round((float)bufferedImage.getHeight() * ((FU)this.b).c());
        int n3 = Math.round((float)bufferedImage.getWidth() * ((FU)this.b).f());
        int n4 = Math.round((float)bufferedImage.getHeight() * ((FU)this.b).e());
        graphics.drawRect(0, 0, ((FU)this.b).g() + 2, ((FU)this.b).h() + 2);
        graphics.drawImage(bufferedImage, 1, 1, ((FU)this.b).g() + 1, ((FU)this.b).h() + 1, n, n4, n3, n2, null);
    }
}

