/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class aVT
extends aXj {
    public static final byte a = 1;
    public static final byte b = 2;
    private final byte c;
    private final String[] d;

    public aVT(byte by, String ... stringArray) {
        this.c = by;
        this.d = new String[stringArray.length];
        System.arraycopy(stringArray, 0, this.d, 0, stringArray.length);
    }

    @Override
    public boolean a() {
        switch (this.c) {
            case 1: {
                return this.d.length == 1 || this.d.length == 2;
            }
            case 2: {
                return this.d.length == 1;
            }
        }
        return false;
    }

    @Override
    public void b() {
        switch (this.c) {
            case 1: {
                this.c();
                return;
            }
            case 2: {
                this.d();
                return;
            }
        }
        aVo.a().d("Commande " + this.c + " invalide!");
    }

    private void c() {
        int n = Integer.parseInt(this.d[0]);
        int n2 = this.d.length >= 2 ? Integer.parseInt(this.d[1]) : -1;
        Pt pt = new Pt();
        pt.a((short)414);
        pt.a((byte)3);
        pt.a(n);
        pt.a(n2);
        aaw_2 aaw_22 = azu_0.j().K();
        aaw_22.c(pt);
    }

    private void d() {
        int n = Integer.parseInt(this.d[0]);
        Pt pt = new Pt();
        pt.a((short)424);
        pt.a((byte)3);
        pt.a(n);
        aaw_2 aaw_22 = azu_0.j().K();
        aaw_22.c(pt);
    }

    public String toString() {
        return "ChaosCommand{m_cmd=" + this.c + ", m_args=" + (this.d == null ? null : Arrays.asList(this.d)) + "}";
    }
}

