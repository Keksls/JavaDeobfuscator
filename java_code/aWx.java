/*
 * Decompiled with CFR 0.152.
 */
public class aWx
extends aXj {
    private static final byte a = 0;
    private static final byte b = 1;
    private static final byte c = 2;
    private final byte d;

    public aWx() {
        this.d = 0;
    }

    public aWx(boolean bl) {
        this.d = (byte)(bl ? 1 : 2);
    }

    public aWx(long l, boolean bl) {
        this.d = (byte)(bl ? 1 : 2);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)131);
        pt.b(this.d);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

