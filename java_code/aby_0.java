/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aby
 */
public class aby_0
extends abu {
    private static final Logger Y = Logger.getLogger(aby_0.class);
    protected aej_2 W = aej_2.b;
    protected boolean X;

    public aby_0() {
    }

    public aby_0(long l) {
        super(l);
    }

    public aby_0(long l, float f2, float f3) {
        super(l, f2, f3);
    }

    public aby_0(long l, float f2, float f3, float f4) {
        super(l, f2, f3, f4);
    }

    @Override
    protected final float Y() {
        return this.W == aej_2.b ? 1.0f : 0.0f;
    }

    @Override
    protected final float Z() {
        return this.W == aej_2.d ? 1.0f : 0.0f;
    }

    public void a(aej_2 aej_22) {
        if (aej_22 == null) {
            Y.error((Object)"Unable to set a Direction8 to null", (Throwable)new Exception());
            return;
        }
        if (this.W != aej_22) {
            this.W = aej_22;
            this.X = true;
        }
    }

    public aej_2 aC() {
        return this.W;
    }

    @Override
    protected String b(String string) {
        return this.l(string);
    }

    @Override
    protected boolean S() {
        return super.S() || this.X;
    }

    @Override
    protected void T() {
        super.T();
        this.X = false;
    }

    @Override
    public String P() {
        return this.l(this.F());
    }

    @Override
    public int j(String string) {
        if (Cz.f(string)) {
            return 0;
        }
        String string2 = this.l(string);
        return super.j(string2);
    }

    public boolean k(String string) {
        atd_2 atd_22 = this.an();
        if (atd_22 == null) {
            return false;
        }
        return atd_22.c(this.l(string));
    }

    public final String l(String string) {
        return aby_0.a(this.W.l, string, this.N());
    }

    public static String a(int n, String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append(n).append('_').append(string);
        if (string2 != null) {
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    @Override
    protected boolean U() {
        return super.U() || this.X;
    }
}

