/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;

/*
 * Renamed from cKQ
 */
public class ckq_2
extends fbl_2 {
    public static final String TAG = "timePointBarDecorator";
    public static final String a = "link";
    public static final String b = "doubleBubble";
    public static final String c = "borderBubble";
    public static final String d = "oppositeBorderBubble";
    private ckr_2 f;

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof fqv) {
            fqv fqv2 = (fqv)fyb_02;
            String string = fqv2.getName();
            if (a.equals(string)) {
                this.f.b(fqv2.getPixmap());
            } else if (b.equals(string)) {
                this.f.c(fqv2.getPixmap());
            } else if (c.equals(string)) {
                this.f.a(fqv2.getPixmap());
            } else if (d.equals(string)) {
                this.f.d(fqv2.getPixmap());
            }
        }
    }

    public void setPixelSeparations(int[] nArray, int[] nArray2, float[] fArray) {
        this.f.a(nArray, nArray2, fArray);
    }

    public int[] getPixelSeparations() {
        return this.f.b();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public ckr_2 getMesh() {
        return this.f;
    }

    @Override
    public Entity getEntity() {
        return this.f.g();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.f = new ckr_2();
        this.f.i();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.f = null;
    }
}

