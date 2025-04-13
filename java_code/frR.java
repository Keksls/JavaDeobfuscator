/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class frR
extends fsk_0 {
    public static final String TAG = "AnimatedImage";
    final ArrayList<fqv> t = new ArrayList();
    private long u = 1000L;
    int v;
    private Runnable w;
    public static final int a = 95467907;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            this.a((fqv)fyb_02);
            return;
        }
        super.add(fyb_02);
    }

    private void a(fqv fqv2) {
        if (!this.t.contains(fqv2)) {
            this.t.add(fqv2);
        }
        if (this.t.size() == 1) {
            this.setPixmap(fqv2);
        } else if (this.t.size() == 2) {
            this.b();
        }
    }

    private void b() {
        this.w = new frS(this);
        ado_1.a().a(this.w, this.u, -1);
    }

    public void setDelay(long l) {
        this.u = l;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void onCheckIn() {
        ado_1.a().b(this.w);
        this.t.clear();
        super.onCheckIn();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 95467907) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setDelay(Co.f(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

