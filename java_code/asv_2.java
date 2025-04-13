/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.log4j.Logger;

/*
 * Renamed from asv
 */
class asv_2 {
    private static final Logger a = Logger.getLogger(asv_2.class);
    private final asg_2[] b;
    private final acn_2<String, ash_2> c;
    private final String d;
    private final asc_2 e;

    asv_2(String string, int n) {
        int n2;
        this.d = string;
        byte[] byArray = gg_0.b(this.d);
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int n3 = byteBuffer.getInt() + 756423;
        asc_2 asc_22 = new asc_2(byteBuffer, n, n3);
        int n4 = asc_22.f();
        this.b = new asg_2[n4];
        for (n2 = 0; n2 < n4; ++n2) {
            long l = asc_22.h();
            int n5 = asc_22.f();
            int n6 = asc_22.f();
            byte by = asc_22.b();
            this.b[n2] = new asg_2(l, n5, n6, by);
        }
        n2 = asc_22.b();
        this.c = new acn_2(n2);
        for (int k = 0; k < n2; ++k) {
            ash_2 ash_22 = ash_2.a(asc_22);
            this.c.a(ash_22.a, ash_22);
        }
        ByteBuffer byteBuffer2 = byteBuffer.slice();
        byteBuffer2.order(byteBuffer.order());
        this.e = new asc_2(byteBuffer2, n, n3);
    }

    public final String a() {
        return this.d;
    }

    private ash_2 a(String string) {
        return this.c.e(string);
    }

    final boolean a(long l, asu_2 asu_22) {
        try {
            asu_22.b();
            ash_2 ash_22 = this.c.e("id");
            if (ash_22.a(l) == 0) {
                a.warn((Object)("Pas de " + asu_22.getClass().getSimpleName() + " existant. id=" + l), (Throwable)new Exception());
                return false;
            }
            int n = ash_22.a(l, 0);
            this.a(this.b[n], asu_22);
            return true;
        }
        catch (Exception exception) {
            a.error((Object)("Probl\u00e8me  de lecture de " + asu_22.getClass().getSimpleName() + "id=" + l), (Throwable)exception);
            return false;
        }
    }

    private void a(asg_2 asg_22, asu_2 asu_22) {
        int n = asg_22.b;
        this.e.a(n, asg_22.d);
        asu_22.a(this.e);
        if ((long)(asg_22.c + n) != this.e.a()) {
            throw new Exception("Taille de donn\u00e9e incorrecte ");
        }
    }

    final <T extends asu_2> void a(T t, asb_2<T> asb_22) {
        for (asg_2 asg_22 : this.b) {
            t.b();
            this.a(asg_22, t);
            asb_22.load(t);
        }
    }

    final <T extends asu_2> void a(T t, String string, int n, asb_2<T> asb_22) {
        ash_2 ash_22 = this.a(string);
        int n2 = ash_22.a((long)n);
        for (int k = 0; k < n2; ++k) {
            try {
                int n3 = ash_22.a((long)n, k);
                asg_2 asg_22 = this.b[n3];
                t.b();
                this.a(asg_22, t);
                asb_22.load(t);
                continue;
            }
            catch (Exception exception) {
                a.error((Object)("Probl\u00e8me  de lecture de " + t.getClass().getSimpleName() + "id=" + n + "item num:" + k), (Throwable)exception);
            }
        }
    }

    public int b() {
        return this.b.length;
    }
}

