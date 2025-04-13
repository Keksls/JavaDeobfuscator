/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.EnumMap;

/*
 * Renamed from fyt
 */
public class fyt_0 {
    private static final fyt_0 a = new fyt_0();
    private final EnumMap<frb_0, fje_2> b = new EnumMap(frb_0.class);
    private frb_0 c;
    private boolean d = false;

    private fyt_0() {
    }

    public static fyt_0 a() {
        return a;
    }

    public frb_0 b() {
        return this.c;
    }

    public void a(frb_0 frb_02, boolean bl) {
        fje_2 fje_22;
        if ((!this.d || bl) && this.c != frb_02 && (fje_22 = this.b.get((Object)frb_02)) != null) {
            this.d();
            fje_22.b();
            this.c = frb_02;
        }
        if (bl) {
            this.d = true;
        }
    }

    public void c() {
        this.d = false;
        if (this.c == frb_0.a) {
            return;
        }
        this.d();
        this.c = frb_0.a;
        this.b.get((Object)this.c).b();
    }

    private void d() {
        fje_2 fje_22 = this.b.get((Object)this.c);
        if (fje_22 != null) {
            fje_22.c();
        }
    }

    public void a(frb_0 frb_02) {
        this.a(frb_02, false);
    }

    public void a(frb_0 frb_02, int n, int n2, BufferedImage bufferedImage) {
        if (frb_02 != null && bufferedImage != null) {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimension = toolkit.getBestCursorSize(bufferedImage.getWidth(), bufferedImage.getHeight());
            float f2 = (float)dimension.width / (float)bufferedImage.getWidth();
            float f3 = (float)dimension.height / (float)bufferedImage.getHeight();
            n = (int)((float)n * f2);
            n2 = (int)((float)n2 * f3);
            this.b.put(frb_02, new fjy_1(toolkit.createCustomCursor(bufferedImage, new Point(n, n2), null)));
            if (frb_02.equals((Object)frb_0.a)) {
                this.a(frb_02);
            }
        }
    }

    public void a(frb_0 frb_02, int n, int n2, int n3, ArrayList<BufferedImage> arrayList) {
        if (arrayList == null) {
            return;
        }
        int n4 = arrayList.size();
        if (frb_02 != null && n4 > 0) {
            if (n4 == 1) {
                this.a(frb_02, n, n2, arrayList.get(0));
                return;
            }
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            BufferedImage bufferedImage = arrayList.get(0);
            Dimension dimension = toolkit.getBestCursorSize(bufferedImage.getWidth(), bufferedImage.getHeight());
            float f2 = (float)dimension.width / (float)bufferedImage.getWidth();
            float f3 = (float)dimension.height / (float)bufferedImage.getHeight();
            n = (int)((float)n * f2);
            n2 = (int)((float)n2 * f3);
            Cursor[] cursorArray = new Cursor[n4];
            for (int k = 0; k < n4; ++k) {
                cursorArray[k] = toolkit.createCustomCursor(arrayList.get(k), new Point(n, n2), null);
            }
            this.b.put(frb_02, new fjc_2(cursorArray, n3));
            if (frb_02.equals((Object)frb_0.a)) {
                this.a(frb_02);
            }
        }
    }
}

