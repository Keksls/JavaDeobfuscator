/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class fwh {
    private final fwg a = new fwg();
    private final float[] b = new float[4];
    private float c;
    private float d;

    public ays_2 a(int n, int n2, String string) {
        BufferedImage bufferedImage = new BufferedImage(n, n2, 1);
        this.a(bufferedImage, true);
        azk_2 azk_22 = azk_2.a(bufferedImage);
        ays_2 ays_22 = ayu_2.a().b((aui_2)auj_1.a.a(), (long)auc_1.d(string), azk_22, true);
        azk_22.u();
        return ays_22;
    }

    public ays_2 a(int n, int n2, String string, float f2, float f3) {
        this.c = f2;
        this.d = f3;
        BufferedImage bufferedImage = new BufferedImage(n, n2, 1);
        this.a(bufferedImage, false);
        azk_2 azk_22 = azk_2.a(bufferedImage);
        ays_2 ays_22 = ayu_2.a().b((aui_2)auj_1.a.a(), (long)auc_1.d(string), azk_22, false);
        azk_22.u();
        return ays_22;
    }

    private void a(BufferedImage bufferedImage, boolean bl) {
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        if (n <= 0 || n2 <= 0) {
            return;
        }
        int n3 = n * n2;
        int[] nArray = new int[n3];
        float f2 = 1.0f / (float)(n - 1);
        float f3 = 1.0f / (float)(n2 - 1);
        int n4 = 0;
        float f4 = 0.0f;
        int n5 = 0;
        while (n5 < n2) {
            int n6;
            if (bl) {
                float f5 = 0.0f;
                n6 = 0;
                while (n6 < n) {
                    nArray[n4] = this.a(f5, f4);
                    ++n6;
                    f5 += f2;
                    ++n4;
                }
            } else {
                int n7 = this.a(f4);
                n6 = 0;
                while (n6 < n) {
                    nArray[n4] = n7;
                    ++n6;
                    ++n4;
                }
            }
            ++n5;
            f4 += f3;
        }
        bufferedImage.setRGB(0, 0, n, n2, nArray, 0, n);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(bufferedImage, 0, 0, n, n2, null);
        graphics2D.setXORMode(Color.WHITE);
        graphics2D.setColor(Color.BLACK);
        graphics2D.setPaintMode();
        graphics2D.dispose();
    }

    int a(float f2, float f3) {
        this.b[0] = f2;
        this.b[1] = 1.0f - f3;
        this.b[2] = this.a.a(2);
        this.b[3] = 0.0f;
        return this.a.a(this.b);
    }

    int a(float f2) {
        this.b[0] = this.c;
        this.b[1] = this.d;
        this.b[2] = 1.0f - f2;
        this.b[3] = 0.0f;
        return this.a.a(this.b);
    }
}

